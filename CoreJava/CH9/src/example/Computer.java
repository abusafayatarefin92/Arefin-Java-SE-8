package example;


public class Computer {

    int serialNumber;
    String brand;

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public static void main(String[] args) {
        Computer computer1 = new Computer();

        computer1.setSerialNumber(123456);
        computer1.setBrand("hp");

        int x = computer1.getSerialNumber();
        String b = computer1.getBrand();

        System.out.println("Name: " + x);
        System.out.println("Brand: " + b);
    }
}
