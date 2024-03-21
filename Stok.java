import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Stok {
    private List<Kaart> kaarten;
    private int length = 52;

    public Stok() {
        creeerStok();
    }

    public int getLength() {
        return this.length;
    }

    // Misschien beter om shuffle te doen en dan de bovenste te pakken
    // length is eigenlijk kaarten.size()??
    public Kaart drawCard() {
        int rand = new Random().nextInt(this.length);
        Kaart getrokkenKaart = kaarten.get(rand);
        kaarten.remove(rand);
        this.length -= 1;
        return getrokkenKaart;
    }

    private void creeerStok() {
        // WIP even ints van gemaakt voor de eerste versie
        int[] waarde = {
                2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14
        };

        String[] type = {
                "Harten", "Klaveren", "Schoppen", "Ruiten"
        };

        this.kaarten = new ArrayList<Kaart>();
        for (int i = 0; i < type.length; i++) {
            for (int j = 0; j < waarde.length; j++) {
                this.kaarten.add(new Kaart(type[i], waarde[j]));
            }
        }

    }
}