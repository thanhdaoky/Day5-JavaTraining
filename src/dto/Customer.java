package dto;

public class Customer {
  String sName;
  int iOrderID;
  int iAmount;
  String sMaker;
  /**
   * @param iID
   * @param sName
   * @param iOrderID
   * @param iAmount
   * @param sMaker
   */
  public Customer( String sName, int iOrderID, int iAmount, String sMaker) {
    super();
    this.sName = sName;
    this.iOrderID = iOrderID;
    this.iAmount = iAmount;
    this.sMaker = sMaker;
  }
  
  /**
   * @return the sName
   */
  public String getsName() {
    return sName;
  }
  /**
   * @param sName the sName to set
   */
  public void setsName(String sName) {
    this.sName = sName;
  }
  /**
   * @return the iOrderID
   */
  public int getiOrderID() {
    return iOrderID;
  }
  /**
   * @param iOrderID the iOrderID to set
   */
  public void setiOrderID(int iOrderID) {
    this.iOrderID = iOrderID;
  }
  /**
   * @return the iAmount
   */
  public int getiAmount() {
    return iAmount;
  }
  /**
   * @param iAmount the iAmount to set
   */
  public void setiAmount(int iAmount) {
    this.iAmount = iAmount;
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
}
