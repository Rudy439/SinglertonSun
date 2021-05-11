package sk.kosickaakademia.singlerton;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Sun {
    private static Sun instance = new Sun(); //musi byť staticka


       private Set<Planeta> planets;

       private Sun() {
           planets = new HashSet<>();
        }

    public static Sun getInstance(){
        return instance;
    }
    public void Sunplanet(Planeta p) {
    planets.add(p);
        /*ArrayList<String> planeta = new ArrayList<String>();
        System.out.println();*/
    }
    public void printAllPlannets(){
           for(Planeta p : planets)

        System.out.println(planets.getName());

    }


    }
