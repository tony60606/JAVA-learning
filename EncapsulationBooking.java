public class EncapsulationBooking {
  private String customername ;
  private EncapsulationMessage service ;
  private int hour ;
  private boolean member ; 
  private int bookingtime ;
  public EncapsulationBooking(String customername , EncapsulationMessage service , int hour , boolean member , int bookingtime) {
    this.customername = customername ;
    this.service = service ;
    sethour(hour) ;
    this.member = member ;
    setbookingtime(bookingtime) ;
  }
  public String customername() {
    return customername ;
  }
  public EncapsulationMessage getservice() {
    return service ;
  }
  public int gethour() {
    return hour ;
  }
  public boolean Member() {
    return member ;
  }
  public int getbookingtime() {
    return bookingtime ;
  }
  public void sethour(int hour) {
    if (hour >=1 && hour <= 6) {
      this.hour = hour ;
    } else {
      this.hour = 1 ;
      System.out.println("預約格式錯誤，會自動改為預約1小時") ;
    } 
  }
  public void setbookingtime(int bookingtime) {
    if (bookingtime >= 17 && bookingtime <= 21) {
      this.bookingtime = bookingtime ;
    } else {
      this.bookingtime = 17 ;
      System.out.println("預約格式錯誤，會自動改為17點") ;
    }
  }
  public int calculatPrice() {
    return service.getpriceperhour() * hour ;
  }
  public int calculatdiscountPrice() {
    int total = calculatPrice() ;
    if (hour > 3 ) {
       total = total * 9 / 10 ;
    }
    if (member) {
       total -= 100 ;
    }
    return total ;
  }
  public void showEncapsulationBookingInfo() {
    System.out.println("顧客姓名：" + customername) ;
    System.out.println("預約服務名稱：" + service.getserviceName()) ;
    System.out.println("預約時數：" + hour + "小時") ;
    System.out.println("預約時間：" + bookingtime + "點") ;
    System.out.println("是否為會員：" + (member ? "是" : "否")) ;
    System.out.println("原價" + calculatPrice() + "元") ;
    System.out.println("實際金額" + calculatdiscountPrice() + "元") ;
  }
}