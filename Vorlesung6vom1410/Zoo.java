package Vorlesung6vom1410;

import java.util.ArrayList;

public class Zoo {
    ArrayList<Animal> tiere;
    ZooFactory zf;

    public Zoo(){
        zf = new ZooFactory();
        tiere = new ArrayList<>();
    }

    public void addTiere(String art, String name, int geburtsjahr){
        tiere.add(ZooFactory.zooFactory(art, name, geburtsjahr ));
    }
}
