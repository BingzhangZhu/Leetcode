package easy;

public class Q66PlusOne {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1; i>-1; i--){
            if(digits[i] != 9){
                digits[i] += 1;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] result = new int[digits.length+1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Q66PlusOne().plusOne(new int[]{9,8,7,6,5,4,3,2,1,2}));
    }
}
