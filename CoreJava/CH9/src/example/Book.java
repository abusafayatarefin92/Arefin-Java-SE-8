package example;


public class Book {

    int id;
    String name;

    public Book() {
    }

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Book book1 = new Book(101, "Accounting");

        System.out.println("Id: " + book1.getId() + " Name: " + book1.getName());
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
