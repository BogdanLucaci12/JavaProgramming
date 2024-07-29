package variabilaMetoda;

import org.testng.annotations.Test;

public class Cursant {
//recunoastem o clasa intr-un fisier java dupa cuvantul cheie class
// Intr-un fiiser java putem avea o multime de clase pe care le diferentiem prin numele lor
    //nu este un practice bun in java sa avem intr-un fisier mai multe clase
    //in fiecare clasa trebuie sa definim un nume
    // intelegem printr-o clasa ca fiind un sablon specific din viata reala
    //intr-o clasa putem definii variabile si metode
    // variabila= proprietatea unei clase
    //intr-o clasa putem avea o multime de variabile
    //variabilele se diferentiaza prin tip si nume
    //variabilele pot sa fie de 2 feluri: globala si locala
    //variabila globala= prop vizibila oriunde in cod
    //variabila locala=prop vizibila doar in locul definit
    //tipuri de date: string, integer, double/float, character, boolean

    public String nume;
    public String prenume;
    public Integer varsta;
    public String adresa;
    public Double inaltime;
    public Float greutate;
    public Character sex;
    public Boolean areRestante;

    //metoda=actiunea unei clase
    //intr-o clasa putem avea o multime de metode diferentiate prin numele acestora
    //exista 2 tipuri de metode: void si return
    //metoda void = actiune pe care vrem sa o afisam/interpretam fara a fi nevoie sa o returnam
    //pentru o metoda trb sa specificam un acces control(public), (), si {}

    @Test
    public void metodaTest() {
        descrieCursant();
        primesteBursa();
    }

    public void primesteBursa(){
         Integer bursa=1000;
         System.out.println("Bursa cursantului este" + bursa);
    }

    public void descrieCursant(){
        nume = "Alex";
        prenume= "Bogdan";
        varsta = 25;
        adresa = "Strada.....";
        inaltime = 1.73;
        greutate = 6.7f;
        sex = 'm';
        areRestante= true;
        areRestante= false;
        System.out.println("Nume cursantului este: " + nume);//concatenare
        System.out.println("Prenumele cursantului este " + prenume);
        System.out.println("Varsta cursantului este " + varsta);
        System.out.println("adresa cursantului este "+ adresa);
        System.out.println("inaltime cursantului este " +inaltime);
        System.out.println("greutate cursantului este " +greutate);
        System.out.println("sexul cursantului este "+ sex);
        System.out.println("areRestante cursantului este " + areRestante);

    }
}