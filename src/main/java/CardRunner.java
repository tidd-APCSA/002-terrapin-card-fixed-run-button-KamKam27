public class CardRunner {
    public static void main(String args[]){
        // ☕
       // System.out.println("hey");
      TerrapinCard cardBilly = new TerrapinCard(20);
      TerrapinCard cardBrian = new TerrapinCard(30);

      cardBilly.payGourmet();
      cardBrian.payEconomical();
      System.out.println(cardBilly);
      System.out.println(cardBrian);

      cardBilly.loadMoney(20);
      cardBrian.payGourmet();
      System.out.println(cardBilly);
      System.out.println(cardBrian);

      cardBilly.payEconomical();
      cardBilly.payEconomical();
      cardBrian.loadMoney(50);
      System.out.println(cardBilly);
      System.out.println(cardBrian);
    }
}
