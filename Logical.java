public class Logical {
  public static void main (String [] args) {
    int p1 = 200 ;
    int p2 = 100 ;
    int p3 = 300 ;  
    System.out.println("AND邏輯判斷：" + (p1>p2 && p2>p3)) ;
    System.out.println("OR邏輯判斷：" + (p1>p2 || p2>p3)) ;
    System.out.println("NOT邏輯判斷：" + (!(p1>p2 && p2>p3))) ;
    if (p1 < p2 && p3++ >= 500) {
      System.out.println("短路判斷AND："+ "True") ;
    }
    System.out.println(p3) ;
    if (p1-100 == p2 || p2++ > p3) {
      System.out.println("短路判斷OR：" + "True") ;
    }
    System.out.println(p2) ;
    if (p1 > p2 & p2++ >= p3) {
      System.out.println("非短路判斷AND：" + "True") ;
    }
    System.out.println(p2) ;
    if (p1 > p2 | p1++ >= p3) {
      System.out.println("非短路判斷OR：" + "True") ;
    }
    System.out.println(p1) ;
  }
}