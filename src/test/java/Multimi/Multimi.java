package Multimi;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Multimi {
    //mutlimi=array, list(arrayList),map
   @Test
    public void metodaTest(){
//afisareColegiArray();
//afisareColegiArrayList();
//obiecteMap();
       tariOrase();
    }
    //afisam numele colegilor de la curs
    public void afisareColegiArray(){
       String[] colegi=new String[7];
        colegi[0]="Larisa";
        colegi[1]="Bogdan";
        colegi[2]="Marius";
        colegi[3]="Daniel";
        colegi[4]="Corina";
        colegi[6]="Alex";
        for(Integer index=0;index<colegi.length; index++){
            System.out.println("numele cursantului din array este: " + colegi[index]);
        }
    }
    //afisam numele colegilor de la curs(arrayList)
    public void afisareColegiArrayList(){
        List<String> colegi=new ArrayList<>();
        colegi.add("Larisa");
        colegi.add("vlad");
        colegi.add("ana");
        colegi.add("Robert");
        colegi.add("Corina");
        for(Integer index=0;index<colegi.size(); index++){
            System.out.println("numele cursantului din arrayList este: " + colegi.get(index));
        }
    }
    //key-value
    public void obiecteMap() {
        Map<String, String> obiect = new HashMap<>();
        obiect.put("Fruct", "Mar");
        obiect.put("Masina", "Volvo");
        obiect.put("Telefon", "samsung");
        obiect.put("Floare", "Crizantema");
        for (String key : obiect.keySet()){
            System.out.println("Cheia este " + key);
            System.out.println("Valoarea este " +obiect.get(key));
        }
    }
    //afisam cateva tari cu orasele aferente
    public void tariOrase(){
       Map<String, List<String>> tari=new HashMap<>();

       List<String> oraseRomania=new ArrayList<>();
       oraseRomania.add("Bucuresti");
       oraseRomania.add("Cluj");
       oraseRomania.add("Craiova");
       oraseRomania.add("Iasi");
       List<String> oraseItalia=new ArrayList<>();
       oraseItalia.add("Milano");
       oraseItalia.add("Roma");
       oraseItalia.add("Verona");
       List<String> oraseSpania=new ArrayList<>();
       oraseSpania.add("Madrid");
       oraseSpania.add("Valencia");
       oraseSpania.add("Barcelona");
       tari.put("Romania", oraseRomania);
       tari.put("Italia", oraseItalia);
       tari.put("Spania", oraseSpania);
        for (String key : tari.keySet()){
            System.out.println("Tara este " + key);
            System.out.println("Orasele sunt " +tari.get(key));
        }
    }

}
