import java.util.Arrays ;
public class messagebookingSystem4 {
  public static void main (String [] args) {
    
    //基本資料：變數指定
    String 店名 = "董哥按摩" ;
    String 顧客姓名 = "小許" ;
    int 年齡 = 60 ;
    boolean 會員 = false ; 
    
    //服務項目：Arrays
    String[] 服務項目 = {"全身精油按摩","半身精油按摩","筋膜刀紓壓","肩頸按摩","筋骨酸痛評估與諮詢"} ;
    int[] 價格 = {700,600,550,400,300} ;
    
    System.out.println("您好，歡迎來到" + 店名) ;
    System.out.println("您的大名是" + " " + 顧客姓名) ;
    System.out.println("您的年齡是" + " " + 年齡 + " " + "歲") ;
    if (會員) {
      System.out.println("您是本店會員") ;
    }

    System.out.println("\n本店的價目表如下：") ;
    //價目表：for練習
    for (int X = 0 ; X < 服務項目.length ; X++ ) {
      System.out.println(服務項目[X] + "：每兩個小時" + 價格[X] + "元") ;
    }

    //預約項目：Switch/價格計算：if/else
    String 預約項目 = "" ;
    int 單價 =  0 ;
    int 折扣後金額 = 0 ; 
    int 預約代號 = 4 ;
    int 預約時段 = 11 ;
    int 預約時數 = 4 ;
    if(預約代號 >0 && 預約代號 <= 5 ) {
      switch(預約代號) {
        case 1 :
          預約項目 = "全身精油按摩" ;
          單價 = 700 ;
        break ;
        case 2 :
          預約項目 = "半身精油按摩" ;
          單價 = 600 ;
        break ;
        case 3 :
          預約項目 = "筋膜刀紓壓" ;
          單價 = 550 ;
        break ;
        case 4 :
          預約項目 = "肩頸按摩" ;
          單價 = 400 ;
        break ;
        case 5 :
          預約項目 = "筋骨酸痛評估與諮詢" ;
          單價 = 300 ;
        break ;
        default :
          預約項目 = "查無此服務項目" ;
        break ;
      }
      System.out.println("\n您預約的項目是" + 預約項目 + "\n單價為每兩小時" + 單價 + "元");
      switch(預約時段) {
        case 5 :
          System.out.println("您預約的時間為晚上5點") ;
        break ;
        case 6 :
          System.out.println("您預約的時間為晚上6點") ;
        break ;
        case 7 :
          System.out.println("您預約的時間為晚上7點") ;
        break ;
        case 8 :
          System.out.println("您預約的時間為晚上8點") ;
        break ;
        case 9 :
          System.out.println("您預約的時間為晚上9點") ;
        break ;
        case 10 :
          System.out.println("您預約的時間為晚上10點") ;
        break ;
        default :
          System.out.println("預約失敗，本店可預約時段為晚上5點至晚上10點") ;
      }
      switch(預約時數) {
        case 2 :
          System.out.println("您預約的時數為兩小時") ;
        break ;
        case 4 :
          System.out.println("您預約的時數為四小時") ;
        break ; 
        case 6 :
          System.out.println("您預約的時數為六小時") ;
        break ;
        default :
          System.out.println("預約失敗，本店預約時段最多為六小時") ;
      }
    }
    
    int 金額 = 單價 * 預約時數 ;
    if(預約時數 > 3) {
      折扣後金額 = 金額 * 9/10 ;
      if(會員) {
        折扣後金額 = 折扣後金額 - 100 ;
        System.out.println("您本次預約的服務金額為" + 金額 + "元，因您預約超過三小時，又是本店會員，折扣後金額為" + 折扣後金額 + "元") ;
      } else {
       System.out.println("您本次預約的服務金額為" + 金額 + "元，因您預約超過三小時，折扣後金額為" + 折扣後金額 + "元") ;
      }
    } else {
    System.out.println("您本次預約的服務金額為" + 金額 + "元") ;
    }

    //抽取號碼牌：Math
    int 預約號碼 = (int)(Math.random()*20) ;
    if(預約號碼 > 0 && 預約號碼 < 10) {
      System.out.println("預約成功，您的預約號為：" + 預約號碼 +"號") ;
    } else {
    System.out.println("預約失敗，本日預約人數已滿");
    } 
    
    //顯示所有服務項目：for-each
    for(String 項目 : 服務項目) {
      System.out.println("服務項目總覽：" + 項目) ;
    }
  
    //系統等待中：while
    int 等待次數 = 5 ;
    while (等待次數 <= 5) {
      System.out.println("系統等待中，系統重試次數" + 等待次數 + "次") ;
      等待次數++ ;
    }

    //最終結果呈現
    if(預約號碼 > 0 && 預約號碼 < 10) {
      System.out.println("預約成功") ;
      System.out.println("您預約的大名是：" + 顧客姓名) ;
      System.out.println("您預約的服務是："+ 預約項目 ) ;
      System.out.println("您預約的時段為：晚上" + 預約時段 + "點" ) ;
      System.out.println("您預約的時數為：" + 預約時數 + "小時") ;
      if(預約時數 > 3) {
        折扣後金額 = 金額 * 9/10 ;
        if(會員) {
          折扣後金額 = 折扣後金額 - 100 ;
          System.out.println("您預約的服務金額為" + 折扣後金額 + "元") ;
        } else {
        System.out.println("您預約的服務金額為" + 折扣後金額 + "元") ;
        }
      } else {
      System.out.println("您預約的服務金額為" + 金額 + "元") ;
      }
    } else {
      System.out.println("本日預約人數已滿，請於明日再來店預約") ;
    }

    //Arrays.toString
    System.out.println("\n系統服務清單" + Arrays.toString(服務項目)) ;

  }
}