public class PracticeDay6 {


    static void printFibonacci(int num){
        int first = 0, second = 1;
        for (int i = 0; i < num; i++) {
            System.out.println(first );

            int next = first + second;
            first = second;
            second = next;
        }

    }

//    TODO
    static void printFibonacciRecursion(int num){
        int first = 0, second = 1;

        if (num == 0 || num == 1){
            System.out.println(num);
            return;
        }

//        System.out.println(num + printFibonacciRecursion(num));

    }

    static boolean isPrime(int num){

        int count = 0;
        for (int i = 1; i <= Math.sqrt(num); i++) {

            if (num % i == 0)
                count++;
        }

        if (count > 1)
            return false;

        return true;
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            System.out.println(i + " : " + isPrime(i));
        }

        System.out.println("--");
        System.out.println(isPrime(1483));
    }
}
