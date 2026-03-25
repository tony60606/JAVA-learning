public class classmethodtwo {
  public void restaurant() {
    System.out.println("歡迎光臨OO餐廳") ;
  }
  public void set(int set) {
    switch (set) {
      case 1 :
        System.out.println("您點的是一號餐") ;
        System.out.println("餐點為烤雞醬堡、波浪薯條、中杯飲料") ;
      break ;
      case 2 :
        System.out.println("您點的是二號餐") ;
        System.out.println("餐點為卡拉雞腿堡、大熱狗、中杯飲料") ;
      break ;
      case 3 :
        System.out.println("您點的是三號餐") ;
        System.out.println("餐點為烤雞醬堡、卡拉雞腿、中杯飲料") ;
      break ;
      case 4 :
        System.out.println("您點的是四號餐") ;
        System.out.println("餐點為卡拉雞腿堡、雞翅兩支、中杯飲料") ;
      break ;
      default :
        System.out.println("您點的是五號餐") ;
        System.out.println("餐點為卡拉雞腿、雞翅兩支、中杯飲料") ;
      break ;
    }
  }
  public static void main (String [] args) {
    classmethodtwo Order = new classmethodtwo() ;
      Order.restaurant() ;
      Order.set(1) ;
      System.out.println("==========") ;
      Order.set(3) ;
  }
}