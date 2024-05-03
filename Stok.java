
//import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Stok {
    private List<Kaart> kaarten;

    public Stok() {
        creeerStok();
    }

    public int getLength() {
        return kaarten.size();
    }

    public Kaart drawCard() {
        Collections.shuffle(kaarten);
        Kaart getrokkenKaart = kaarten.get(0);
        kaarten.remove(0);
        return getrokkenKaart;
    }

    // maak static: return stok
    private void creeerStok() {
        String[] waarde = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Boer", "Vrouw", "Koning", "Aas"
        };

        int[] score = {
                2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14
        };

        String[] type = {
                "Harten", "Klaveren", "Schoppen", "Ruiten"
        };

        this.kaarten = new ArrayList<Kaart>();
        for (int i = 0; i < type.length; i++) {
            for (int j = 0; j < waarde.length; j++) {
                this.kaarten.add(new Kaart(type[i], waarde[j], score[j]));
            }
        }
    }
}