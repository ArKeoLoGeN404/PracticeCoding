public class PracticeDay9 {

    static int findFactorial(int num){
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        return factorial;
    }

    static int findFactorialRecursive(int num){

        if (num == 0)
            return 1;

        return num * findFactorialRecursive(num - 1);
    }

    static String reverseString(String str){

        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }

    static String reverseStringRecursion(String str, int length){
        if (length < 1) {
            return "";
        }

        // Base case
        if (length == 1) {
            return String.valueOf(str.charAt(0));
        }

        return str.charAt(length - 1) + reverseStringRecursion(str, length - 1);
    }

    public static void main(String[] args) {

        String a = "abcde";
        System.out.println(reverseStringRecursion(a, a.length()));
    }
}
