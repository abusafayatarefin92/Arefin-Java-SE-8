package example;


public class Dog {

    String name;
    int age;
    String race;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();

        dog1.setName("Tommy");
        dog1.setAge(2);
        dog1.setRace("German Shefard");
        System.out.println("Name: " + dog1.getName() + " Age: " + dog1.getAge() + " Race: " + dog1.getRace());
    }
}
