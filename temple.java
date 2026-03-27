public class temple {
  String godname ;
  int incensesticks ;
  public temple (String name , int quantity) {
    godname = name ;
    incensesticks = quantity ;
  }
  public static void main (String [] args) {
    constructor location1 = new constructor("玉皇上帝",3) ;
    constructor location2 = new constructor("天上聖母",3) ;
    constructor location3 = new constructor("註生娘娘",1) ;
    constructor location4 = new constructor("福德正神",1) ;
    constructor location5 = new constructor("觀世音菩薩",1) ;
    constructor location6 = new constructor("文昌帝君",1) ;
    constructor location7 = new constructor("太歲殿",1) ;
    System.out.println("歡迎來到XX天后宮") ;
    System.out.println("您現在所在位置祭拜的是" + location1.godname + "，請插" + location1.incensesticks + "炷香") ;
    System.out.println("您現在所在位置祭拜的是" + location2.godname + "，請插" + location2.incensesticks + "炷香") ;
    System.out.println("您現在所在位置祭拜的是" + location3.godname + "，請插" + location3.incensesticks + "炷香") ;
    System.out.println("您現在所在位置祭拜的是" + location4.godname + "，請插" + location4.incensesticks + "炷香") ;
    System.out.println("您現在所在位置祭拜的是" + location5.godname + "，請插" + location5.incensesticks + "炷香") ;
    System.out.println("您現在所在位置祭拜的是" + location6.godname + "，請插" + location6.incensesticks + "炷香") ;
    System.out.println("您現在所在位置是" + location7.godname + "，請插" + location7.incensesticks + "炷香") ;
  }
}