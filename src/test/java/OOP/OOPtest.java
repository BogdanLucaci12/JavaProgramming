package OOP;

import org.openqa.selenium.bidi.log.Log;
import org.testng.annotations.Test;

import java.util.*;

public class OOPtest {

    @Test
    public void testMetoda(){
        //dam o comanda de o masina Dacia
        List<String> echipamenteLogan = Arrays.asList("Pachet Techno", "Pachet Clima", "Pachet Parking");
        List<String> accesoriiLogan=Arrays.asList("Turbina", "Covorase", "Bluetooth", "Scrumiera");
        DaciaConfigurator Logan=new DaciaConfigurator("Logan", "Dacia", 2024,
                 "Esential", "TCe 90 MT6", "Grey", "Standard", "Standard",
                echipamenteLogan, accesoriiLogan);
        Logan.infoDacia();
        Logan.promotieDacia();
        Logan.promotieDacia(66565);
        Logan.promotieDacia("dsdsdsd");



//        System.out.println("====================");
//        List<String> dotariPassat=Arrays.asList("Pachet Comfort", "Trapa de sticla", "Suport pahare");
//        VWConfigurator Passat=new VWConfigurator("VolksWagen", "Passat", 2024,
//                "ccdf", "1.9TDI", "Alb", "Aliaj", "Portocalie", dotariPassat);
//        Passat.infoVW();
//        //1.Mai definesc o dacie si 2 VW
        //2.Mai aleg o marca de masina, fac o clasa si definesc 2 obiecte
//        System.out.println("======================");
//        Map<String, List<String>> optiuniFord=new HashMap<String, List<String>>(){{
//            put("optiuni", Arrays.asList("Puncte de fixare grila separare", "Jante aliaj 21", "Anvelope all-weather"));
//            put("Accesorii", Arrays.asList("Scrumiera", "Suport Pahare"));
//        }};
//        FordConfigurator Explorer=new FordConfigurator("Explorer", "Ford", 2024,
//                 true, 620, 6.2, "alb", optiuniFord);
//        Explorer.infoMasinaFord();


    }

}
