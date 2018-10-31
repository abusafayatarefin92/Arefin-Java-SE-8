
package inharitanceEx3;

public class B extends A{
    @Override
    public void sayHello() {
        System.out.println("Hi! I'm Zakir, I'm from B class");
    }
    
    public void sayHi() {
        super.sayHello();
        System.out.println("Hi! I'm Jubaiyer, I'm from B class");
    }
}
