package IB3.Binärbäume;

public class Main {
    public static void main(String[] args) {
        Baum baum = new Baum();
        baum.add(7);
        baum.add(9);
        baum.add(5);
        baum.add(0);
        baum.add(12);
        baum.add(8);
        baum.add(6);
        baum.add(13);
        //System.out.println(baum.toString());
        System.out.println("Baum Inorder:");
        baum.inorder();
        System.out.println("Baum Breitensuche:");
        baum.breitensuche();
    }
}
