package Structuri;

import org.testng.annotations.Test;

public class StructuriAlternative {
    //Structuri alternative: if...then...else../Switch..case

    @Test
    public void metodaTest(){
        //verificNrMaiMareV2(11);
        //verificNrMaiMareV2(8);
//        verificNrPar(7);
//        verificNrPar(6);
        zileSaptamana(2);
    }

    //verificam daca un numar este mai mare decat 10
    public void veriricNrMaiMare(){
        if(15>10){
            System.out.println("Numarul 15 ii mai mare ca 10");
        }
        else{
            System.out.println("Numarul 15 ii mai mare ca 10");
        }
    }

    //verificam daca un numar este mai mare decat 10 - V2
    public void verificNrMaiMareV2(Integer numar){

        if(numar>10){
            System.out.println("Numarul" + numar +  " ii mai mare ca 10");
        }
        else{
            System.out.println("Numarul" + numar +  " ii mai mic ca 10");
        }
    }
    //verificam daca un numar este par si pozitiv

    public void verificNrPar(Integer numar) {
        //daca vrem sa luam catul impartirii = /(divide)
        //daca vrem sa luam restul impartirii = %(modulo)
        if (numar>0) {
            if (numar % 2 == 0) {
                System.out.println("numarul este pozitiv" + numar + "si par");
            } else {
                System.out.println("numarul meu este poziti" + numar + "si impar");
            }
        }
        else if(numar<0){
            if (numar%2==0) {
                System.out.println("numarul este negativ" + numar + "si par");
            } else {
                System.out.println("numarul meu este negativ" + numar + "si impar");
            }
        }
        else {
            System.out.println("Numarul este egal cu" + numar);
        }
    }
    //definimi zilele saptamanii

    public void zileSaptamana(Integer zi){
        switch (zi){
            case 1:
                System.out.println("azi este luni");
                break;
            case 2:
                System.out.println("azi este marti");
                break;
            case 3:
                System.out.println("azi este miercuri");
                break;
            case 4:
                System.out.println("azi este joi");
                break;
            case 5:
                System.out.println("azi este vineri");
                break;
            default:
                System.out.println("Valoare nedefinita");
        }

    }
}
