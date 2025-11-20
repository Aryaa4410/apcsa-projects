package cards;
import java.util.ArrayList;


public class Deck 
{
   private Card[] cards;
   private int next = 0;
  
   public Deck()
   {
       cards = new Card[52];
       next = 0;
       
       int index = 0;
       for (int suit = 0; suit<4; suit++)
        {
           for (int value = 0; value<13; value++)
            {
               cards[index] = new Card(suit,value);
               index++;
            }
        }
   }


   public void shuffle()
   {
       for (int i = cards.length - 1; i>0; i--)
        {
           int n = (int)(Math.random() * (i+1));
           Card temp = cards[i];
           cards[i] = cards[n];
           cards[n] = temp;
        }
        next = 0;
    }
    public void cut(int index)
    {
       if (index < 0 || index > 51) 
        {
           return;
        }
          Card[] cutDeck = new Card[52];
          int newPos = 0;
          for (int i = index; i< cards.length; i++)
            {
               cutDeck[newPos++]= cards[i];
            }
          for (int i = 0; i<index; i++)
            {
               cutDeck[newPos++] = cards[i];
            }
          cards = cutDeck;
          next = 0;
        }


   public Card draw()
   {
       if (next>=cards.length)
        {
           return null;
        }
       Card c = cards[next];
       next++;
       return c;
   }


   public void print (int n)
   {
       if (n<0) 
        {
           return;
        }
       if (n>= cards.length)
        {
           n = cards.length - 1;
        }
       for (int i = 0; i<=n; i++)
        {
           System.out.print(cards[i] + " ");
        }
       System.out.println();
   }

}
