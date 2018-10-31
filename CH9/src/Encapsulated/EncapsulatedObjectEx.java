package Encapsulated;

public class EncapsulatedObjectEx {

    private static int id;

    public EncapsulatedObjectEx() {

    }

    public static void main(String[] args) {
        EncapsulatedObjectEx obj = new EncapsulatedObjectEx();
        id = 200;//direct access
        obj.myCar();
        obj.id = 500;//access through object
        System.out.println("ID: " + obj.id);

    }

    private void myCar() {
        System.out.println("My car is private");
    }
    
    void myPlane() {
        System.out.println("My Plane is default");
    }
    
    protected void myAxe() {
        System.out.println("My axe is protected");
    }

    public static int getId() {
        return id;
    }
    
}
