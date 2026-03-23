public class offerone {
  public static void main (String [] args) {
    drinkoop d1 =  new drinkoop("紅茶",25,30) ;
    drinkoop d2 =  new drinkoop("綠茶",25,30) ;
    drinkoop d3 =  new drinkoop("青茶",25,30) ;
    drinkoop d4 =  new drinkoop("鮮奶茶",55,60) ;
    drinkoop d5 =  new drinkoop("鮮奶綠",55,60) ;
    drinkoop d6 =  new drinkoop("奶紅",40,50) ;  
    drinkoop d7 =  new drinkoop("奶綠",40,50) ; 
    drinkoop[] menu = {d1,d2,d3,d4,d5,d6,d7} ;
    System.out.println("=====飲料菜單=====") ;
    for (int X = 0 ; X < menu.length ; X++) {
      menu[X].showinfo(X + 1) ;
    }
    System.out.println("=====點餐明細=====") ;
    Orderoop Order1 = new Orderoop(d5 , true , "QQ" , 15 , 3) ;
    Orderoop Order2 = new Orderoop(d3 , true , "波霸" , 10 , 3) ;
    Orderoop Order3 = new Orderoop(d1 , false , " " , 0 , 4) ;
    Orderoop Order4 = new Orderoop(d2 , false , "寒天" , 20 , 2) ;
    Orderoop[] Orders = {Order1,Order2,Order3,Order4} ;
    int total = 0 ;
    for (Orderoop Order : Orders) {
      Order.showOrder() ;
      total += Order.subtotal() ;
    }
    System.out.println("==========") ;
    System.out.println("金額" + total + "元");
    if (total >= 500 ) {
      total = total * 85 / 100 ;
      System.out.println("消費滿500元享85折優惠，優惠金額為" + total + "元") ;
    }
  }
}