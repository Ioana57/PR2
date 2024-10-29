package Testat2Uebung;

 public class ente extends tier implements fliegbar {

     @Override
     public void speak(){
         System.out.println("I am a duck and I do mack mack.");
     }

     @Override
     public void starten() {
         System.out.println("I believe Im a flying duck.");
     }

     @Override
     public void fliegen() {
         System.out.println("I am a flying duck.");

     }

     @Override
     public void landen() {
         System.out.println("It's time to get back home.");
     }
 }
