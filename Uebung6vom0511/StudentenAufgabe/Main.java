package Uebung6vom0511.StudentenAufgabe;

import java.util.ArrayList;

public class Main {

    // Aufgabe 1: Alle Prüfungen mit Name, Semester, Note und Studentname ausgeben
    public static void allePrüfungenAusgeben(ArrayList<Student> studenten){
        studenten.forEach(student ->
                student.getPruefungen().forEach(prüfung ->
                                System.out.println("Student: " + student.getName() + ", Prüfung: " + prüfung)
                        )
                );
    }

    // Aufgabe 2: Alle Studenten eines bestimmten Studiengangs ausgeben
    public static void studentenNachStudiengangAusgeben(ArrayList<Student> studenten, String studiengang){
        studenten.stream()
                .filter(student -> student.getStudiengang().equals(studiengang))
                .forEach(System.out::println);
    }

    //Aufgabe 3: Notenschnitt jedes Studenten berechnen und ausgeben
    public static void notenschnittJederStudentAusgeben(ArrayList<Student> studenten){
        studenten.forEach(student ->
                System.out.println("Student: " + student.getName() + ", Notenschnitt: " + student.getNotendurchschnitt())
        );
    }

    // Aufgabe 4: Alle Studenten ausgeben, die eine Prüfung nicht bestanden haben
    public static void studentenMitNichtBestandenenPrüfungenAusgeben(ArrayList<Student> studenten){
        studenten.stream()
                .filter(student -> student.getPruefungen().stream().anyMatch(prüfung -> !prüfung.bestanden()))
                .forEach(System.out::println);
    }


    public static void main(String[] args) {
        ArrayList<Student> studenten = new ArrayList<>();
        ArrayList<Prüfung> prüfungen1 = new ArrayList<>();
        ArrayList<Prüfung> prüfungen2 = new ArrayList<>();


        Prüfung prüfung1 = new Prüfung("Mathe", 5,1, 3.0);
        Prüfung prüfung2 = new Prüfung("Physik", 4, 1, 5.0);
        prüfungen1.add(prüfung1);
        prüfungen1.add(prüfung2);

        Prüfung prüfung3 = new Prüfung("Mathe", 5,1, 2.0);
        Prüfung prüfung4 = new Prüfung("Physik", 4, 1, 4.0);
        prüfungen2.add(prüfung3);
        prüfungen2.add(prüfung4);

        Student student1 = new Student("Paula Schmitt", "Edingen", "IB", prüfungen1);
        Student student2 = new Student("Pia May", "Edingen", "IB", prüfungen2);
        studenten.add(student1);
        studenten.add(student2);


        allePrüfungenAusgeben(studenten);
        System.out.println(" ");
        studentenNachStudiengangAusgeben(studenten, "IB");
        System.out.println(" ");
        notenschnittJederStudentAusgeben(studenten);
        System.out.println(" ");
        studentenMitNichtBestandenenPrüfungenAusgeben(studenten);




    }
}
