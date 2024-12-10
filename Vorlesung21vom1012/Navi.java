package Vorlesung21vom1012;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Navi {
    private static Map<String,Ort> orte = new HashMap<>();
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\ioana\\IdeaProjects\\PR2\\Vorlesung21vom1012\\orte.txt"));


        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] infos = line.split(",");

            String s1 = infos[0];
            String s2 = infos[1];

            Ort o1 = orte.get(s1);
            Ort o2 = orte.get(s2);

            if (o1 == null){
                o1 = new Ort(s1);
                orte.put(s1,o1);
            }

            if (o2 == null){
                o2 = new Ort(s2);
                orte.put(s2,o2);
            }

            int l = Integer.parseInt(infos[2]);

            Strasse s = new Strasse(o1, o2, l);
        } //while


        sc.close();

        System.out.println(orte.size() + " Orte angelegt.");

        System.out.println("Wir wollen von HD nach KL");
        System.out.println(orte.get("Heidelberg"));
        System.out.println(orte.get("Kaiserslautern"));

        System.out.println("Starte Navigation.");
        navigiere(orte.get("Heidelberg"), orte.get("Kaiserslautern"));

        System.out.println();
        System.out.println("Nach Navi-Methode:");
        System.out.println(orte.get("Heidelberg"));
        System.out.println(orte.get("Weinheim"));
        System.out.println(orte.get("Kaiserslautern"));
    }

    public static void navigiere (Ort start, Ort ziel){
        orte.values().forEach(o -> {
            if (o.getName().equals(start.getName()))
            {o.setEntfernung(0);}
            else
            {o.setEntfernung(Integer.MAX_VALUE);}
        });


        for(Strasse s : start.getStrassen()){
            Ort nachbar = s.getAndererOrt(start);
            nachbar.setEntfernung(s.getLaenge());

            navigiere(nachbar,ziel);
        }
    } //navigiere
}
