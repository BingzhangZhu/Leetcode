package easy;

import java.util.HashMap;
import java.util.Map;

public class Q13RomantoInteger {
    public int romanToInt(String s) {
        int result = 0;
        Map<String,Integer> map = new HashMap<>();
        {
            map.put("I",1);
            map.put("V",5);
            map.put("X",10);
            map.put("L",50);
            map.put("C",100);
            map.put("D",500);
            map.put("M",1000);
            map.put("IV",4);
            map.put("IX",9);
            map.put("XL",40);
            map.put("XC",90);
            map.put("CD",400);
            map.put("CM",900);
        }
        if(s.length()==1){
            result = map.get(Character.toString(s.charAt(0)));
        } else {
            for(int i=0; i<s.length()-1; i++){
                if(map.get(Character.toString(s.charAt(i)))<map.get(Character.toString(s.charAt(i+1)))){
                    result += map.get(Character.toString(s.charAt(i))+Character.toString(s.charAt(i+1)));
                    i++;
                } else {
                    result += map.get(Character.toString(s.charAt(i)));
                }
            }
            if(!(map.get(Character.toString(s.charAt(s.length()-2)))<map.get(Character.toString(s.charAt(s.length()-1))))){
                result += map.get(Character.toString(s.charAt(s.length()-1)));
            }
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(new Q13RomantoInteger().romanToInt("D"));
    }
}
