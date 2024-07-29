package Obiect;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelefonTest {
        @Test
    public void metodaTest(){
            System.out.println("===TELEFON: Iphone15===");
            Map<String, String> iphone15Specificatii = new HashMap<>();
            iphone15Specificatii.put("Display", "15inch");
            iphone15Specificatii.put("Port", "Type-C");
            iphone15Specificatii.put("Sistem de operare ", "iOS");
            iphone15Specificatii.put("Numar Camere", "2");
            iphone15Specificatii.put("Tip display ", "Super Retina XDR");

            List<String> iphone15Accesorii=new ArrayList<>();
            iphone15Accesorii.add("Cablu de incarcare");
            iphone15Accesorii.add("Casti Wirelles");
            iphone15Accesorii.add("Incarcator priza EU");

            Telefon Iphone15=new Telefon("Apple", "Iphone15", "Purpuriu", "iOS"
                    , 3255, iphone15Specificatii, "325BG", iphone15Accesorii, false, "SAdasdad" );
        Iphone15.infoTelefon();

            System.out.println("===Telefon: Samsung S23====");
            Map<String, String> samsungS23Specificatii = new HashMap<>();
            samsungS23Specificatii.put("Display", "15inch");
            samsungS23Specificatii.put("Port", "Type-C");
            samsungS23Specificatii.put("Sistem de operare ", "iOS");
            samsungS23Specificatii.put("Numar Camere", "2");
            samsungS23Specificatii.put("Tip display ", "Super Retina XDR");

            List<String> samsungS23Accesorii=new ArrayList<>();
            samsungS23Accesorii.add("Telefonul S23");
            samsungS23Accesorii.add("Cablu de incarcare");
            samsungS23Accesorii.add("Casti Wirelles");
            samsungS23Accesorii.add("Incarcator priza EU");

            Telefon samsung=new Telefon("Samsung", "S23", "Alb", "Android"
                    , 7855, samsungS23Specificatii, "568GB", samsungS23Accesorii, false, "SAdasdad" );
            samsung.infoTelefon();
            System.out.println("============= Huawei Mate 9 Pro ==========");
            Map<String, String> huaweiSpecifactii = new HashMap<>();
            huaweiSpecifactii.put("Display", "15inch");
            huaweiSpecifactii.put("Port", "Type-C");
            huaweiSpecifactii.put("Sistem de operare ", "iOS");
            huaweiSpecifactii.put("Numar Camere", "2");
            huaweiSpecifactii.put("Tip display ", "Super Retina XDR");

            List<String> huaweiAccesorii=new ArrayList<>();
            huaweiAccesorii.add("Telefonul S23");
            huaweiAccesorii.add("Cablu de incarcare");
            huaweiAccesorii.add("Casti Wirelles");
            huaweiAccesorii.add("Incarcator priza EU");
            Telefon HuaweiPro=new Telefon("Huawei", "Mate9Pro", "Alb", "Android", 352522, huaweiSpecifactii, "524 GB", huaweiAccesorii, true, "Are urme moderate de uzura");
            HuaweiPro.infoTelefon();
        }

}
