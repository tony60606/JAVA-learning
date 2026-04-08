import product.Product ;
import product.Fruit ;
import product.Meat ;
import product.Seafood ;

public class Supermarket {
  public static void main (String [] args) {
    Product[] item = {
      new Fruit ("蘋果" , 150) ,
      new Fruit ("大白柚" , 350) ,
      new Fruit ("大西瓜" , 650) ,
      new Meat ("牛肉" , 550) ,
      new Meat ("豬肉" , 450) ,
      new Meat ("雞腿肉" , 200) ,
      new Seafood ("章魚" , 500) ,
      new Seafood ("海膽" , 3000) ,
      new Seafood ("生蠔" , 6000) } ;
    double[] weight = {1.2 , 4.8 , 3.3 , 6.0 , 4.0 , 2.0 , 2.0 , 3.2 , 1.4} ;
    double total = 0 ;
    System.out.println("歡迎蒞臨卡比超市") ;
    for (int X = 0 ; X < item.length ; X++ ) {
      item[X].showInfo(weight[X]) ;
      double subtotal = item[X].countprice(weight[X]) ;
      System.out.println("購買重量：" + weight[X] + "公斤") ;
      System.out.println("小計：" + subtotal + "元") ;
      System.out.println("==============================");
      total += subtotal ;
    }
    System.out.println("總金額：" + total + "元") ;
  }
}