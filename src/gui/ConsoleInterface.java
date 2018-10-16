package gui;

import java.util.ArrayList;
import java.util.Scanner;

import bus.CarInfor;
import dto.Car;
import dto.Customer;

public class ConsoleInterface {
  CarInfor m_CarInfo = new CarInfor();
  Scanner input = new Scanner(System.in);
  
  public void showCarInfor() {
    ArrayList<Car> lst = m_CarInfo.getCarInfor();
    for(Car car: lst) {
    System.out.println(car.getsMaker()+ "\t"+ car.getsModel() + "\t"+car.getsDate()+"\t"+car.getsColor()+"\t" +car.getsNote());
    }
  }
  
  public void showBestSalerInfor() {
    String name = m_CarInfo.getBestSaler();
    System.out.println(name);
  }
  
  public void removeCanceledOrderLastYear() {
    if("".equals(m_CarInfo.removeCanceledOrderLastYear())){
      System.out.println("There is no order be removed");
    }else {
      System.out.println(m_CarInfo.removeCanceledOrderLastYear());
    }
  }
  
  public void findCustomer() {
    System.out.println("Nhap id khach hang: ");
    
    int id;
    id = input.nextInt();
    ArrayList<Customer> lst = m_CarInfo.getCustomer(id);
    for(Customer cus: lst) {
      System.out.println(cus.getsName() +"\t"+cus.getiOrderID()+"\t"+cus.getiAmount()+"\t"+cus.getsMaker());
    }
    
  }
  
  public void runInterface() {
    System.out.println("Chon chuc nang");
    System.out.println("Lay thong tin khach hang: 1");
    System.out.println("TIm thong tin nha san xuat ban duoc nhieu xe nhat: 2");
    System.out.println("Xoa bo cac don dat hang trong nhung nam truoc: 3");
    System.out.println("Tim thong tin khach hang da order: 4");
    int select = input.nextInt();
    switch(select) {
    case 1:
      showCarInfor();
      break;
    case 2:
      showBestSalerInfor();
      break;
    case 3:
      removeCanceledOrderLastYear();
      break;
    case 4: 
      findCustomer();
      break;
    }
  }
}
