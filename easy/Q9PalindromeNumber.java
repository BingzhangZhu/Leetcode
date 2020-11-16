package easy;

public class Q9PalindromeNumber {
    //方法1：
//    public boolean isPalindrome(int x) {
//        int exp = 0;
//        int num = 0;
//        int y = x;
//        int firstPart = 0;
//        int secondPart = 0;
//        int firstReverse = 0;
//        //计算输入数字长度
//        while(y>0){//如果还有大于0数字就一直循环
//            y/=10;//让num位数-1
//            exp++;//位数+1
//        }
//        //负数直接否
//        if(x<0){
//            return false;
//        }
//        //个位数直接ok
//        if(exp == 1){
//            return true;
//        }
//        //计算数字需要对比的位数
//        if(exp%2==0){
//            num = exp/2;
//            firstPart = x/(int)Math.pow(10,num);
//        } else {
//            num = (exp-1)/2;
//            firstPart = x/(int)Math.pow(10,num+1);
//        }
//        //Palindrome Number的前半部分翻转与后半部分比较
//        secondPart = x%(int)Math.pow(10,num);
//        for(int i=1; i<num+1; i++){
//            firstReverse += firstPart/(int)Math.pow(10,num-i) * (int)Math.pow(10,i-1);
//            firstPart = firstPart%(int)Math.pow(10,num-i);
//        }
//        //比较
//        System.out.println(firstReverse);
//        System.out.println(secondPart);
//        if(firstReverse != secondPart){
//            return false;
//        }
//        return true;
//    }

    //方法2：
    public boolean isPalindrome(int x) {

        //比较

        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Q9PalindromeNumber().isPalindrome(121));
    }
}
