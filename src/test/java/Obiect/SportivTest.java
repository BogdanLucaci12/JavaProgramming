package Obiect;

import com.beust.ah.A;
import org.testng.annotations.Test;

public class SportivTest {
    @Test
    public void testMethod(){
        //instantiem un obiect de tipul sportiv

        Sportiv Ionut=new Sportiv("Popescu", "Ionut", 18,
                "M", "KickBox", true);
        Ionut.prezentareSportiv();
        Ionut.varsta=29;
        Ionut.sportPracticat="MMA";
        Ionut.prezentareSportiv();
        Ionut.verificareVarsta(Ionut.varsta);
        System.out.println("-----------");
        Sportiv Alin=new Sportiv("Marin", "Preda", 54, "M", "muayThai", false);
        Alin.prezentareSportiv();
        Alin.varsta=15;
        Alin.verificareVarsta(Alin.varsta);
    }

}
