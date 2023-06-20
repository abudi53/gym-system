package Functions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
    
        public static Connection GetConexion(){
        
        String url = "jdbc:mysql://localhost/sistema";
        String usuario = "usuario";
        String passowrd = "contrasena";
        
        try{
            
            Connection con=DriverManager.getConnection(url,usuario,passowrd);
            return con;
        
        } catch (SQLException e){
            System.out.println(e.toString());
            return null;
        }
        
    }
    
}
    

