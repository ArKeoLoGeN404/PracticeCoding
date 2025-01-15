public class PracticeDay20 {

    public static boolean checkAnagrams(String str1, String str2) {

        if (str1.length() != str2.length())
            return false;

        int[] freq = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            int freqIndex = c - 97;

            freq[freqIndex]++;

            char c2 = str2.charAt(i);
            int freqIndex2 = c2 - 97;

            freq[freqIndex2]--;
        }

//        for (int i = 0; i < str2.length(); i++) {
//            char c = str2.charAt(i);
//            int freqIndex = c - 97;
//
//            freq[freqIndex]--;
//        }

        for (int i = 0; i < freq.length; i++) {

            if (freq[i] != 0)
                return false;
        }
        return true;
    }


    public static void main(String[] args) {

        System.out.println(checkAnagrams("listen", "silent"));
        System.out.println(checkAnagrams("anagram", "nagaram"));
        System.out.println(checkAnagrams("car", "rat"));
    }
}
