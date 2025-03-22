package IB2.Uebung6vom0511.StudentenAufgabe;

public class Prüfung {
    private String name;
    private int etcsZahl;
    private int semester;
    private double note;

    public Prüfung(String name, int etcsZahl, int semester, double note) {
        this.name = name;
        this.etcsZahl = etcsZahl;
        this.semester = semester;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEtcsZahl() {
        return etcsZahl;
    }

    public void setEtcsZahl(int etcsZahl) {
        this.etcsZahl = etcsZahl;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Prüfung{" +
                "name='" + name + '\'' +
                ", semester=" + semester +
                ", note=" + note +
                ", note=" + note +
                '}';
    }

    public boolean bestanden(){
        return note <= 4.0;
    }
}
