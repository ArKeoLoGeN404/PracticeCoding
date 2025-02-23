import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PracticeDay24 {

    static void countWords(String str){

        Map<Character, Integer> chars = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {

            chars.put(str.charAt(i), chars.getOrDefault(str.charAt(i), 0) + 1);
        }

        System.out.println(chars);
    }

    static void iterateHashmap(){

        Map<String, String> map = new HashMap<>();
        map.put("test", "value 1");
        map.put("test2", "value 2");
        map.put("test3", "value 3");

        for (Map.Entry<String, String> entry : map.entrySet()){

            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    static void iterateHashmap2(){

        Map<String, String> map = new HashMap<>();
        map.put("test", "value 1");
        map.put("test2", "value 2");
        map.put("test3", "value 3");

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }


    public static void main(String[] args) {

        String s = "abcba";

//        iterateHashmap2();

        System.out.print(10 + 20 + "FTA" + " ");
        System.out.print("FTA" + 10 + 20);
    }
}
