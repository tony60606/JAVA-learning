public class temple1 {
  String side ;
  String god ;
  int incense ;
  public temple1 (String location , String name , int quantity) {
    side = location ;
    god = name ;
    incense = quantity ;
  }
  public static void main (String [] args) {
    temple1[] rule = {
      new temple1 ("天公爐","玉皇上帝",3),
      new temple1 ("主殿","關聖帝君、周倉將軍、關平太子",3),
      new temple1 ("三官殿","三官大帝",1),
      new temple1 ("文昌殿","五文昌帝君",1),
      new temple1 ("觀音殿","觀世音佛祖、地藏王菩薩",1),
      new temple1 ("福德殿","福德正神",1),
      new temple1 ("月老殿","月老星君",1),
      new temple1 ("太歲殿","斗母元君、值年太歲星君",1) };
    System.out.println("歡迎來到XX宮，以下為您介紹") ;
    for (temple1 temple : rule) {
      System.out.println("您現在所在的位置是" + temple.side + "，祭拜的神明是" + temple.god + "，請插" + temple.incense + "炷香") ;
    }
  }
}