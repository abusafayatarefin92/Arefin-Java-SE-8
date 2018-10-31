package isAhasA;

public class Bike {

    private String color;
    private int maxSpeed;

    public void bikeinfo() {
        System.out.println("Bike color= " + color + " Max speed= " + maxSpeed);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

}
