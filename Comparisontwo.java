public class Comparisontwo {
  public static void main (String [] args) {
    int 安全庫存 = 2000 ;
    int 剩餘庫存 = 150 ;
    int 每日補貨量 = 1000 ;
    int 每日需求量 = 1500 ;
    int 每批需訂購量 = 2000 ;
    int 補貨後庫存 = 剩餘庫存 + 每日補貨量 * 2 ;
    System.out.println("是否達可訂購量：" + (每批需訂購量 == 每日補貨量*2)) ;
    System.out.println("需求量與補貨量不相等：" + (每日需求量 != 每日補貨量)) ;
    System.out.println("補貨量是否充足：" + (補貨後庫存 > 安全庫存)) ;
    System.out.println("是否已缺貨：" + (剩餘庫存 < 安全庫存)) ;
    System.out.println("補貨後是否夠賣：" + (補貨後庫存 >= 每日需求量)) ;
    System.out.println("訂購量是否符合需求：" + (每日需求量 <= 每批需訂購量)) ;
  }
}