package utility;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {
    public static Connection getConnection(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");  
            con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","examly"); 
            return con;

        }catch(Exception e){
                e.printStackTrace();
        }
        return con;
    }
}