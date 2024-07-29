package TEMA;

import org.testng.annotations.Test;

public class Fruct {
    //proprietati, facem un @test, descriem 7 fructe
    public String nume;
    public String culoare;
    public Integer pret;
    public Float greutate;

    @Test
    public void metodaTest(){
descriereFruct("para", "verde", 325, 254.5f, false);
        descriereFruct("pepene", "rosu", 54, 24.5f, false);
        descriereFruct("pepene", "verde", 32, 54.5f, true);
        descriereFruct("mar", "galben", 4257, 254.5f, false);
        descriereFruct("kiwi", "castaniu", 325, 254.5f, true);
        descriereFruct("struguri", "verde", 25, 254.5f, false);
        descriereFruct("portocala", "galbena", 8325, 254.5f, true);
        descriereFruct("lime", "verde", 35, 254.5f, false);
    }

    public void descriereFruct(String nume, String culoare, Integer pret, Float greutate, Boolean comestibil){
       if (comestibil==true){
           System.out.println("Fructul " + nume + " de culoare " + culoare + "este comestibil");
       }
       else {
           System.out.println("Fructul " + nume + " de culoare " + culoare + " nu este comestibil");

       }
        System.out.println("Fructul " + nume + " are pretul " + pret + " si cantareste " + greutate);
    }
}
