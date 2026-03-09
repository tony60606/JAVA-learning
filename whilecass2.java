public class whilecass2 {
  public static void main (String [] args) {
    int number = 32 ;
    int guess ;
    do { 
      guess =  (int)(Math.random()*101) ;
      System.out.println("猜數字：" + guess) ;
      if (guess != number) {
         System.out.println("猜錯囉，再猜一次吧~") ;
      }  
    }
    while (guess != number);
    System.out.println("猜對了!") ;
  }
}
      