import java.util.Arrays;

public class PracticeDay22 {


    static boolean isPalindrome(String str){

        String filteredStr = filterString(str);
        int start = 0, end = filteredStr.length() - 1;

        while (start <= end){
            if (filteredStr.charAt(start) != filteredStr.charAt(end))
                return false;

            start++;
            end--;
        }
        return true;
    }

    static String filterString(String s){

        return s.toLowerCase()
                .trim()
                .replace(" ", "")
                .replaceAll("[^a-zA-Z0-9]", "");
    }
    
    static String reverseString(String str){
        
        char[] ch = str.toCharArray();
        int start = 0, end = ch.length - 1;

        while (start < end) {
            swap(ch, start, end);
            start++;
            end--;
        }

        return Arrays.toString(ch);
    }

    static void swap(char[] arr, int a, int b){
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {

//        System.out.println(reverseString("abcde"));
//        final int i;
//        i = 20;
//        int j = i+20;
//        i = j+30;
//        System.out.println(i + " " + j);

    }
}
