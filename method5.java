public class method5 {
  static void check (int age) {
    if (age < 20 ) {
      System.out.println("您未滿20歲，禁止進入本場所") ;
    } else {
      System.out.println("您已滿20歲，將由專人來為您帶位") ;
    }
  }
  public static void main(String [] args) {
    System.out.println("歡迎來到XXX酒吧，將為您進行年齡檢測") ;
    check(32) ;
  }
}