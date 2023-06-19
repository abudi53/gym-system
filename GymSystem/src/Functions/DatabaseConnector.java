package Functions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
    
        public static Connection GetConexion(){
        
        String url="jdbc:sqlserver://DESKTOP-0830UCL:1433;"
                    +"database=registro;"
                    +"user=sa;"
                    +"password=1234;"
                    +"TrustServerCertificate=True;";
        
        try{
            Connection con=DriverManager.getConnection(url);
            return con;
        
        } catch (SQLException e){
            System.out.println(e.toString());
            return null;
        }
        
    }
    
}
    

