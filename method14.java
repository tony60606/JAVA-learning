public class method14 {
  static int calculatePrice(int hour , int cost) {
    int total = hour * cost ;
    return total ;
  }
  static int calculatePrice(int hour , int cost , boolean firstmember) {
    int total = hour * cost ;
    if (firstmember) {
      return total * 9 / 10 ;
    }
    return total ;
  }
  public static void main (String [] args) {
    System.out.println(calculatePrice(4,800)) ;
    System.out.println("您實際花費金額：" + calculatePrice(3,2000,false)) ;
    System.out.println("您實際花費金額：" + calculatePrice(5,1600,true)) ;
  }
}
     