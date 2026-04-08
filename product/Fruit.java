package product ;
public class Fruit extends Product {
  public Fruit(String name , double pricePerKg) {
    super(name , pricePerKg) ;
  }
  @Override
  public void showInfo(double weight) {
    System.out.println("水果：" + name + "，每公斤" + pricePerKg + "元") ;
  }
} 