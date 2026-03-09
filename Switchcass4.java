public class Switchcass4 {
  public static void main (String [] args) {
    int 時段 = 17 ;
    int 時間 = 6 ;
    if (時段 >= 17  && 時段 <= 21) {
      switch (時段) {
        case 17 :  
          System.out.println("您預約的時間為晚上5點") ;
        break ;
        case 18 : 
          System.out.println("您預約的時間為晚上6點") ;
        break ;
        case 19 : 
          System.out.println("您預約的時間為晚上7點") ;
        break ;
        case 20 : 
          System.out.println("您預約的時間為晚上8點") ;
        break ;
        case 21 : 
          System.out.println("您預約的時間為晚上9點") ;
        break ;
      }
      switch (時間) {
        case 1 :
          System.out.println("您預約了一個小時") ; 
        break ;   
        case 2 :
          System.out.println("您預約了兩個小時") ;
        break ;
        case 3 :
          System.out.println("您預約了三個小時") ;
        break ;
        case 4 :
          System.out.println("您預約了四個小時") ;
        break ;
        default :
          System.out.println("不好意思，最多只能預約四個小時") ;
      }
    } else {
      System.out.println("預約時間為晚上5點到晚上9點") ;
    }
  }
}