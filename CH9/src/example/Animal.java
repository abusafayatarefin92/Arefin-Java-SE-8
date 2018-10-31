package example;


//class is a blueprint of object
public class Animal extends Object {

    //Inside this all is this class's property
    //Animal object's state(noun, variable)
    //Instance variable / class level variable, also can imagine as global variable
    String name;
    String color;
    double age;
    String race;

    //default constructor has no arguments or parameters
    public Animal() {
    }

    //argumentative constructor
    public Animal(String name, String color, double age, String race) {
        //this means current instance
        this.name = name;
        this.color = color;
        this.age = age;
        this.race = race;
    }

    //Animal object's behavior(verb, mathod)
    void bite() {
        System.out.println("Animale can bite");
    }

    void eat() {
        System.out.println("Animale can eat");
    }

    void run() {
        System.out.println("Animale can run");
    }

    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal tommy = new Animal();
        //First animale is class reference
        //a1 is object name
        //= is operator
        //new is operator for creating object
        //Last animal is default constructor
        Animal jerry = new Animal();
        Animal animal500 = new Animal("Nova", "brown", 5.5, "Asian");

        System.out.println(animal500);

    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", color=" + color + ", age=" + age + ", race=" + race + '}';
    }

}
