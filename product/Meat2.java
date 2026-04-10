package product ;
public class Meat2 extends Product2 {
  public Meat2(String name , double pricePerKg) {
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
  public String getInfo(double weight) {
    String discount = "無折扣" ;
    if(weight > 5) {
       discount = "滿2公斤打8折" ;
    } else if (weight >= 3) {
       discount = "滿3公斤打85折" ;
    } else if (weight >= 2) {
       discount = "滿2公斤打9折" ;
    }
    return "肉品：" + name + "\n單價" + pricePerKg + "元" + "\n重量" + weight + "kg" + "\n小計" + String.format("%.2f",countprice(weight)) + "元" ;
  }
}