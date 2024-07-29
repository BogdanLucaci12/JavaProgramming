package OOP;

import java.util.List;

public class VWConfigurator extends MasinaConfigurator{

    private String linieDeEchipare;
    private String motor;
    private String vopsea;
    private String roti;
    private String tapiterie;
    private List<String> dotariOptionale;
    private Double pretStandard;
    private Double pretFinal;
    public VWConfigurator(String model, String marca, Integer an,
                          String linieDeEchipare, String motor, String vopsea, String roti,
                          String tapiterie, List<String> dotariOptionale) {
        super(model, marca, an);
        this.linieDeEchipare=linieDeEchipare;
        this.motor=motor;
        this.vopsea=vopsea;
        this.roti=roti;
        this.tapiterie=tapiterie;
        this.dotariOptionale=dotariOptionale;
    }
    public void infoVW(){
        infoMasina();
        System.out.println("Linia de echipare este: " + linieDeEchipare);
        System.out.println("Masina este echipara cu un motor: "+motor);
        System.out.println("Vopseaua aleasa este: "+vopsea);
        System.out.println("Rotile sunt: " +roti);
        System.out.println("Tapiteria masinii: "+tapiterie);
        System.out.println("Dotarile masini sunt: ");
        for (Integer i=0; i<dotariOptionale.size(); i++){
            System.out.println(dotariOptionale.get(i));
        }
    }

    public String getLinieDeEchipare() {
        return linieDeEchipare;
    }

    public void setLinieDeEchipare(String linieDeEchipare) {
        this.linieDeEchipare = linieDeEchipare;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getVopsea() {
        return vopsea;
    }

    public void setVopsea(String vopsea) {
        this.vopsea = vopsea;
    }

    public String getRoti() {
        return roti;
    }

    public void setRoti(String roti) {
        this.roti = roti;
    }

    public String getTapiterie() {
        return tapiterie;
    }

    public void setTapiterie(String tapiterie) {
        this.tapiterie = tapiterie;
    }

    public List<String> getDotariOptionale() {
        return dotariOptionale;
    }

    public void setDotariOptionale(List<String> dotariOptionale) {
        this.dotariOptionale = dotariOptionale;
    }

    public Double getPretStandard() {
        return pretStandard;
    }

    public Double getPretFinal() {
        return pretFinal;
    }
}
