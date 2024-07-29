package Obiect;

import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

public class Masina {
    public String marca;
    public String model;
    public String capacitateMotor;
    public List<String> dotari;
    public Integer pret;
    public Boolean stareTehnicaNou;
    public Map<String, String> motorizare;
    public String tipCaroserie;
    public String caiPutere;
    public String stareAutovehicul;

    public Masina(String marca, String model, String capacitateMotor, List<String> dotari, Integer pret, Boolean stareTehnicaNou, Map<String, String> motorizare, String tipCaroserie, String caiPutere, String stareAutovehicul) {
        this.marca = marca;
        this.model = model;
        this.capacitateMotor = capacitateMotor;
        this.dotari = dotari;
        this.pret = pret;
        this.stareTehnicaNou = stareTehnicaNou;
        this.motorizare = motorizare;
        this.tipCaroserie = tipCaroserie;
        this.caiPutere = caiPutere;
        this.stareAutovehicul = stareAutovehicul;
    }

    public void infoMasina(){

        System.out.println(marca + " " + model + " " + capacitateMotor + " " + tipCaroserie);
        System.out.println(capacitateMotor + " cm3" + marca + " " + model + " " + stareAutovehicul);
    for (Integer i=0;i<dotari.size(); i++){
        System.out.println("Dotarile acestei masini sunt urmatoarele: " + dotari.get(i));
    }
    for(String key: motorizare.keySet()){
        System.out.println(key + " " + motorizare.get(key));
    }
    }
}
