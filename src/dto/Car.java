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

  /**
   * @return the sMaker
   */
  public String getsMaker() {
    return sMaker;
  }

  /**
   * @param sMaker the sMaker to set
   */
  public void setsMaker(String sMaker) {
    this.sMaker = sMaker;
  }

  /**
   * @return the sModel
   */
  public String getsModel() {
    return sModel;
  }

  /**
   * @param sModel the sModel to set
   */
  public void setsModel(String sModel) {
    this.sModel = sModel;
  }

  /**
   * @return the sDate
   */
  public String getsDate() {
    return sDate;
  }

  /**
   * @param sDate the sDate to set
   */
  public void setsDate(String sDate) {
    this.sDate = sDate;
  }

  /**
   * @return the sColor
   */
  public String getsColor() {
    return sColor;
  }

  /**
   * @param sColor the sColor to set
   */
  public void setsColor(String sColor) {
    this.sColor = sColor;
  }

  /**
   * @return the sNote
   */
  public String getsNote() {
    return sNote;
  }

  /**
   * @param sNote the sNote to set
   */
  public void setsNote(String sNote) {
    this.sNote = sNote;
  }

//  @Override
//  public String toString() {
//    return "Maker:" + this.sMaker + ", Model:" + this.sModel + ", Date:"
//        + this.sDate + ", Color:" + this.sColor + ", Note:" + this.sNote
//        + "";
//  }
}
