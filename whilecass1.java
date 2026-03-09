public class whilecass1 {
  public static void main (String [] args) {
    int 目前預約人數 = 1 ;
    while (目前預約人數 <= 10 ) {
      if (目前預約人數 < 10 ) {
        System.out.println("您好，感謝您的預約，您預約的號碼是"+ " " + 目前預約人數 + " " + "號" ) ;
      } else {
        System.out.println("非常感謝您，但本日預約人數已滿") ;
      }    
    目前預約人數++ ;
    }
  }
}