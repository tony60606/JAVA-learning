public class meal {
  String name ;
  int largeprice ;
  int smallprice ;
  meal(String name , int smallprice , int largeprice ) {
    this.name = name ;
    this.largeprice = largeprice ;
    this.smallprice = smallprice ;
  }
  void showinfo(int number) {
    System.out.println(number + "." + name + "|大份 " + largeprice + "元|小份 " + smallprice + "元") ;
  }
}
    