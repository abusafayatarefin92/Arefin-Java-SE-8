
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileStream {

    public static void main(String[] args) throws IOException {
        try (
                FileOutputStream output = new FileOutputStream("temp.dat");) {
            for (int i = 1; i <= 10; i++) {
                output.write(i);
            }
            try (
                    FileInputStream input = new FileInputStream("temp.dat");) {
                int value;
                while ((value = input.read()) != -1) {
                    System.out.print(value + " ");
                }
            }

        }
    }
}
