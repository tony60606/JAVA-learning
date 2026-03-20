public class recursion {
  static int sum (int [] price , int index) {
    if (index == price.length ) {
      return  0 ; 
    }
    return price[index] + sum(price, index + 1) ;
  }
  public static void main (String [] args) {
    int[] price = {200,150,300,500,75} ;
    int total = sum(price,0) ;
    System.out.println("總金額" + total + "元") ;
  }
}