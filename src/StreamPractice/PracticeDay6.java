package StreamPractice;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class PracticeDay6 {


    public static void main(String[] args) {

        Runnable r = () -> System.out.println("hi");

        Consumer<String> c = s -> System.out.println(s);
        c.accept("hi");

        Supplier<String> supplier = () -> "hi hi";
        System.out.println(supplier.get());

        Function<String, Integer> f2 = s1 -> s1.length();

//        Runnable r2 = (String s) -> System.out.println("hi");
    }
}
