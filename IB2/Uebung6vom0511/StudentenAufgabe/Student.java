package IB2.Uebung6vom0511.StudentenAufgabe;

import java.util.ArrayList;

public class Student {
    private String name;
    private String wohnort;
    private String studiengang;
    ArrayList<Prüfung> pruefungen;


    public Student(String name, String wohnort, String studiengang, ArrayList<Prüfung> pruefungen) {
        this.name = name;
        this.wohnort = wohnort;
        this.studiengang = studiengang;
        this.pruefungen = pruefungen;
    }

    public String getWohnort() {
        return wohnort;
    }

    public void setWohnort(String wohnort) {
        this.wohnort = wohnort;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudiengang() {
        return studiengang;
    }

    public void setStudiengang(String studiengang) {
        this.studiengang = studiengang;
    }

    public ArrayList<Prüfung> getPruefungen() {
        return pruefungen;
    }

    public void setPruefungen(ArrayList<Prüfung> pruefungen) {
        this.pruefungen = pruefungen;
    }

    public double getNotendurchschnitt(){
        return pruefungen.stream()
                .mapToDouble(Prüfung::getNote)
                .average()
                .orElse(0.0);

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studiengang='" + studiengang + '\'' +
                ", wohnort='" + wohnort + '\'' +
                ", prüfungen=" + pruefungen +
                '}';
    }
}

