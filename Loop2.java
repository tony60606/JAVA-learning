public class Loop2 { 
  public static void main (String [] args) {
    int layer = 10 ;
    for (int a = 1 ; a <= layer ; a++) {
      for (int b = 1 ; b <= layer - a ; b++) {
        System.out.print(" ") ;
      }
      for (int c = 1 ; c <= 2 * a -1 ; c++) {
        System.out.print(a % 10) ;
      }
    System.out.println() ;
    }
  }
}