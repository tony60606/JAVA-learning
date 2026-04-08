package product ;
public class Product {
  protected String name ;
  protected double pricePerKg ;
  public Product (String name , double pricePerKg) {
    this.name = name ;
    this.pricePerKg = pricePerKg ;
  }
  public String getName() {
    return name ;
  }
  public double getPricePerKg() {
    return pricePerKg ;
  }
  public double countprice(double weight) {
    return pricePerKg * weight ;
  }
  public void showInfo(double weight) {
    System.out.println("商品名稱：" + name + "，每公斤" + pricePerKg + "元") ;
  }
} 