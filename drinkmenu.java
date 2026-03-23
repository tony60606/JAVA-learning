public class drinkmenu {
  String[] drink = {"紅茶","綠茶","青茶","鮮奶茶","鮮奶綠"} ;
  int[] smalldrinkprice = {25,25,25,40,40} ;
  int[] bigdrinkprice = {30,30,30,50,50} ;
  String[] topping = {"波霸","珍珠","椰果","QQ","仙草凍","寒天"} ;
  int[] toppingprice = {10,10,10,15,15,20} ;
  void showmenu () {
    System.out.println("====飲料菜單====") ;
    for (int X = 0 ; X < drink.length ; X++) {
      System.out.println((X+1) + "." + drink[X] + "小杯" + smalldrinkprice[X] + "元  |大杯" + bigdrinkprice[X] + "元") ;
    }
    System.out.println("====加料區====") ;
    for (int Y = 0 ; Y < topping.length ; Y++) {
      System.out.println((Y+1) + "." + topping[Y] + toppingprice[Y] + "元") ;
    }
  }
}