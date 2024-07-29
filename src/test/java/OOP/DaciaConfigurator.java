package OOP;

import java.util.List;

public class DaciaConfigurator extends MasinaConfigurator{

    private String versiune;
    private String motor;
    private String culoare;
    private String jante;
    private String interior;
    private List<String> echipamente;
    private List<String> accesori;
    private Double pretStandard;
    private Double pretFinal;

    public DaciaConfigurator(String model, String marca, Integer an,
    String versiune, String motor, String culoare, String jante, String interior, List<String> echipamente,
                             List<String> accesori) {
        super(model, marca, an);
        this.versiune=versiune;
        this.motor=motor;
        this.culoare=culoare;
        this.jante=jante;
        this.interior=interior;
        this.echipamente=echipamente;
        this.accesori=accesori;
    }
    public void infoDacia(){
        infoMasina();
        System.out.println("Versiunea masinii este: "+versiune);
        System.out.println("Motorul masinii este: " + motor);
        System.out.println("Culoarea masinii este: " + culoare);
        System.out.println("Jantele masiniii sunt: " + jante);
        System.out.println("Interiorul masinii este: "+ interior);

        System.out.println("Echipamentele masinii sunt:");
        for (Integer i=0; i< echipamente.size();i++){
            System.out.println(echipamente.get(i));
        }
        System.out.println("Accesoriile masinii sunt: ");
        for (Integer i=0; i< accesori.size();i++){
            System.out.println(accesori.get(i));
        }
        calculpretStandard();
        calculPretFinal();
    }
    //aplicam polimorfism dinamic
    public void pornesteMotor(){
        System.out.println("Masinia dacia pornesc de la motor");
    }

    //trebuie sa determinam pretul standard in functie de modelul masinii(Dacia si VW)
    public void calculpretStandard(){
        if(getModel().equals("Logan")){
            if(versiune.equals("Esential")){
                pretStandard=13.500;
            }
            if(versiune.equals("Expresion")){
                pretStandard=14.150;
            }
            if(versiune.equals("Journey")){
                pretStandard=15.200;
            }
            if(versiune.equals("Journey+")){
                pretStandard=15.700;
        }
        System.out.printf("Pretul standard este: %,.3f\n", pretStandard);//metoda de afisare nr cu multiple zecimale
                                                                        // \n command new line from string

    }
}
    public void calculPretFinal(){
        double pretOptiuni=0.000;

            if(getModel().equals("Logan")){
            if(versiune.equals("Esential")) {
                switch (culoare) {
                    case "Grey":
                        pretOptiuni += 0.460;//+= inseamna sa adaug la valoarea initiala inca o valoare
                        break;
                    case "White":
                        pretOptiuni += 0;
                        break;
                }
                switch (jante) {
                    case "Standard":
                        pretOptiuni += 2.250;
                        break;
                }
                switch (interior) {
                    case "Standard":
                        pretOptiuni += 0.220;
                        break;
                }
                for(Integer i=0;i<echipamente.size();i++){
                switch (echipamente.get(i)){
                    case "Pachet Techno":
                        pretOptiuni+= 0.552;
                        break;
                    case "Pachet Clima":
                        pretOptiuni+= 1.663;
                        break;
                    case "Pachet Parking":
                        pretOptiuni+=3.555;
                        break;
                }
            }
                for(Integer i=0;i<accesori.size();i++){
                    switch (accesori.get(i)){
                        case "Turbina":
                            pretOptiuni+= 0.785;
                            break;
                        case "Covorase":
                            pretOptiuni+= 10.663;
                            break;
                        case "Bluetooth":
                            pretOptiuni+=35.555;
                            break;
                        case "Scrumiera":
                            pretOptiuni+=7.555;
                            break;
                    }
            }
        }
        pretFinal=pretStandard+pretOptiuni;
        System.out.printf("Pretul final este: %,.3f\n", pretFinal);
    }
}

    public String getVersiune() {
        return versiune;
    }

    public void setVersiune(String versiune) {
        this.versiune = versiune;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getJante() {
        return jante;
    }

    public void setJante(String jante) {
        this.jante = jante;
    }

    public String getInterior() {
        return interior;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public List<String> getEchipamente() {
        return echipamente;
    }

    public void setEchipamente(List<String> echipamente) {
        this.echipamente = echipamente;
    }

    public List<String> getAccesori() {
        return accesori;
    }

    public void setAccesori(List<String> accesori) {
        this.accesori = accesori;
    }

    public Double getPretStandard() {
        return pretStandard;
    }

    public Double getPretFinal() {
        return pretFinal;
    }
}
