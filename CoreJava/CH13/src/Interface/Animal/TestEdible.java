package Interface.Animal;

public class TestEdible {

    public static void main(String[] args) {
        Object[] objects = {new Tiger(), new Chicken(), new Apple(), new Orange()};

        for (int i = 0; i < objects.length; i++) {
            if (objects[i] instanceof Edible) {
                System.out.println(((Edible) objects[i]).howToEat());
            }

            if (objects[i] instanceof Animal) {
                System.out.println(((Animal) objects[i]).sound());
            }
        }
        
        Animal t1 = new Tiger();
        Tiger t2 = new Tiger();
        Animal t3 = t2;
        
    }
}
