public class Arrays10 {
  public static void main (String [] args) {
    String[] 姓名 = {"大明","小明","大美","小美","小白"} ;
    int [][] 成績 = {{90,80,70,55,60},{70,40,50,90,100}} ;
    for (int i = 0 ; i < 姓名.length ; i++ ) {
      System.out.println("學生姓名" + 姓名[i] + "，語文成績" + 成績[0][i] + "分" + "，數學成績" + 成績[1][i] + "分" + "，本次成績平均為" + ((成績[0][i]+成績[1][i]) / 2) + "分") ;
      if ((成績[0][i]+成績[1][i]) / 2 < 75) {
        System.out.println(姓名[i] + "本次成績不及格") ;
      }
    }
  }
}