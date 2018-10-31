package example;


public class Tree {

    String name;
    double age;

    public Tree() {
    }

    public Tree(String name, double age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Tree t1 = new Tree();
        Tree t2 = new Tree("Mango", 3.0);
        System.out.println(t2);
    }

    @Override
    public String toString() {
        return "Tree{" + "name=" + name + ", age=" + age + '}';
    }

}
