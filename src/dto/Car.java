package dto;

public class Car {
  String sMaker;
  String sModel;
  String sDate;
  String sColor;
  String sNote;
  
  public Car(String sMaker, String sModel, String sDate, String sColor,
      String sNote) {
    super();
    this.sMaker = sMaker;
    this.sModel = sModel;
    this.sDate = sDate;
    this.sColor = sColor;
    this.sNote = sNote;
  }

  @Override
  public String toString() {
    return "Maker:" + this.sMaker + ", Model:" + this.sModel + ", Date:"
        + this.sDate + ", Color:" + this.sColor + ", Note:" + this.sNote
        + "";
  }
}
