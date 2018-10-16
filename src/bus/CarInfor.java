package bus;

import java.util.ArrayList;

import dataManager.DAO;
import dto.Car;

public class CarInfor {
  DAO m_DAO = new DAO();
  
  /**
   * User: Thanh Dao
   * Content:get information of cars in database
   * Date: Oct 16, 2018
   * @return
   */
  public ArrayList<Car> getCarInfor() {
    ArrayList<Car> lstCar = new ArrayList<Car>();
    m_DAO.getCarData(lstCar);
    return lstCar;
  }
}
