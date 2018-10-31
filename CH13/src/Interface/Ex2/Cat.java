package Interface.Ex2;

public class Cat implements Animal {

    @Override
    public String eat() {
        return "Cat can eat";
    }

    @Override
    public String run() {
        return "Cat can run";
    }

}
