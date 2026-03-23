public class drink {
  String name ;
  int bigprice ;
  int smallprice ;
  drink(String name , int smallprice , int bigprice) {
    this.name = name ;
    this.bigprice = bigprice ;
    this.smallprice = smallprice ;
  }
  void showinfo(int number) {
    System.out.println(number + "." + name + "大杯" + bigprice + "元| 小杯" + smallprice + "元") ;
  }
}