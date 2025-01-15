public class PracticeDay7 {

    static String filterString(String s){

        return s.toLowerCase()
                .trim()
                .replace(" ", "")
                .replaceAll("[^a-zA-Z0-9]", "");
    }
    static boolean checkPalindrome(String str){

        char[] chars = filterString(str).toCharArray();
        int low = 0, high = chars.length - 1;

        while (low < high){

            if (chars[low] != chars[high]) {
                return false;
            }
            low++;
            high--;
        }

        return true;
    }

    static boolean checkPalindrome(int num){

        if (num < 0)
            return false;

        int palindrome = num;
        int reverse = 0;

        while (palindrome != 0){

            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome /= 10;
        }

        return num == reverse;
    }

    public static void main(String[] args) {

        System.out.println(checkPalindrome("A man, a plan, a canal: Panama"));
//        System.out.println(checkPalindrome(121));
    }
}
