
public class TestStake {
    public static void main(String[] args) {
        GenericStake<Sack> sacklist = new GenericStake<>();
        
        System.out.println("Now size: " + sacklist.getSize());
        sacklist.push(new Sack(100, "50 kg"));
        sacklist.push(new Sack(110, "60 kg"));
        sacklist.push(new Sack(120, "70 kg"));
        System.out.println("Size: " + sacklist.getSize());
        System.out.println("peek: " + sacklist.peek());
    }
}
