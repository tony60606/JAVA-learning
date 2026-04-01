public class EncapsulationMessage {
  private String serviceName ;
  private int priceperhour ;
  public EncapsulationMessage (String serviceName , int priceperhour) {
    this.serviceName = serviceName ;
    this.priceperhour = priceperhour ;
  }
  public String getserviceName () {
    return serviceName ;
  }
  public int getpriceperhour() {
    return priceperhour ;
  }
  public void showInfo() {
    System.out.println("服務項目名稱：" +  serviceName + "-每小時  " + priceperhour + " 元") ;
  }
}
  