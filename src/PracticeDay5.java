public class PracticeDay5 {

    static int findSecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] < max  && arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 5, 2, 4, 5};

        System.out.println(findSecondLargest(nums));

    }
}
