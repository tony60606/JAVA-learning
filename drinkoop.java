public class drinkoop {
  String name ; 
  int smallprice ;
  int bigprice ;
  drinkoop(String name , int smallprice , int bigprice) {
    this.name = name ;
    this.smallprice = smallprice ;
    this.bigprice = bigprice ;
  }
  void showinfo(int number) {
    System.out.println(number + "." + name + "小杯" + smallprice + "元 | 大杯" + bigprice + "元") ;
  }
}