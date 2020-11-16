package easy;

public class Q14LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length ==0){
            return "";
        }
        String commonStr = "";
        String shortestStr = strs[0];
        //求字符串数组中最短字符串的长度
        for (int k=1; k<strs.length; k++){
            if(strs[k].length()<shortestStr.length()){
                shortestStr = strs[k];
            }
        }
        //寻找最长的相同字符串
        for (int i=0; i<shortestStr.length(); i++){
            for (int j=1; j<strs.length; j++){
                if( strs[j].charAt(i) != strs[0].charAt(i)){
                    return commonStr;
                }
            }
            commonStr += strs[0].charAt(i);
        }
        return commonStr;
    }

    public static void main(String[] args) {
        String str1 = "1";
        String str2 = "1";
        System.out.println(str1+str2);

    }
}
