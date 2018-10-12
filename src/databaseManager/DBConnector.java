package databaseManager;

import java.sql.*;

/**
 * Version: 1.0
 * @author Thanh Dao
 * Create date: Oct 12, 2018
 * Modified date: Oct 12, 2018
 * Content: Manage connection to database
 */
public class DBConnector {
    
    /**
     * Attributes
     */
    static String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static String userName = "";
    static String passWord = "";
    static String URL = "jdbc:sqlserver://localhost"
            + ";databaseName=ThanhDaoKy_SQL_Final_Test;integratedSecurity=true;";
    
    Connection conn = null; 
    /**
     * User: Thanh Dao
     * Content:get connection to database
     * Date: Oct 12, 2018
     * 
     * @return 
     */
    public Connection getConnection() {
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, userName, passWord);
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
            return null;
        }catch(SQLException e2) {
            e2.printStackTrace();
            return null;
        }
        return conn;
    }
    
    /**
     * User: Thanh Dao
     * Content: close current connection
     * Date: Oct 12, 2018
     * 
     */
    public void closeConnection() {
        try {
            conn.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
