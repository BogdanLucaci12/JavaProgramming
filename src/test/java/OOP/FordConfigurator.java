package OOP;

import java.util.List;
import java.util.Map;

public class FordConfigurator extends MasinaConfigurator{

    public Boolean electric;
    public Integer autonomie;
    public Double acceleratie;

    public String culoare;

    public Map<String, List<String>> altele;
    public FordConfigurator(String model, String marca, Integer an,
                            Boolean electric, Integer autonomie, Double acceleratie, String culoare, Map<String, List<String>> altele) {
        super(model, marca, an);
        this.electric=electric;
        this.autonomie=autonomie;
        this.acceleratie=acceleratie;
        this.culoare=culoare;
        this.altele=altele;
    }
    public void infoMasinaFord(){
        infoMasina();
        System.out.println("Autovehicul electric " + electric);
        System.out.println("Autonomia masinii este: " + autonomie + " km");
        System.out.println("Aceeleratie 0-100 se face in "+acceleratie + " sec.");
        System.out.println("Culoarea masinii este + " +culoare);
        System.out.println("altel optiunii ale masinii sunt: ");
        for(String key: altele.keySet()){
            System.out.println(" "+ key + ":");
            System.out.println(" " + altele.get(key));
        }
    }
}
