package Vorlesung12vom0411;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<String> namen = Arrays.asList("Hans", "Katarina", "Betty", "Klaus", "Katrin");
        namen.stream()
                .filter(n-> {
                    System.out.println(n + ", l= " + n.length());
                    return n.length()>=5;
                })
                //.mapToInt(String::length) //Ausgabe im Strom kann auch an anderes Typ haben
                .map(String::toUpperCase)  //forEach als nicht terminierende Operation
                /*.filter(n-> {
                    System.out.println(n + ", s = " + n.endsWith("S"));
                    return n.endsWith("S");
                })*/
                .forEach(n-> System.out.println(n));

        System.out.println("bla");
    }
}
