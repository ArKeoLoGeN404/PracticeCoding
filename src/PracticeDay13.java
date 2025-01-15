import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PracticeDay13 {

    static int findGCD(int a, int b){

        int min = Math.min(a, b);

        for (int i = min; i >= 1; i--) {

            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {

        System.out.println(findGCD(9, 15));
    }
}
