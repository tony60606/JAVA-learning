public class Switchcass {
  public static void main (String [] args) {
    int cost = 200 ;
    switch (cost) {
      case 100 :
       System.out.println("您點的餐點是檸檬蛋糕");
      break ;
      case 150 :
       System.out.println("您點的餐點是巴斯克蛋糕");
      break ;
      case 200 :
       System.out.println("您點的餐點是黑森林蛋糕");
      break ;
      default :
       System.out.println("您點的餐點是香菜肉桂捲");
    }
  }
}