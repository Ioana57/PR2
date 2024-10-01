package Vorlesung3vom0110;

public class Kunde {
    private String vorname;
    private String nachname;
    private String adresse;
    private String email;
    private long telefon;
    private String karteDaten;
    private Warenkorb warenkorb;

    public Kunde(String vorname, String nachname, String adresse, String email, long telefon, String karteDaten, Warenkorb warenkorb) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.adresse = adresse;
        this.email = email;
        this.telefon = telefon;
        this.karteDaten = karteDaten;
        this.warenkorb = warenkorb;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTelefon() {
        return telefon;
    }

    public void setTelefon(long telefon) {
        this.telefon = telefon;
    }

    public String getKarteDaten() {
        return karteDaten;
    }

    public void setKarteDaten(String karteDaten) {
        this.karteDaten = karteDaten;
    }

    public Warenkorb getWarenkorb() {
        return warenkorb;
    }

}



