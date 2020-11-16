package easy;


//  Definition for singly-linked list.   // 单向链表，就是节点间只有一个方向，只能单向访问
class ListNode {
    int val; // 存储当前节点的值
    ListNode next;   // next存的是下一个节点，通过next方法访问下一个节点
    ListNode(int x) { val = x; } // 构造方法，别写成这样就不认识了~
}

public class Q21MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        /*
        l1 和 l2 任意一个为null，直接返回另个一个
        链表的题要尤其注意null
        链表末尾的标志也是null
        */
        if(l1==null) return l2;
        if(l2==null) return l1;

        ListNode head;  // 结果链表的头结点，先声明但不赋值
        if(l1.val<=l2.val){
            /*
            如果两个链表的第一个数 l1<=l2
            那么取l1的第一个结点作为head，
            l1 = l1.next 就是把l1指向l1后面那个结点，相当于向后移动
            */
            head = l1;
            l1 = l1.next;
        }else{
            head = l2;
            l2 = l2.next;
        }

        /*
        head 结点是链表的头结点，不能修改
        因为head是唯一一个能找到结果链表的指针/引用，如果修改，就找不到结果链表了
        声明p，作为在head指向的结果链表移动的指针
        */
        ListNode p = head;

        while( l1!=null && l2!=null ){
            if( l1.val <= l2.val ){
                /*
                如果l1和l2的当前值 l1<=l2
                把l1的当前节点添加到head链表：
                    p始终指向head的末尾结点，只要设置p.next 就可以往head上添加结点
                l1指针也向后移，指向后面那个结点
                因为p后有多了个l1的结点，p向后移动
                */
                p.next = l1;
                l1 = l1.next;
                p = p.next;
            }else{
                p.next = l2;
                l2 = l2.next;
                p = p.next;
            }
        }
        if(l1==null){
            /*
            循环结束后，如果是l1=null了，说明l1先遍历完了
            直接把l2剩余的结点都添加到head后面就行了
            */
            p.next = l2;
        }else{
            p.next = l1;
        }
        return head;
    }
}
