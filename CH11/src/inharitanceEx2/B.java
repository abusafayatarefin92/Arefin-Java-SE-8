
package inharitanceEx2;
//B class is inheriting A class, so A is Superclass and B is Subclass or A is parent class and B is child class.
public class B extends A{
   double salary;

    public B() {
    }

    public B(double salary) {
        this.salary = salary;
    }

    public B(double salary, int id, String name, String color) {
        super(id, name, color);
        this.salary = salary;
    }
    
}
