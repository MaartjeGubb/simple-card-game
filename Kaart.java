public class Kaart {
    private String type;
    private String waarde;

    public Kaart(String type, String waarde) {
        this.type = type;
        this.waarde = waarde;
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

}
