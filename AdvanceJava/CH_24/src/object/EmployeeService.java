
package object;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EmployeeService implements CommonDAO{
    Connection conn = DBConnection.getConnection("xe", "hr", "hr");

    @Override
    public List<?> getList() {
        List<Employees> list = new ArrayList<>();
        
        try {
            PreparedStatement ps = conn.prepareStatement("select * from employees");
            
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
    }

    @Override
    public void insert(Employees e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
