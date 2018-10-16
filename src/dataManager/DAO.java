package dataManager;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.Statement;

/**
 * Version:
 * 
 * @author Thanh Dao 
 * Date: Oct 12, 2018 
 * Modified date: Oct 12, 2018
 * Content: manage data from database
 */
public class DAO {
  // DBConnector db = new DBConnector();
  static String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
  static String userName = "";
  static String passWord = "";
  static String URL = "jdbc:sqlserver://localhost" + ";"
      + "databaseName=ThanhDaoKy_SQL_Final_Test;integratedSecurity=true;";

  Connection conn = null;

  /**
   * User: Thanh Dao 
   * Content:get connection to database Date: Oct 12, 2018
   * @return
   */
  public Connection getConnection() {
    try {
      Class.forName(DRIVER);
      conn = DriverManager.getConnection(URL, userName, passWord);
    } catch (ClassNotFoundException e1) {
      e1.printStackTrace();
      return null;
    } catch (SQLException e2) {
      e2.printStackTrace();
      return null;
    }
    return conn;
  }

  /**
   * User: Thanh Dao Content: close current connection Date: Oct 12, 2018
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

  /**
   * User: Thanh Dao 
   * Content:Get all data from CAR table except the IDs Date: Oct
   * 12, 2018
   */
public void getCarData() {
  this.getConnection();
  if (this.conn != null) {
    Statement st = null;
    try {
      st = this.conn.createStatement();
      String query = "SELECT Maker, Model, Year, Color, Note " + "FROM Car";
      ResultSet rs = st.executeQuery(query);
      while (rs.next()) {
        String sMaker = rs.getString(1);
        String sModel = rs.getString(2);
        Date date = rs.getDate(3);
        String sColor = rs.getString(4);
        String sNote = rs.getString(5);
      }
      st.close();
      this.closeConnection();

    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}

  /**
   * User: Thanh Dao 
   * Content:get the maker who has sale the most cars Date: Oct
   * 12, 2018 
   */
public void getBestSaler() {
  this.getConnection();
  String query = "{?=call dbo.TheMostSalingThisYear()}";
  if (this.conn != null) {
    CallableStatement cst = null;
    try {
      cst = this.conn.prepareCall(query);
      cst.registerOutParameter(1, java.sql.Types.NVARCHAR);
      cst.executeUpdate();
      cst.close();
      this.closeConnection();
    } catch (SQLFeatureNotSupportedException e1) {
      e1.printStackTrace();
    } catch (SQLException e) {
      // TODO: handle exception
      e.printStackTrace();
    }
  }
}

  /**
     * User: Thanh Dao
     * Date: 
     * Content: 
     */
public void removeCanceledOrderLastYear() {
  this.getConnection();
  String query = "{call removeCanceledOrderLastYear(?)}";
  if (this.conn != null) {
    CallableStatement cst = null;
    try {
      cst = this.conn.prepareCall(query);
      cst.registerOutParameter(1, java.sql.Types.VARCHAR);
      cst.executeUpdate();
      String msg = cst.getString(1);
      cst.close();
      this.closeConnection();
      // System.out.println();
    } catch (SQLException e) {
      // TODO: handle exception
      e.printStackTrace();
    }
  }
}

public void findCustomersHaveOrdered(int id) {
  this.getConnection();
  String query = "{call findCustomersHaveOrdered(?,?,?,?,?)}";
  if (conn != null) {
    CallableStatement cst = null;
    try {
      cst = conn.prepareCall(query);
      cst.setInt(1, id);
      cst.registerOutParameter(2, java.sql.Types.VARCHAR);
      cst.registerOutParameter(3, java.sql.Types.INTEGER);
      cst.registerOutParameter(4, java.sql.Types.INTEGER);
      cst.registerOutParameter(5, java.sql.Types.VARCHAR);
      ResultSet rs = cst.executeQuery();

      while (rs.next()) {
        String msg2 = rs.getNString(1);
        int msg3 = rs.getInt(2);
        int msg4 = rs.getInt(3);
        String msg5 = rs.getNString(4);
      }

      cst.close();
      closeConnection();
      // System.out.println();
    } catch (SQLException e) {
      // TODO: handle exception
      e.printStackTrace();
    }
  }
}
}
