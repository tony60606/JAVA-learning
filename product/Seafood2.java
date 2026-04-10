package product ;
public class Seafood2 extends Product2 {
  public Seafood2(String name , double pricePerKg) {
    super(name , pricePerKg) ;
  }
  @Override
  public double countprice (double weight) {
    return pricePerKg * weight + 50 ;
  }
  @Override
  public String getInfo(double weight) {
    return "海鮮：" + name + "\n單價" + pricePerKg + "元" + "\n重量" + weight + "Kg" + "\n額外收取食材處理費50元" + "\n小計" + String.format("%.2f",countprice(weight)) + "元";
  }
}