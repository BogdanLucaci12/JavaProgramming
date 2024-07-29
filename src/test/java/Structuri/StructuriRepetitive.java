package Structuri;

import org.testng.annotations.Test;

public class StructuriRepetitive {
    //structuri repetitive=for, while, foreach
    @Test
    public void testMetod(){
//        afisarNrWhile();
    afiseazaNumere();
    }
    //afisam numerele pana 15
    public void afisareNrFor(){
        for (Integer index=0; index<=15; index++){
            System.out.println(index);
        }
    }
    public void afisarNrWhile(){
        Integer index=0;
        while (index<=15){
            System.out.println(index);
            index++;
        }
    }

    //afisam numerele pare de la 0 la 20

    public void afiseazaNumere(){
        for(Integer i=0;i<=20; i++){
            if (i%2==0){
                System.out.println(i + " este par");
            }
            else {
                System.out.println(i + " este impar");
            }
        }
    }
}
