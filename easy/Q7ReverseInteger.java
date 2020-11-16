package easy;

public class Q7ReverseInteger {
    public int reverse(int x) {
        if(x>(int)Math.pow(2,31)-1||x<-(int)Math.pow(2,31)+1||x==0){
            return 0;
        }
        int reversedX = 0;
        int judgementX = 0;
        while (x!=0){
            judgementX = reversedX;
            reversedX = reversedX*10+x%10;
            x/=10;
            if(judgementX != reversedX/10){
                return 0;
            }
        }
        return reversedX;
    }

    public static void main(String[] args) {
        System.out.println(new Q7ReverseInteger().reverse(1534236469));
        //
    }
}
