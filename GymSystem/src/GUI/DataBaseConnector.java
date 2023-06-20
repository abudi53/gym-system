package GUI;
    

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DataBaseConnector {
    
    public static Connection GetConexion(){
        
        String url="jdbc:mysql://localhost:3306/?user=root";
        String db = "database=sistema;";
        String user = "root";
        String pass = "111222888";
        try{
            Connection con=DriverManager.getConnection(url, user, pass);
            System.out.println("todo bien");
            return con;
            
            
            
        
        } catch (SQLException e){
            System.out.println(e.toString());
            return null;
        }
        
    }
    
}
