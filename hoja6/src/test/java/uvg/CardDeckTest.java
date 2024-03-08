package uvg;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class CardDeckTest {

     /**
      * @throws FileNotFoundException
      * @throws IOException
      Descriptio: test de getCard() method en CardDeck.java
      */
     @Test
     public void getCard() throws FileNotFoundException, IOException {
          ArrayList<String> arrdeck = new ArrayList<>();
          arrdeck.add("7 Colored Fish|Monstruo");
          CardDeck cardDeck = new CardDeck(arrdeck, "Hash");
          assertEquals("7 Colored Fish",cardDeck.getCard("7 Colored Fish"));
     }

     /**
      * @throws FileNotFoundException
      * @throws IOException
      description: test de getCardType() method en CardDeck.java
      */
     @Test
     public void getCardType() throws FileNotFoundException, IOException {
          ArrayList<String> arrdeck = new ArrayList<>();
          arrdeck.add("7 Colored Fish|Monstruo");
          CardDeck cardDeck = new CardDeck(arrdeck, "Hash");
          assertEquals("Monstruo",cardDeck.getCardType("7 Colored Fish"));
     }

     /**
      * @throws FileNotFoundException
      * @throws IOException
     description: test de showDeck() method en CardDeck.java
      */
     @Test
     public void showDeck() throws FileNotFoundException, IOException {
          ArrayList<String> arrdeck = new ArrayList<>();
          arrdeck.add("7 Colored Fish|Monstruo");
          CardDeck cardDeck = new CardDeck(arrdeck, "Hash");
          assertEquals("Carta: 7 Colored Fish Tipo: Monstruo\n",cardDeck.showDeck());
     }

     /**
      * @throws FileNotFoundException
      * @throws IOException
     description: test de showDeck() method en CardDeck.java
      */
     @Test
     public void showDeckType() throws FileNotFoundException, IOException {
          ArrayList<String> arrdeck = new ArrayList<>();
          arrdeck.add("7 Colored Fish|Monstruo");
          CardDeck cardDeck = new CardDeck(arrdeck, "Hash");
          assertEquals("Carta: 7 Colored Fish Tipo: Monstruo\n",cardDeck.showDeckType("Monstruo"));
     }
     
}
