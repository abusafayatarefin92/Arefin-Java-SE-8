package example;


import Encapsulated.*;

public class Test2 extends EncapsulatedObjectEx {

    public static void main(String[] args) {
        Test2 obj = new Test2();

        //obj.id = 5000; private variable can not be accessed
        //obj.myCar();
        // obj.myPlane();
        obj.myAxe();
        obj.getId();
        System.out.println("Id: " + obj.getId());
    }
}
