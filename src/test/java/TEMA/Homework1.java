package TEMA;

import org.testng.annotations.Test;

public class Homework1 {

    @Test
    public void homework1(){


    }
    public void linia1(String hello){
        System.out.println(hello);
    }
    public void linia2 (Integer varsta){
        System.out.println("Varsta mea" + varsta);
    }
    public void linia3(String nume, String prenume){
        System.out.println(nume);
        System.out.println(prenume);
    }
    public void linia4(Character M){
        System.out.println("Salut" + M);
    }
    public void linia5(Character H){
        System.out.println(H+"Hello");
    }
    public  void linia6(String string){
        String vocale="aeiou";
    }
    //cream o logica pentru adaugarea stringului
    public  void linia7(String string){

    }
    public void linia8(String string){
        String prenume="Andrei";
        if(string==prenume){
            System.out.println("Salariul lui " + string + " este 3250");
        }else {
            System.out.println("Salariu confidential");
        }
    }
    public void linia9(String nume, String departament, String ID){
        String prenume="Popescu";

        if(prenume==nume){
            System.out.println(nume + " lucreaza pe departamentul " + departament + "avand un ID: " + ID);
        }
        else {
            System.out.println("Pentru " + nume + "departamentul si ID-ul sunt confidentiale");
        }
    }
    public void linia10(){
        //nu stiu la ce se refera
    }
    public void bonus(Integer numar1, Integer numar2, Integer numar3, Integer numar4, Integer numar5) {
        Integer rezultat = (numar1 + (numar2 * numar3) - numar4) / numar5;
        System.out.println("Rezultatul este: " + rezultat);
    }
}
