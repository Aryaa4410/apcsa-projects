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
       for (int suit = 0; suit<4; suit++){
           for (int value = 0; value<13; value++){
               cards[index] = new Card(suit,value);
               index++;
           }
       }
   }


   public void shuffle(){
       for (int i = cards.length - 1; i>0; i--){
           int n = (int)(Math.random() * (i+1));
           Card temp = cards[i];
           cards[i] = cards[n];
           cards[n] = temp;
       }
       next = 0;
   }

}
