public class Order {
  int calculatetotal(int drinkindex , boolean Size , int toppingindex , drinkmenu menu) {
  String size ;
  int price ;
  if (Size) {
    price = menu.bigdrinkprice[drinkindex] ;
    size = "大杯" ;
  } else {
    price = menu.smalldrinkprice[drinkindex] ;
    size = "小杯" ;
  }
  price += menu.toppingprice[toppingindex] ;
  System.out.println("您點的飲料是" + size + menu.drink[drinkindex] + "+" + menu.topping[toppingindex]) ;
  return price ;
  }
}