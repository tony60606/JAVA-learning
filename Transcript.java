public class Transcript {
  public static void main (String [ ] args) {
    String 姓名 = "王大明" ;
    int studentID = 123 ;
    double 國文成績 = 65.85 ;
    double 數學成績 = 75.00 ;
    double 英文成績 = 92.65 ;
    double 總成績 = 國文成績+數學成績+英文成績 ;
    double 平均成績 = 總成績 / 3 ;
    char 評第 = 'C' ;
    String 勉勵 = "有待加強" ;
    System.out.println("學生姓名："+姓名) ; 
    System.out.println("學號："+studentID) ;
    System.out.println("國文："+國文成績) ; 
    System.out.println("英文："+英文成績) ; 
    System.out.println("數學："+數學成績) ; 
    System.out.println("總成績："+總成績) ; 
    System.out.println("平均成績："+平均成績) ;  
    System.out.println("評第："+評第) ; 
    System.out.println("勉勵："+勉勵) ;
  }
}