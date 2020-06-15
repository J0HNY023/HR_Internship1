


import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

// okay na siguro tangalin ung ibang _db.java maliban dito

public class Chief_db {
    
    private static String servername = "localhost";
    private static String username = "root";
    
    public static String dbname = "chief_db";
    
    private static Integer portnumber = 3306;
    private static String password = "";
    private static String JdbcURL = "jdbc:mysql://localhost:3306/chief_db?"+"autoReconnect=true&useSSL=false";
     public static Connection getConnection()
    {
        Connection connect = null;
        
        MysqlDataSource data = new MysqlDataSource();
        
        data.setServerName(servername);
        data.setUser(username);
        data.setPassword(password);
        data.setDatabaseName(dbname);
        data.setPortNumber(portnumber);
        data.setURL(JdbcURL);
        
        try {
            connect = data.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger("Get Connection -> " + Chief_db.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connect;
        
    }
}


