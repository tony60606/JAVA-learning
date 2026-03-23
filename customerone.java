public class customerone {
  public static void main(String [] args) {
    drinkmenu menu = new drinkmenu() ;
    Order order = new Order() ;
    menu.showmenu() ;
    System.out.println("==========") ;
    int total = order.calculatetotal(2,false,4,menu) ;
    System.out.println("總金額" + total + "元") ;
  }
}