package gui;

import java.util.ArrayList;

import bus.CarInfor;
import dto.Car;

public class ConsoleInterface {
  CarInfor m_CarInfo = new CarInfor();
  
  public void ShowCarInfor() {
    ArrayList<Car> lst = m_CarInfo.getCarInfor();
    for(Car car: lst) {
      car.toString();
    }
  }
}
