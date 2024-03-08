package uvg;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class PlayerDeckTest {
     @Test
     public void addCardTest() throws FileNotFoundException, IOException {
          ArrayList<String> plDeck = new ArrayList<>();
          plDeck.add("7 Colored Fish|Monstruo");
          PlayerDeck player = new PlayerDeck(plDeck, "Hash");
          player.addCard("A Deal with Dark Ruler", "Hechizo");
          assertEquals("Carta: A Deal with Dark Ruler Tipo: Hechizo\nCarta: 7 Colored Fish Tipo: Monstruo\n", player.showPlayerDeck());

     }
     /**
      * @throws FileNotFoundException
      * @throws IOException
      Description: show the deck of the player
      */
     @Test
     public void showPlayerDeckTest() throws FileNotFoundException, IOException {
          ArrayList<String> plDeck = new ArrayList<>();
          plDeck.add("7 Colored Fish|Monstruo");
          PlayerDeck player = new PlayerDeck(plDeck, "Hash");
          assertEquals("Carta: 7 Colored Fish Tipo: Monstruo\n",player.showPlayerDeck());
     }
     /**
      * @throws FileNotFoundException
      * @throws IOException
      description: show players deck in order
      */
     @Test
     public void showDeckTest() throws FileNotFoundException, IOException {
          ArrayList<String> plDeck = new ArrayList<>();
          plDeck.add("7 Colored Fish|Monstruo");
          plDeck.add("A Deal with Dark Ruler|Hechizo");
          plDeck.add("A Wild Monster Appears!|Hechizo");
          plDeck.add("A Man with Wdjat|Monstruo");
          PlayerDeck player = new PlayerDeck(plDeck, "Hash");
          assertEquals("Carta: 7 Colored Fish Tipo: Monstruo\nCarta: A Man with Wdjat Tipo: Monstruo\n",player.showDeck("Monstruo"));
     }
}
