import java.util.Scanner ;
import javax.swing.JOptionPane ;
import product.Product2 ;
import product.Fruit2 ;
import product.Meat2 ;
import product.Seafood2 ;

public class Supermarket3 {
  public static void main (String [] args) {
    Scanner sc = new Scanner(System.in) ;
    Product2[] items = {
      new Fruit2("柳丁" , 110) ,
      new Fruit2("藍莓" , 150) ,
      new Fruit2("草莓" , 550) ,
      new Fruit2("屏東大西瓜" , 650) ,
      new Fruit2("哈密瓜" , 450) ,
      new Meat2("牛肉" , 550) ,
      new Meat2("豬肉" , 450) ,
      new Meat2("雞胸肉" , 350) ,
      new Meat2("雞腿肉" , 300) ,
      new Meat2("羊肉" , 700) ,
      new Seafood2("深海大魷魚" , 850) ,
      new Seafood2("蛤蠣" , 350) ,
      new Seafood2("石斑魚" , 1500) ,
      new Seafood2("大白鯧" , 750) ,
      new Seafood2("秋刀魚" , 550) } ;
    StringBuilder invoice = new StringBuilder() ;
    double total = 0 ;
    char again = 'y' ;
    int itemNo = 1 ;
    System.out.println("===生鮮超市商品清單===") ;
    for (int X = 0 ; X < items.length ; X++) {
      System.out.println((X+1) + "." + items[X].getName() + "-" + items[X].getPricePerKg() + "元/Kg") ;
    }
    do {
      System.out.print("\n請輸入要購買的產品編號：") ;
      int choice = sc.nextInt() ;
      if (choice < 1 || choice > items.length) {
        System.out.println("商品編號輸入錯誤") ;
        sc.close() ;
        continue ;
      }
      System.out.print("請輸入要購買的重量(Kg)：") ;
      double weight = sc.nextDouble() ;
      Product2 selected = items[choice - 1] ;
      double subtotal = selected.countprice(weight) ;
      total += subtotal ;
      invoice.append("[第").append(itemNo).append("項]\n") ;
      invoice.append(selected.getInfo(weight)).append("\n") ;
      invoice.append("====================\n") ;
      itemNo++ ;
      System.out.print("是否繼續購買?(y/n)：") ;
      again = sc.next().toLowerCase().charAt(0) ;
    } while (again == 'y') ;
    invoice.append("總金額：").append(String.format("%.2f",total)).append("元\n") ;
    invoice.append("====================") ;
    System.out.println("\n======發票資訊=======") ;
    System.out.println(invoice.toString()) ;
    JOptionPane.showMessageDialog(null , invoice , "生鮮超市發票" , JOptionPane.INFORMATION_MESSAGE) ;
    sc.close() ;
    System.out.print("歡迎再度光臨") ;
  }
}