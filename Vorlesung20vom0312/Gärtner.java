package Vorlesung20vom0312;

public class Gärtner {
    public static void main(String[] args) {
        Baum b = new Baum();
        b.insert(17);
        b.insert(21);
        b.insert(13);

        b.insert(7);

        b.insert(30);
        b.insert(0);
        //b.insert (0);
        b.insert(-1);
        b.insert(-3);
        b.insert(9);
        b.insert(15);

        b.inorderTraversierung();
    }
}
