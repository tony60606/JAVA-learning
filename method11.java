public class method11 {
  static int discount (String[] service , int[] hours , int[] cost) {
    int total = 0 ;
    int totalhours = 0 ;
    for (int i = 0 ; i < service.length ; i++) {
        int itemprice = hours[i] * cost[i] ;
        System.out.println("服務名稱：" + service[i]) ;
        System.out.println("購買時數：" + hours[i]) ;
        System.out.println("單價：" + cost[i]) ;
        System.out.println("金額：" + itemprice) ;
        total += itemprice ;
        totalhours += hours[i] ;
    }
    System.out.println("總時數" + totalhours + "小時") ;
    if(totalhours > 6) {
      total = (total * 9 / 10) * 85 /100 ;
      System.out.println("購買超過6小時,再享85折優惠") ;
    } else if (totalhours >= 3 && totalhours <= 6 ) {
      total = (total * 9 / 10) ;
      System.out.println("購買滿3小時,享9折優惠");
    } else {
      System.out.println("感謝本次購買") ;
    }
    return total ;
  }
  public static void main (String [] args) {
    String[] service = {"精油按摩","肩頸按摩","筋膜槍放鬆","痠痛諮詢"} ;
    int[] hours = {2,2,2,0} ;
    int[] cost = {600,600,450,300} ;
    int finalprice = discount(service , hours, cost) ;
    System.out.println("====================================") ;
    System.out.println("您本次消費的金額" + finalprice + "元") ;
  }
}