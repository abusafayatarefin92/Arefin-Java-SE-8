package object;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {

    private static final String DRIVERNAME = "oracle.jdbc.driver.QracleDriver";
    private static final String HOST = "jdbc:oracle:thin:@localhost";
    private static final String PORT = "1521";
    private static Connection connection;
    private static String url = HOST + ":" + PORT + ":";

    public static Connection getConnection(String dbname, String dbUserName, String dbPass) {
        try {
            connection = DriverManager.getConnection(url + dbname, dbUserName, dbPass);

            System.out.println("::connected::");
        } catch (SQLException ex) {
            //ex.printStackTrace();
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

        return connection;
    }
}
