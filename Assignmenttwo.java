public class Assignmenttwo {
  public static void main (String [ ] args) { 
    int P1 = 150 ;
    int P2 = 100 ;
    int P3 = 180 ;
    int P4 = 200 ;
    int P5 = 60 ;
    int P6 = 75 ;
    int P7 = 480 ;
    int P8 = 360 ;
    int P9 = 120 ;
    int P10 = 500 ;
    int P11 = 420 ;
    int P12 = -10 ;
    System.out.println("P1：" + P1) ;
    System.out.println("P2：" + (P2+=15)) ;
    System.out.println("P3：" + (P3-=10)) ;
    System.out.println("P4：" + (P4*=3)) ;
    System.out.println("P5：" + (P5/=4)) ;
    System.out.println("P6：" + (P6%=8)) ;
    System.out.println("P7：" + (P7&=200));
    System.out.println("P8：" + (P8|=200));
    System.out.println("P9：" + (P9^=200));
    System.out.println("P10：" + (P10>>=3));
    System.out.println("P11：" + (P11<<=2));
    System.out.println("P12：" + (P12>>>=2));
  }
}