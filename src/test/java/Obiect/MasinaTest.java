package Obiect;

import org.testng.annotations.Test;

import java.util.*;

public class MasinaTest {
    @Test
    public void metodaTest(){
        System.out.println("===== Mercedes MLG =======");
        Map<String, String> mercedesMLGMotorizari= new HashMap<>();
        mercedesMLGMotorizari.put("Norma de poluare", "Euro 6");
        mercedesMLGMotorizari.put("Putere", "185 CP");
        mercedesMLGMotorizari.put("Transmisie", "4x4 automat");
        mercedesMLGMotorizari.put("Cutie de viteaza", "Automata");

        List<String> mercesMLGDotari = new ArrayList<>();
        Collections.addAll(mercesMLGDotari, "Android Auto", "Apple CarPlay", "Navigatie", "Camera spate", "Avertizare unghi mort", "Conducere autonoma");

        Masina mercedesMLG=new Masina("Mercedes", "MLG", "3000", mercesMLGDotari, 15000, true, mercedesMLGMotorizari, "Suv", "180", "nou");
        mercedesMLG.infoMasina();
    }
}
