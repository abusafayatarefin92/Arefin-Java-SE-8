
import java.io.*;

public class Copy {

    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.out.println("Usage: java copy sourceFile targetFile");
            System.exit(1);
        }

        File sourceFile = new File(args[0]);

        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(2);
        }

        File targetFile = new File(args[1]);

        if (targetFile.exists()) {
            System.out.println("Target file " + args[1] + " already exists");
            System.exit(3);
        }

        try (
                BufferedInputStream input = new BufferedInputStream(new FileInputStream(sourceFile));
                BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(targetFile));) {
            int r, numberOfBitesCopied = 0;

            while ((r = input.read()) != -1) {
                output.write((byte) r);
                numberOfBitesCopied++;
            }

            System.out.println(numberOfBitesCopied + " bytes copied");
        }
    }
}
