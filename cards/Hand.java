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
   public Card get(int index){
       if (index < 0 || index >= count){
           return null;
       }
       return cards[index];
   }


   public Card remove(int index)
   {
       if (index < 0 || index >= count)
        {
           return null;
        }
       Card removed = cards[index];


       for(int i = index; i < count -1; i++)
        {
           cards[i] = cards[i+1];
        }
       cards[count - 1] = null;
       count--;
       return removed;
   }
   public String toString()
   {
       String result = "";
       for (int i = 0; i<count; i++)
        {
           result += cards[i].toString() + " ";
        }
       return result.trim();
   }
}
