public class EncapsulationMain {
  public static void main (String [] args) {
    EncapsulationMessage E1 = new EncapsulationMessage("肩頸按摩" , 300) ;
    EncapsulationMessage E2 = new EncapsulationMessage("下肢按摩" , 300) ;
    EncapsulationMessage E3 = new EncapsulationMessage("全身按摩" , 600) ;
    EncapsulationMessage E4 = new EncapsulationMessage("精油按摩(半身)" , 650) ;
    EncapsulationMessage E5 = new EncapsulationMessage("精油按摩(全身)" , 750) ;
    EncapsulationMessage E6 = new EncapsulationMessage("諮詢" , 150) ;
    System.out.println("歡迎來到小董按摩") ;
    System.out.println("本店服務價目表如下") ;
    System.out.println("===============================") ;
    E1.showInfo() ;
    E2.showInfo() ;
    E3.showInfo() ;
    E4.showInfo() ;
    E5.showInfo() ;
    E6.showInfo() ;
    System.out.println("===============================") ;
    System.out.println("今日預約名單") ;
    System.out.println("===============================") ;
    EncapsulationBooking B1 = new EncapsulationBooking("王先生" , E4 , 2 , false , 16) ;
    EncapsulationBooking B2 = new EncapsulationBooking("董先生" , E2 , 8 , true , 17) ;
    EncapsulationBooking B3 = new EncapsulationBooking("董先生" , E3 , 3 , true , 17) ;
    EncapsulationBooking B4 = new EncapsulationBooking("陳小姐" , E6 , 4 , false , 18) ;
    EncapsulationBooking B5 = new EncapsulationBooking("何先生" , E6 , 1 , true , 19) ;
    EncapsulationBooking B6 = new EncapsulationBooking("何先生" , E5 , 6 , true , 21) ;
    EncapsulationBooking B7 = new EncapsulationBooking("孔先生" , E1 , 5 , false , 20) ;
    System.out.println("===============================") ;
    B1.showEncapsulationBookingInfo() ;
    System.out.println("===============================") ;
    B2.showEncapsulationBookingInfo() ;
    B3.showEncapsulationBookingInfo() ;
    System.out.println("===============================") ;
    B4.showEncapsulationBookingInfo() ;
    System.out.println("===============================") ;
    B5.showEncapsulationBookingInfo() ;
    B6.showEncapsulationBookingInfo() ;
    System.out.println("===============================") ;
    B7.showEncapsulationBookingInfo() ;
  }
}
