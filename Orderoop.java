public class Orderoop {
  drinkoop drink ;
  boolean Size ;
  String topping ;
  int toppingprice ;
  int quantity ;
  Orderoop(drinkoop drink , boolean Size , String topping , int toppingprice , int quantity) {
    this.drink = drink ;
    this.Size = Size ;
    this.topping = topping ;
    this.toppingprice = toppingprice ;
    this.quantity = quantity ;
  }
  int unitprice() {
    int drinkprice ;
    if(Size) {
      drinkprice = drink.bigprice ;
    } else {
      drinkprice = drink.smallprice ;
    }
    return drinkprice + toppingprice ;
  }
  int subtotal() {
    return unitprice() * quantity ;
  }
  void showOrder() {
    String size ;
    if(Size) {
      size = "大杯" ;
    } else {
      size = "小杯" ;
    }
    System.out.println("您的訂單如下：飲料" + drink.name + "|容量" + size + "|加料" + topping + "|單價" + unitprice() + "元|數量" + quantity + "杯|小計" + subtotal() + "元") ;
  }
}