public class Game {
    public void playGame() {
        // Beide spelers hebben een stok
        Stok mainDeck = new Stok();

        // Beide spelers hebben puntentelling
        int scoreP1 = 0;
        int scoreP2 = 0;

        while (mainDeck.getLength() != 0) {
            System.out.println(mainDeck.getLength());
            // Spelers pakken kaart
            Kaart cardP1 = mainDeck.drawCard();
            Kaart cardP2 = mainDeck.drawCard();

            if (cardP1.getScore() > cardP2.getScore()) {
                scoreP1 += 1;
                System.out.println("Player 1 won this round");
                System.out.println(String.format("Score player1, player2: %d:%d", scoreP1, scoreP2));
                continue;
            }

            if (cardP1.getScore() < cardP2.getScore()) {
                scoreP2 += 1;
                System.out.println("Player 2 won this round");
                System.out.println(String.format("Score player1, player2: %d:%d", scoreP1, scoreP2));
                continue;
            }
        }

        if (scoreP1 == scoreP2) {
            System.out.println("The game ended in a draw");
            return;
        }

        if (scoreP1 > scoreP2) {
            System.out.println("Winner of the cardgame is PLAYER 1!");
            return;
        }
        System.out.println("Winner of the cardgame is PLAYER 2!");
    }
}
