package uvg;

import java.util.ArrayList;
import java.util.Map;

public class PlayerDeck {
     private Map<String, String> playerDeck;

     public PlayerDeck(String mapType) {
          MapFactory<String, String> mapFactory = new MapFactory<String, String>();
          playerDeck = mapFactory.create(mapType);
     }

     public void addCard(String cardName, String cardType){
          playerDeck.put(cardName, cardType);
     }


     /**
      * @return
      Description: Muestra toda la baraja de cartas que el jugador posee
      */
     public String showPlayerDeck(){
        StringBuilder allDecks = new StringBuilder();
        for (Map.Entry<String, String> entry : playerDeck.entrySet()) {
          allDecks.append("Carta: ").append(entry.getKey()).append(" Tipo: ").append(entry.getValue()).append("\n");
        }
        return allDecks.toString();

     }

     /**
      * @param cardType
      * @return
      description: mostrar toda las cartas que posee ordenadas
      */
     public String showDeck(String cardType){
          StringBuilder allDecks = new StringBuilder();
          for (Map.Entry<String, String> entry : playerDeck.entrySet()) {
               if (entry.getValue().equals(cardType)) {
                    allDecks.append("Carta: ").append(entry.getKey()).append(" Tipo: ").append(entry.getValue())
                         .append("\n");
               }
          }
          return allDecks.toString();
     }

}
