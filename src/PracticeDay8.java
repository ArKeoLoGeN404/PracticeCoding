public class PracticeDay8 {

    static boolean checkArmstrong(int num){

        int count = 0, armstrong = num;
        double res = 0;

        while (armstrong > 0){

            count++;
            armstrong /= 10;
        }

        armstrong = num;

        while (armstrong > 0){
            int remainder = armstrong % 10;
            res = res + Math.pow(remainder, count);
            armstrong /= 10;
        }

        return  res == num;
    }

    public static void main(String[] args) {

        System.out.println(checkArmstrong(10 ));
    }
}
