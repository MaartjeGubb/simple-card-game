public class Game {
    public void playGame() {
        // Beide spelers hebben een stok
        Stok deckP1 = new Stok();
        Stok deckP2 = new Stok();

        // Beide spelers hebben puntentelling
        int scoreP1 = 0;
        int scoreP2 = 0;

        while (deckP1.getLength() != 0) {

            // Spelers pakken kaart
            Kaart cardP1 = deckP1.drawCard();
            Kaart cardP2 = deckP2.drawCard();

            // vergelijk kaarten op basis van index?
            if (cardP1.getWaarde() > cardP2.getWaarde()) {
                scoreP1 += 1;
                continue;
            }

            if (cardP1.getWaarde() < cardP2.getWaarde()) {
                scoreP2 += 1;
                continue;
            }
        }

        if (scoreP1 > scoreP2) {
            System.out.println("Winner of the cardgame is PLAYER 1!");
            return;
        }
        System.out.println("Winner of the cardgame is PLAYER 2!");
    }
}
