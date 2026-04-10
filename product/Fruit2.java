package product ;
public class Fruit2 extends Product2 {
  public Fruit2(String name , double pricePerKg) {
    super(name , pricePerKg) ;
  }
  @Override
  public String getInfo(double weight) {
    return "水果：" + name + "\n單價：" + pricePerKg + "元" + "\n重量" + weight + "Kg" + "\n小計" + String.format("%.2f",countprice(weight)) + "元" ;
  }
} 