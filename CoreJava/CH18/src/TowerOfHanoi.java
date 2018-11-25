
import java.util.Scanner;

public class TowerOfHanoi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of disks: ");
        int n = input.nextInt();

        System.out.println("The movers are: ");

        moveDisk(n, 'A', 'B', 'C');
    }

    public static void moveDisk(int n, char fromTower, char toTower, char auxTower) {
        if (n == 1) {
            System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
        } else {
            moveDisk(n - 1, fromTower, auxTower, toTower);
            System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
            moveDisk(n - 1, auxTower, toTower, fromTower);
        }
    }
}
