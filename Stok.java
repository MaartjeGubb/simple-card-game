import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Stok {
    private List<Kaart> kaartenInStok;

    public private void creeerStok() {
        kaartenInStok = new ArrayList<>();

        String[] waarde = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Boer", "Vrouw", "Koning", "Aas"
        };

        String[] type = {
                "harten", "klaveren", "schoppen", "ruiten"
        };

    }

    public static String drawCard() {
        Random random = new Random();
        String kaartWaarde = waarde[random.nextInt(waarde.length)];
        String kaartType = type[random.nextInt(type.length)];

        Kaart kaart = new Kaart(kaartType, kaartWaarde);

        System.out.println(kaart);
        return kaartType;
    }
}