package Interface.Ex2;

public class Test {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();

        Cat cat = new Cat();
        cat.eat();

        Animal dog2 = new Dog();
        Animal cat2 = new Cat();
        Object o = new Dog();
        Animal doog = (Animal) o;

        Object[] objs = {new Dog(), new Cat(), new Eagle()};

        for (int i = 0; i < objs.length; i++) {
            if (objs[i] instanceof Animal) {
                System.out.println(((Animal) objs[i]).eat());
            }

            if (objs[i] instanceof Bird) {
                System.out.println(((Bird) objs[i]).fly());
            }
        }
    }

}
