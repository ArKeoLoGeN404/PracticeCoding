public class PracticeDay3 {

    static int findFactorial(int num){

        if (num <= 1)
            return num;

        int factorial = 1;
        for (int i = num; i >= 1; i--) {
            factorial *= i;
        }
        return factorial;
    }

    static int findFactorialRecursive(int num){

        if (num <= 1) {
            return num;
        }else {
            return num * findFactorialRecursive(num - 1);
        }
    }

    public static void main(String[] args) {

        System.out.println(findFactorialRecursive(5));
    }
}
