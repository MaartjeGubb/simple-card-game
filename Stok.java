import java.util.Random;

public class Stok {
    private Kaart[] kaartenInStok;

    public Stok() {
        creeerStok();
    }

    public Kaart drawCard() {
        int rand = new Random().nextInt(51);
        Kaart getrokkenKaart = kaartenInStok[rand];
        return getrokkenKaart;
    }

    private void creeerStok() {
        String[] waarde = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Boer", "Vrouw", "Koning", "Aas"
        };

        String[] type = {
                "Harten", "Klaveren", "Schoppen", "Ruiten"
        };

        int count = 0;
        kaartenInStok = new Kaart[waarde.length * type.length];
        for (int i = 0; i < type.length; i++) {
            for (int j = 0; j < waarde.length; j++) {
                kaartenInStok[count] = new Kaart(type[i], waarde[j]);
                count += 1;
            }
        }

    }

    public static void main(String[] args) {
        Stok deck = new Stok();
        Kaart kaartGetrokken = deck.drawCard();
        System.out.println(kaartGetrokken.getType());
        System.out.println(kaartGetrokken.getWaarde());
    }

}