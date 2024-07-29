package variabilaMetoda;

import org.testng.annotations.Test;

public class Masina {
    public String marca;
    public String model;
    public Float pret;
    public Integer an;
    public Boolean esteDecapotata;
    public  Double greutate;

    @Test
    public void metodaTest(){
        afisareMasina();
        System.out.println("===Exemplu 2===");
        afisareOriceMasina("hyundai", "ioniq", 257.5f, 2010, true, 254.0);
        afisareOriceMasina("bmw", "x", 25487.5f, 2010, false, 54.0);
    }

    //Descriem o masina
    public void afisareMasina(){
        marca="Mercedes";
        model="GLS";
        pret=2565.5f;
        an=2010;
        esteDecapotata=true;
        greutate=54.0;
        System.out.println("Marca masini este " + marca);
        System.out.println("Modelul masini este " + model);
        System.out.println("Greutatea masini este " + greutate);
        System.out.println("Pretul masini este" + pret);
        System.out.println("Este masina decapotata? " + esteDecapotata);
        System.out.println("Anul masini este " + an);
    }
    //Descriem orice masina

    public void afisareOriceMasina(String marca, String model, Float pret, Integer an, Boolean esteDecapotata, Double greutate){


        System.out.println("Marca masini este " + marca);
        System.out.println("Modelul masini este " + model);
        System.out.println("Greutatea masini este " + greutate);
        System.out.println("PRetul masini este" + pret);
        System.out.println("Este masina decapotata? " + esteDecapotata);
        System.out.println("Anul masini este " + an);
    }
}
