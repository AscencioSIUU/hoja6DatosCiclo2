package uvg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PlayerDeck {
     public Map<String, String> playerDeck;

     public PlayerDeck(String mapType) {
          MapFactory<String, String> mapFactory = new MapFactory<String, String>();
          playerDeck = mapFactory.create(mapType);
     }

     public void addCard(String cardName, String cardType) {
          playerDeck.put(cardName, cardType);
     }

     /**
      * @return
      *         Description: Muestra toda la baraja de cartas que el jugador posee
      */
     public String showPlayerDeck() {
          StringBuilder allDecks = new StringBuilder();
          for (Map.Entry<String, String> entry : playerDeck.entrySet()) {
               allDecks.append("Carta: ").append(entry.getKey()).append(" Tipo: ").append(entry.getValue())
                         .append("\n");
          }
          return allDecks.toString();

     }

     /**
      * @param cardType
      * @return
      * @description: mostrar toda las cartas que posee ordenadas
      */
     public String showOrderDeck() {
          StringBuilder allDecks = new StringBuilder();
          Collection<String> values = new ArrayList<>(new HashSet<>(playerDeck.values()));
          for (String value : values) {
               for (Map.Entry<String, String> entry : playerDeck.entrySet()) {
                    if (entry.getValue().equals(value)) {
                         allDecks.append("Carta: ").append(entry.getKey()).append(" Tipo: ").append(value).append("\n");
                    }

               }
          }
          return allDecks.toString();
     }

     public static void main(String[] args) {
          PlayerDeck player = new PlayerDeck("Hash");
          player.addCard("7 Colored Fish", "Monstruo");
          player.addCard("A Deal with Dark Ruler", "Hechizo");
          player.addCard("A Wild Monster Appears!", "Hechizo");
          player.addCard("A Man with Wdjat", "Monstruo");
          System.out.println(player.showOrderDeck());
     }

}
