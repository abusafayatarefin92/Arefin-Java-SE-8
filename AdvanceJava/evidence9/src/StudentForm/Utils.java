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
 * @author Safayat
 */
public class Utils {
    public static void writeToFile(String filename, List<Student> student) throws Exception{
        File dstfile = new File(filename + ".txt");
        
        try {
            if(dstfile.exists() == false){
                dstfile.createNewFile();
            }
            
            PrintWriter out = new PrintWriter(new FileWriter(dstfile, true));
            
            for(Student s : student){
                out.append(s.getId() + ", " + s.getName()+ ", " + s.getPass()+ ", " + s.getEmail()+ ", " + s.getAge()+ ", " + s.getGender()+ ", " + s.getHobby()+ ", " + s.getRound()+ ", " + s.getNote()+ "\n");
            }
            
            out.close();
        } catch (IOException e) {
            System.out.println("could not write");
        }
    }
    
    public static void reafFromFile(String filename, DefaultTableModel model){
        String line;
        BufferedReader reader;
        
        try {
            reader = new BufferedReader(new FileReader(filename + ".txt"));
            
            while((line = reader.readLine()) != null){
                model.addRow(line.split(", "));
            }
            
            reader.close();
        } catch (IOException e) {
            System.out.println("could not read");
        }
    }
}
