package cards;

public class Hand //specifies the amount of cards the hand can hold
{
   private Card[] cards;
   private int count;


   public Hand(int maxNum) // makes an empty array of max number of cards
   {
       cards = new Card[maxNum];
       count = 0;
   }
    public void add(Card c) // card added to hand using card parameter
    {
       if (count < cards.length) // makes sure the hand isnt full
        {
           cards[count] = c;
           count++; // increases length by 1
        }
   }
        // if the hand is full then this method will not be completed

   public int length() // returns number of cards stored in the hand
   {
       return count;
   }
   public Card get(int index)
   {
       if (index < 0 || index >= count)
        {
           return null;
        }
       return cards[index];
   }


   public Card remove(int index) // removes card with specified index
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
