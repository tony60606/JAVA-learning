public class Ordersystem {
  meal meal ;
  boolean portions ;
  drink drink ;
  boolean cup ;
  String seasoning ;
  int seasoningprice ;
  int quantity1 ;
  int quantity2 ;
  Ordersystem(meal meal , boolean portions , String seasoning , int seasoningprice , int quantity1 , drink drink , boolean cup , int quantity2) {
    this.meal = meal ;
    this.portions = portions ;
    this.drink = drink ;
    this.cup = cup ;
    this.seasoning = seasoning ; 
    this.seasoningprice = seasoningprice ; 
    this.quantity1 = quantity1 ;
    this.quantity2 = quantity2 ;
  }
  int unitprice1() {
    int mealprice ;
    if(portions) {
      mealprice = meal.largeprice ;
    } else {
      mealprice = meal.smallprice ;
    }
    return mealprice + seasoningprice ;
  }
  int unitprice2() {
    int drinkprice ;
    if(cup) {
      drinkprice = drink.bigprice ;
    } else {
      drinkprice = drink.smallprice ;
    }
    return drinkprice ;
  }
  int subtotal1() {
    return unitprice1() * quantity1 ;
  }
  int subtotal2() {
    return unitprice2() * quantity2 ;
  }
  void showOrder() {
    String Portions ;
    String Cup ;
    if(portions) {
      Portions = "大份" ;
    } else {
      Portions = "小份" ;
    }
    if(cup) {
      Cup = "大杯" ;
    } else {
      Cup = "小杯" ;
    }
    System.out.println(
      "您的訂單如下：" + meal.name + Portions + "|加料" + seasoning + "|單價" + unitprice1() + "元 |份數" + quantity1 + "份 |小計" + subtotal1() + "元" +
      "\n" + drink.name + Cup + "|單價" + unitprice2() + "元 |杯數" + quantity2 + "杯 |小計" + subtotal2() + "元") ;
  }
}