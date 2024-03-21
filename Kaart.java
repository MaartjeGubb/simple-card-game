public class Kaart {
    private String type;
    private int waarde;

    public Kaart(String type, int waarde) {
        this.type = type;
        this.waarde = waarde;
    }

    public int getWaarde() {
        return waarde;
    }

    public void setWaarde(int waarde) {
        this.waarde = waarde;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
