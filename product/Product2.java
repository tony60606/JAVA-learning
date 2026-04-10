package product ;
public class Product2 {
  protected String name ;
  protected double pricePerKg ;
  public Product2 (String name , double pricePerKg) {
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
  public String getInfo(double weight) {
    return "商品：" + name + "\n單價：" + pricePerKg + "元" + "\n重量：" + weight + "Kg" + "\n小計：" + String.format("%.2f",countprice(weight)) + "元" ;
  }
}