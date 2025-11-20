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

   }
}
