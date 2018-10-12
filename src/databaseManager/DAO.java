package databaseManager;

import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Version: 
 * @author Thanh Dao
 * Create date: Oct 12, 2018
 * Modified date: Oct 12, 2018
 * Content: retrive data from database
 */
public class DAO {
    
    /**
     * User: Thanh Dao
     * Content:Get all data from CAR table except the IDs
     * Date: Oct 12, 2018
     * 
     */
    public void getCarData() {
        DBConnector db = new DBConnector();
        db.getConnection();
        if(db.conn != null) {
            Statement st = null;
            try {
                st = db.conn.createStatement();
                String query = "SELECT Maker, Model, Year, Color, Note "
                        + "FROM Car";
                ResultSet rs = st.executeQuery(query);
                while(rs.next()) {
                    String sMaker = rs.getString(1);
                    String sModel = rs.getString(2);
                    Date date = rs.getDate(3);
                    String sColor = rs.getString(4);
                    String sNote = rs.getString(5);
                    System.out.print(sMaker +" "+ sModel +" "
                            + date.toString() +" "+ sColor +" "+sNote);
                    System.out.println();
                }
                st.close();
                db.closeConnection();
            
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } 
        } 
    }
    
    /**
     * User: Thanh Dao
     * Content:get the maker who has sale the most cars
     * Date: Oct 12, 2018
     * 
     */
    public void getBestSaler() {
        DBConnector db = new DBConnector();
        db.getConnection();
        String query = "{call dbo.TheMostSalingThisYear(?)}";
        if(db.conn != null) {
            CallableStatement cst = null;
            try {               
                cst = db.conn.prepareCall(query);
                cst.registerOutParameter(1 , java.sql.Types.NVARCHAR);
                
            } catch (SQLException e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
    }  
}
