package example;


//constructor and getter base
public class ClassRoom {

    int id;
    String location;

    public ClassRoom() {
    }

    public ClassRoom(int id, String location) {
        this.id = id;
        this.location = location;
    }

    public static void main(String[] args) {
        ClassRoom classRoom1 = new ClassRoom(302, "4th floor");
        System.out.println("Id: " + classRoom1.getId() + " location: " + classRoom1.getLocation());
    }

    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

}
