import java.util.Stack;

public class PracticeDay23 {

    static String reverseWords(String str){

        String[] arr = str.split("\\.");
        StringBuilder sb = new StringBuilder();

        for (int i = arr.length - 1; i >= 0; i--){
            sb.append(arr[i]);
            sb.append(".");
        }
        return sb.toString();
    }

    static String reverseWords2(String str){

        String[] arr = str.split("\\.");
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (String s : arr){
            stack.push(s);
        }

        while (!stack.empty()){
            sb.append(stack.pop());
            sb.append(".");
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String str = "i.like.this.program.very.much";

        System.out.println(reverseWords2(str));
    }
}
