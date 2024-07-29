package TEMA;

import org.testng.annotations.Test;

import java.util.Arrays;

public class Homework2 {
    @Test
    public void mainTest(){
        //afisamDA();
        //afisamNr1Panala3();
    //showTheHighestNumber();
    //afisamCelMaiMicNr();
       // afisamParSiImpar();
        afisamDoarPare();
    }
    public void afisamDA(){
        String da="DA";
        for(Integer i=1; i<6; i++){
            System.out.print(da);
            if (i < 5) {
                System.out.print(" ");
            }
        }
    }
    public void afisamNr1Panala3(){
        for (Integer i=0;i<4;i++){
            System.out.println(i);
        }
    }
    public void showTheHighestNumber(){
        Integer min=15;
        Integer max=20;
        if (min<max){
            System.out.println(max);
        }
    }
    public void afisamCelMaiMicNr(){
        Double min=3.25;
        Double max=4.5;
        if(min<max){
            System.out.println(min);
        }
    }
    public void afisamParSiImpar(){
        for(Integer i=0;i<11; i++){
            if(i%2==0){
                System.out.println("numarul " + i + " este par");
            }else {
                System.out.println("numarul " + i+" este impar");
            }
        }
    }
    public void afisamDoarPare(){
        for (Integer i=0; i<11; i++){
            if(i%2==0){
                System.out.println("Numerele pare sun " +i);
            }
        }
    }

}
