public class PracticeDay15 {

    static int countDigit(int num){
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    static int countDigit2(int num){

        return (int) (Math.log10(num) + 1);
    }

    static int reverseNumber(int num){
        int res = 0;

        while (num > 0) {
            int digit = num % 10;
            res = (res * 10) + digit ;
            num /= 10;
        }
        return res;
    }

    static boolean isPalindrome(int num){

        return num == reverseNumber(num);
    }

    static boolean armstrongNumber(int num){
        int n = num;
        double sum = 0;
        int count = countDigit(n);

        while (n > 0) {
            int digit = n % 10;
            sum = sum + Math.pow(digit, count) ;
            n /= 10;
        }
        return num == sum;
    }

    static void printRecursion(int n){

        if (n == 0)
            return;

        System.out.println(n);

        printRecursion(n - 1);
    }

    public static void main(String[] args) {

        int n = 12345;
//        System.out.println(armstrongNumber(153));

        printRecursion(5);
    }
}
