package cards;

public class Hand 
{
   private Card[] cards;
   private int count;


   public Hand(int maxNum)
   {
       cards = new Card[maxNum];
       count = 0;
   }
    public void add(Card c){
       if (count < cards.length){
           cards[count] = c;
           count++;
       }
   }


   public int length()
   {
       return count;
   }

 
}
