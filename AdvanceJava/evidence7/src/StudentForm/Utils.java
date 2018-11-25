/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentForm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Utils {
    public static void writeToFile(String fileName, List<Student> student) throws  Exception{
        File dstFile = new File(fileName + ".txt");
        
        try {
            if(dstFile.exists() == false){
                dstFile.createNewFile();
            }
            
            PrintWriter out = new PrintWriter(new FileWriter(dstFile, true));
            
            for(Student s : student){
                out.append(s.getId() + ", " + s.getName()+ ", " + s.getPass()+ ", " + s.getEmail()+ ", " + s.getAge()+ ", " + s.getGender()+ ", " + s.getHobby()+ ", " + s.getRound()+ ", " + s.getNote()+ "\n");
            }
            
            out.close();
        } catch (IOException e) {
            System.out.println("Could not write file");
        }
    }
    
    public static void readFromFile(String fileName, DefaultTableModel model){
        String line;
        BufferedReader reader;
        
        try {
            reader = new BufferedReader(new FileReader(fileName + ".txt"));
            
            while((line = reader.readLine()) != null){
                model.addRow(line.split(", "));
            }
            
            reader.close();
        } catch (IOException e) {
            System.out.println("Could nor read");
        }
    }
}
