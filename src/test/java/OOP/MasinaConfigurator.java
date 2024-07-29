package OOP;

public class MasinaConfigurator {

    private String model;
    private String marca;
    private Integer an;
//    private Double pretStandard;
//    private Double pretFinal;

    public MasinaConfigurator(String model, String marca, Integer an ) {
        this.model = model;
        this.marca = marca;
        this.an = an;
    }

    //OOP-programare orientata pe obiect
    //OOP- 4 principii: mostenire, incapsulare, polimorfism, abstractizare
    //mostenirea: conceptul prin care o clasa mosteneste o alta clasa
    //clasa care este mostenita=Parinte
    //clasa care mosteneste=Copil
    //in java putem mosteni o singura clasa
    //cand copilul mosteneste parintele, copilul trebuie sa apeleze constructorul din parinte
    //copilul va avea acces la proprietatile/metodele din clasa parinte(daca se foloseste public/protected/default)
    //ca sa apelam constructorul din parinte in copil se foloseste keyword-ul super


    //incapsulare=conceptul prin care putem sa setam anumite restrictii de vizibilitate
    //pentru proprietati/metode

    //polimorfism=conceptul prin care o metoda poate avea implementari diferite
    //polimorfism 2 feluri dinamic(override) si static(overload)
    //polimorfism dinamic: intr-o ierarhie de clase obtinute prin mostenire o metoda poate avea implementari diferite
    //polimorfism dinamic este prezent doar la mostenire
    //polimorfism static: daca avem nevoie ca o metoda sa fie folosita in diferite circumstante putem definii mai multe metode cu acelasi nume avand numar de parametrii/tip parametrii diferiti

    public void infoMasina(){
        System.out.println("Marca masinii este: "+ marca);
        System.out.println("Modelul masinii este: " + model);
        System.out.println("An constructie masin: " + an);
    }

    //polimorfism dinamic
    public void pornesteMotor(){
        System.out.println("masina se porneste cu ajt cheii");
    }

    //polimorfism static
    public void promotieDacia(){
        System.out.println("Pentru luna iulis, dacia nu are promotie");
    }
    public void promotieDacia(String tichet){
        System.out.println("Pentru luna martie, dacia  are promotie cu tichet rabla" + tichet);
    }
    public void promotieDacia(Integer reducere){
        System.out.println("Pentru luna ianuarie, dacia  are promotie" + reducere);
    }

    public String getModel() {
        return model;
    }

    public String getMarca() {
        return marca;
    }

    public Integer getAn() {
        return an;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAn(Integer an) {
        this.an = an;
    }
}
