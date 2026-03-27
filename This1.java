public class This1 {
  String Vegename ;
  int quantity ;
  int price ;
  public This1 (String Vegename , int quantity , int price) {
    this.Vegename = Vegename ;
    this.quantity = quantity ;
    this.price = price ;
  }
  public static void main (String [] args) {
    System.out.println("歡迎來到北海道超市") ;
    System.out.println("以下是您購買的商品") ;
    System.out.println("=================") ;
    int cost = 0 ;
    int total = 0 ;
    int X = 1 ;
    boolean card = true;
    This1[] markedprice = {
      new This1("白蘿蔔",2,60) ,
      new This1("紅蘿蔔",3,40) ,
      new This1("小白菜",5,25) ,
      new This1("青江菜",6,30) ,
      new This1("娃娃菜",10,25) ,
      new This1("地瓜",6,35) ,
      new This1("茄子",15,25) ,
      new This1("洋蔥",10,15) } ;
    for (This1 list : markedprice) {
      cost = list.quantity * list.price ;
      System.out.println((X++) + ".購買品項：" + list.Vegename + "，數量：" + list.quantity + "個，單價為：" + list.price + "元，小計" + cost + "元") ;
      total += cost ;
    }
    System.out.println("=================") ;
    System.out.println("您本次消費的總金額" + total + "元") ;
    if (card) {
      System.out.println("您使用信用卡付費") ;
    } else {
      System.out.println("您使用現金付款") ;
    }
    System.out.println("歡迎您再度光臨") ;
  }
}