public class PracticeDay21 {


    static boolean isPrime(int num){

        int divCount = 0;
        for (int i = 1; i <= num; i++){
            if (num % i == 0)
                divCount++;
        }

        return  (divCount == 2);
    }

    static boolean isPrimeOptimal(int num){

        int divCount = 0;
        for (int i = 1; i <= Math.sqrt(num); i++){
            if (num % i == 0)
                divCount++;
        }

        return  (divCount == 2);
    }


    public static void main(String[] args) {

        System.out.println(isPrimeOptimal(1483));
    }
}
