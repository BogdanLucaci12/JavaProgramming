package Obiect;

import org.openqa.selenium.Keys;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Telefon {

    public String marca;
    public String sistemOperare;
    public Integer pret;
    public Map<String, String> specificatiiTehnice;

    public String memorie;
    public String model;
    public List<String> accesoriiIncluse;
    public String culoare;
    public Boolean produsResigilat;
    public String observatii;

    public Telefon(String marca, String model, String culoare ,String sistemOperare, Integer pret, Map<String, String> specificatiiTehnice, String memorie, List<String> accesoriiIncluse,
    Boolean produsResigilat, String observatii) {
        this.marca = marca;
        this.sistemOperare = sistemOperare;
        this.pret = pret;
        this.specificatiiTehnice = specificatiiTehnice;
        this.memorie = memorie;
        this.accesoriiIncluse = accesoriiIncluse;
        this.model=model;
        this.culoare=culoare;
        this.produsResigilat=produsResigilat;
        this.observatii=observatii;
    }
    public void infoTelefon(){
        System.out.println("Marca telefonului este " + marca);
        System.out.println("Modelul telefonului este " + model);
        System.out.println("Culoare telefonului este" + culoare);
        System.out.println("Memoria telefonului este " + memorie);
        System.out.println("Specificatiile telefonului sunt:");
        for(String key: specificatiiTehnice.keySet()){
            System.out.println(key + " " + specificatiiTehnice.get(key));
        }
        System.out.println("Accesoriile incluse sunt: ");
        for (Integer index=0; index<accesoriiIncluse.size(); index++){
            System.out.println(accesoriiIncluse.get(index));
        }
        if (produsResigilat){
            System.out.println(observatii);
        }
        else{
            System.out.println("produsul nu este resigilat");
        }
    }

}
