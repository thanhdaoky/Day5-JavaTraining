package bus;

import java.util.ArrayList;

import dataManager.DAO;
import dto.Car;
import dto.Customer;

public class CarInfor {
  DAO m_DAO = new DAO();
  
  /**
   * User: Thanh Dao
   * Content:get information of cars in database
   * Date: Oct 16, 2018
   * @return list of car with information
   */
  public ArrayList<Car> getCarInfor() {
    ArrayList<Car> lstCar = new ArrayList<Car>();
    m_DAO.getCarData(lstCar);
    return lstCar;
  }
  
  /**
   * User: Thanh Dao
   * Date: Oct 16, 2018
   * Content: get information of the producer who sold the most car
   * @return
   */
  public String getBestSaler() {
    String bestSalerName;
    bestSalerName = m_DAO.getBestSaler();
    return bestSalerName;
  }
  
  /**
   * User: Thanh Dao
   * Date: Oct 16, 2018
   * Content: remove the orders in the years before
   * @return 
   */
  public String removeCanceledOrderLastYear() {
    String number = m_DAO.removeCanceledOrderLastYear();
    return number;
  }
  
  /**
   * User: Thanh Dao
   * Date: Oct 16, 2018
   * Content: get infor of customer that have status of the order is ordered
   * @param id
   * @return arraylist of customer
   */
  public ArrayList<Customer> getCustomer(int id){
    ArrayList<Customer> lst = new ArrayList<Customer>();
    lst = m_DAO.findCustomersHaveOrdered(id);
    return lst;
  }
}
