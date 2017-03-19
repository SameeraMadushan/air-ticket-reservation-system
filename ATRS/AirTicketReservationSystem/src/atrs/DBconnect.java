
package atrs;

import java.sql.*;
import javax.swing.JOptionPane;

public class DBconnect {
    Connection conn=null;
    public static Connection ConnectDB(){       
        try {
            Class.forName("com.mysql.jdbc.Driver");         
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/atrs","root","root");
            return conn;   
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}