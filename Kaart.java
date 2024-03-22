public class Kaart {
    private String type;
    private String waarde;
    private int score;

    public Kaart(String type, String waarde, int score) {
        this.type = type;
        this.waarde = waarde;
        this.score = score;
    }

    public String getWaarde() {
        return waarde;
    }

    public void setWaarde(String waarde) {
        this.waarde = waarde;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
