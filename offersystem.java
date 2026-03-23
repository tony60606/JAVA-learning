public class offersystem {
  public static void main (String [] args) {
    meal m1 = new meal ("蝦仁蛋炒飯",60,80) ;
    meal m2 = new meal ("綜合蛋包飯",60,80) ;
    meal m3 = new meal ("炒意麵",65,85) ;
    meal m4 = new meal ("炒烏龍",65,85) ;
    meal m5 = new meal ("肉燥飯",35,45) ;
    meal m6 = new meal ("牛肉燴飯",95,105) ;
    meal m7 = new meal ("豬肉燴飯",70,90) ;
    meal m8 = new meal ("排骨便當",55,75) ;
    meal m9 = new meal ("紅燒牛肉麵",95,105) ;
    meal m10 = new meal ("水餃",50,60) ;
    meal[] mealmenu = {m1,m2,m3,m4,m5,m6,m7,m8,m9,m10} ;
    System.out.println("歡迎光臨卡比餐廳") ;
    System.out.println("=====餐點菜單=====") ;
    for (int X = 0 ; X < mealmenu.length ; X++) {
      mealmenu[X].showinfo(X + 1) ;
    }
    drink d1 = new drink ("古早味紅茶",30,40) ;
    drink d2 = new drink ("玉露綠茶",30,40) ;
    drink d3 = new drink ("高山金萱",35,45) ;
    drink d4 = new drink ("紅萱烏龍",35,45) ;
    drink d5 = new drink ("多多綠",55,65) ;
    drink d6 = new drink ("玫瑰烏龍拿鐵",75,90) ;
    drink[] drinkmenu = {d1,d2,d3,d4,d5,d6} ;
    System.out.println("=====飲料菜單=====") ;
    for (int Y = 0 ; Y < drinkmenu.length ; Y++) {
      drinkmenu[Y].showinfo(Y + 1) ;
    }
    System.out.println("=====點餐明細=====") ;
    Ordersystem O1 = new Ordersystem(m4,true,"加沙茶",15,2,d4,false,5) ;
    Ordersystem O2 = new Ordersystem(m1,true,"加辣",15,2,d2,false,2) ;
    Ordersystem O3 = new Ordersystem(m6,false,"加辣",15,2,d1,true,1) ;
    Ordersystem O4 = new Ordersystem(m7,true,"加辣",15,2,d5,true,3) ;
    Ordersystem O5 = new Ordersystem(m10,false," ",0,2,d6,false,1) ;
    Ordersystem[] Orderitem = {O1,O2,O3,O4,O5} ;
    int total = 0 ;
    for (Ordersystem Order : Orderitem) {
      Order.showOrder() ;
      total += Order.subtotal1() + Order.subtotal2() ;
    }
    System.out.println("==========") ;
    System.out.println("今日消費總金額" + total + "元") ;
    if (total >= 500) {
      total = total * 9 /10 ;
      System.out.println("消費滿500，享9折優惠，折扣後金額為" + total + "元") ;
    }
  }
}