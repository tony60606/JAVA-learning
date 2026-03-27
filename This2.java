public class This2 {
  String meat ;
  int price ;
  public This2 (String meat) {
    this(meat,195) ;
  }
  public This2 (String meat , int price) {
    this.meat = meat ;
    this.price = price ;
  }
  public void printInfo() {
    System.out.println(meat + "：每公斤/" + price + "元") ;
  }
  public static void main(String [] args) {
    This2 list1 = new This2("牛肉") ;
    This2 list2 = new This2("豬肉",100) ;
    list1.printInfo() ;
    list2.printInfo() ;
  }
}