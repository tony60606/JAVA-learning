import java.util.Arrays;
public class Arrays7 {
  public static void main (String [] args) {
    int [] 消費金額明細 = {2000,3500,10508,9043,4310,2286,3742,5064,3749,9527,10268} ;
    int 消費總額 = 0 ; 
    for (int X = 0 ; X < 消費金額明細.length ; X++) {
       消費總額 += 消費金額明細[X] ;
    }
    System.out.println("您好,您這個月總消費金額為" + 消費總額) ;
  }
}