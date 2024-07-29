package Obiect;

public class Sportiv {

    // Programarea orientata obiect se bazeaza pe interactiunea cu obiecte
    //obiect = instanta unei clase
    //putem definii un obiect doar daca avem un constructor
    //constructor = are ca rol sa initializeze atributele unei clase
    //intr-o clasa recunoastem un constructor dupa numele acesteia
    //constructorul este de cele mai mult ori public
    //intr-o clasa pot sa fie mai multi constructori diferentiati dupa numarul sau tipul de parametrii
    //intr-o clasa avem un constructor by default fara parametrii
    //in momentul cand se defineste un obiect se apeleaza constructorul din clasa
    //dintr-o clasa putem definii mai multe obiecte
    //obiectele se diferentiaza prin nume si valorile date
    //un obiect se instantiaza folosind  "new"
    //un obiect se poate definii in orice clasa din orice pachet
    //in momentul cand instantiem un obiect putem avea acces la toate variabilele/metodele din clasa
    public String nume;
    public String prenume;
    public Integer varsta;
    public String sex;
    public String sportPracticat;
    public Boolean teamEvent;

    //constructor


    public Sportiv(String nume, String prenume, Integer varsta, String sex, String sportPracticat, Boolean teamEvent) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.sex = sex;
        this.sportPracticat = sportPracticat;
        this.teamEvent = teamEvent;
    }

    public void prezentareSportiv (){
        System.out.println("numele sportivului este " + nume);
        System.out.println("Prenumele sportivului este " + prenume);
        System.out.println("Sexul sportivului este " + sex);
        System.out.println("Varsta sportivului este " + varsta);
        System.out.println("Sportul practicat este  "  + sportPracticat);
        System.out.println("Este un sportiv de echipa?  " + teamEvent);
    }

    public void verificareVarsta(Integer varsta){
        if(varsta<18){
            System.out.println("Sportivul este minor");
        }
        else {
            System.out.println("sportivul este major");
        }
    }


}
