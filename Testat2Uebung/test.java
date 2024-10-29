package Testat2Uebung;

public class test {
    public static void main(String[] args) {
        ente ente = new ente();

        ente.speak();
        ente.fliegen();
        ente.starten();
        ente.landen();

        tier tier = (tier) ente;
        tier.speak();

        tier tier2 = new tier();
        tier2.speak();

        if(tier2 instanceof ente){
        ente ente2 = (ente) tier2;
        ente2.speak();
        }else{
            System.out.println("Das Objekt ist keine ente");
        }
    }
}
