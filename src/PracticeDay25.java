public class PracticeDay25 {

    static int secondHighestNo(int[] nums){

        int high = Integer.MIN_VALUE;
        int secondHigh = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > high){
                secondHigh = high;
                high = nums[i];
            } else if (nums[i] > secondHigh && nums[i] != high) {
                secondHigh = nums[i];
            }
        }
        return secondHigh;
    }

    static boolean isArmstrong(int num){
        int n = num;
        int digit = String.valueOf(n).length();
        int armstrong = 0;
        while (n > 0) {
            int i = n % 10;
            int cube = (int) Math.pow(i, digit);
            armstrong += cube;
            n /= 10;
        }
        return num == armstrong;
    }

    static String removeWhitespaces(String str){
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()){

            if (c != ' '){
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        int[] arr = {4, 3, 4, 4, 2, 1};

//        System.out.println(isArmstrong(1634));
        System.out.println(removeWhitespaces("An Armstrong number is a number"));
    }
}
