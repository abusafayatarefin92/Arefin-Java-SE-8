package StudentForm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Utils {

    public static void writeToFile(String fileName, List<Student> student) throws Exception {
        File dstFile = new File(fileName + ".txt");

        try {
            if (dstFile.exists() == false) {
                System.out.println("We have to create a new file");
                dstFile.createNewFile();
            }

            PrintWriter output = new PrintWriter(new FileWriter(dstFile, true));

            for (Student s : student) {
                output.append(s.getId() + ", " + s.getName() + ", " + s.getPass() + ", " + s.getEmail() + ", " + s.getAge() + ", " + s.getGender() + ", " + s.getHobby() + ", " + s.getRound() + ", " + s.getMessage() + "\n");

            }

            output.close();
        } catch (Exception e) {
            System.out.println("Could not log");
        }
    }

    public static void readDataFromFile(String fileName, DefaultTableModel model) {
        String line;
        BufferedReader reader;

        try {
            reader = new BufferedReader(new FileReader(fileName + ".txt"));

            while ((line = reader.readLine()) != null) {
                model.addRow(line.split(", "));
            }

            reader.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Buffer Reader issue");
        }
    }
}
