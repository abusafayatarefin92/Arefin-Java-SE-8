
public class Sack {
    private final int serial;
    private final String weight;

    public Sack(int serial, String weight) {
        this.serial = serial;
        this.weight = weight;
    }

    public int getSerial() {
        return serial;
    }

    public String getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Sack{" + "serial=" + serial + ", weight=" + weight + '}';
    }
    
    
}
