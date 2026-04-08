package product ;
public class Meat extends Product {
  public Meat(String name , double pricePerKg) {
    super(name , pricePerKg) ;
  }
  @Override
  public double countprice (double weight) {
    double total = pricePerKg * weight ;
    if(weight >= 5) {
      total  = total * 0.8 ;
    } else if(weight >= 3) {
      total = total * 0.85 ;
    } else if (weight >= 2) {
      total = total * 0.9 ;
    }
    return total ;
  }
  @Override
  public void showInfo(double weight) {
    System.out.println("肉品：" + name + "，每公斤" + pricePerKg + "元") ;
    if(weight > 5) {
      System.out.println("滿2公斤打8折")  ;
    } else if (weight >= 3) {
      System.out.println("滿3公斤打85折") ;
    } else if (weight >= 2) {
      System.out.println("滿2公斤打9折") ;
    }
  }
}
  