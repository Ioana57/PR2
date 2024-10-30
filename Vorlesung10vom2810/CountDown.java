package Vorlesung10vom2810;

public class CountDown {
    Aufgabe a;

    public static void main (String[] args){
        new CountDown();
    }

    public CountDown(){
        a = s -> {
            System.out.println(s);
            if (s>0)
                this.a.zähleRunter(s-1);
        };
    }
}

interface Aufgabe{
    public void zähleRunter (int start);
}
