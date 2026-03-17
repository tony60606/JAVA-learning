public class method3 {
  static void 價目表 (String 產品名稱 , int 價格 ) {
    System.out.println("產品名稱：" + 產品名稱) ;
    System.out.println("本產品價格為" + 價格 + "元") ;
  }
  public static void main (String [] args) {
    System.out.println("歡迎蒞臨卡比之星，本店價目表如下：") ;
    價目表("卡比之星小車車",150) ;
    價目表("卡比之星小夜燈",3000) ;
    價目表("卡比之星資料夾",60) ;
    價目表("卡比之星-探索發現",1350) ;
    價目表("卡比之星盲盒",350) ;
  }
}