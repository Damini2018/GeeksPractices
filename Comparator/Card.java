class Card implements Comparable<Card>
{
   private String suit;
   private int value;

   public Card(String suit, int value)
   {
      this.suit = suit;
      this.value = value;
   }
   public int getValue()
   {
      return value;
   }
   public String getSuit()
   {
      return suit;
   }
   public int compareTo(Card x)
   {
      return getValue() - x.getValue();
   }
}
