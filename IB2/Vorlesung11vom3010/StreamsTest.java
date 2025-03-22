package IB2.Vorlesung11vom3010;

import java.util.stream.IntStream;

public class StreamsTest {
    public static void main(String[] args) {
        //IntStream.rangeClosed(1, 50).forEach(System.out::println); //1 bis 50
        //IntStream.range(1, 50).forEach(System.out::println); //von 1 bis 49

        //String geht nicht, weil Strings immutable sind
        final StringBuilder sb = new StringBuilder();
        IntStream.rangeClosed(1,10).forEach(i -> sb.append("*"));
        System.out.println(sb.toString());

        IntStream.iterate(2,i -> i+2).limit(50).forEach(System.out::print); //von 2 bis 100 in 2er Schritte
    }
}
