package IB3.TreeSet;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> namen = new TreeSet<>();

        namen.add("Ana");
        namen.add("Mike");
        System.out.println(namen);

        for (String s : namen) {
            System.out.println(s);
        }

    }

}
