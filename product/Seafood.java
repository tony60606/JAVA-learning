package product ;
public class Seafood extends Product {
  public Seafood(String name , double pricePerKg) {
    super(name , pricePerKg) ;
  }
  @Override
  public double countprice (double weight) {
    return pricePerKg * weight + 50 ;
  }
  @Override
  public void showInfo(double weight) {
    System.out.println("肉品：" + name + "，每公斤" + pricePerKg + "元，另額外收取50元食材處理費") ;
  }
}