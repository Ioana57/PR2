package IB2.Testat2Uebung;

public class test {
    public static void main(String[] args) {
        /*ente ente = new ente();
        tier ente3 = new ente();

        ente.speak();
        ente.fliegen();
        ente.starten();
        ente.landen();
        ente3.speak();

        tier tier = (tier) ente;
        tier.speak();

        tier tier2 = new tier();
        tier2.speak();

        if(tier2 instanceof ente){
        ente ente2 = (ente) tier2;
        ente2.speak();
        }else{
            System.out.println("Das Objekt ist keine ente");
        }*/

        tier tier = new hund();
        hund hund = (IB2.Testat2Uebung.hund) tier;
        hund.belle();

        IB2.Testat2Uebung.hund hund2 = new hund();
        IB2.Testat2Uebung.tier tier2 = (IB2.Testat2Uebung.tier) hund2;
        tier2.speak();
    }
}
