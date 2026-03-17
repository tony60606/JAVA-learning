public class method4 {
  static void examform(String suject , int time) {
    System.out.println("考試科目" + suject) ;
    System.out.println("考試時間" + time + "分鐘") ;
  }
  public static void main (String [] args) {
    System.out.println("長O高級中學商科期末考考程表如下") ;
    System.out.println("2026/03/17") ;
    System.out.println("第一堂(8:30~10:00)") ;
    examform("國文",90) ;
    System.out.println("休息時間") ;
    System.out.println("第二堂(10:40~12:10)") ;
    examform("英文",90) ;
    System.out.println("午休時間") ;
    System.out.println("第一堂(13:30~15:00)") ;
    examform("數學",90) ;
    System.out.println("2026/03/18") ;
    System.out.println("第一堂(8:30~10:00)") ;
    examform("商業概論",90) ;
    System.out.println("休息時間") ;
    System.out.println("第二堂(10:40~12:10)") ;
    examform("計算機概論",90) ;
    System.out.println("2026/03/19") ;
    System.out.println("第一堂(8:30~10:00)") ;
    examform("會計學",90) ;
    System.out.println("休息時間") ;
    System.out.println("第二堂(10:40~12:10)") ;
    examform("經濟學",90) ;
  }
}