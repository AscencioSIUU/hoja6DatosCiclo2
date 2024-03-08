package uvg;

import java.util.ArrayList;
import java.util.Map;

public class CardDeck {
    private Map<String, String> deck;

    public CardDeck(ArrayList<String> arr, String mapType) {
        deck = Maper.GenerateDeck(arr, mapType);

    }

    /**
     * @param key
     * @return
     * @description: devuelve la carta espesifica
     */
    public String getCard(String key) {
        if (deck.containsKey(key)) {
            return key;
        } else {
            return null;
        }
    }

    /**
     * @param key
     * @return
     * @description: devuelve el tipo de carta que se selecciono
     */
    public String getCardType(String key) {
        if (deck.containsKey(key)) {
            return deck.get(key);
        } else {
            return null;
        }
    }

    /**
     * @return
     * @description: muestra todas las cartas que existen
     */
    public String showDeck() {
        StringBuilder allDecks = new StringBuilder();
        for (Map.Entry<String, String> entry : deck.entrySet()) {
            allDecks.append("Carta: ").append(entry.getKey()).append(" Tipo: ").append(entry.getValue()).append("\n");
        }
        return allDecks.toString();
    }

    /**
     * @param cardType
     * @return
     * @description: muestra todas las cartas del tipo de carta seleccionado por un
     *               parametero
     */
    public String showDeckType(String cardType) {
        StringBuilder allDecks = new StringBuilder();
        for (Map.Entry<String, String> entry : deck.entrySet()) {
            if (entry.getValue().equals(cardType)) {
                allDecks.append("Carta: ").append(entry.getKey()).append(" Tipo: ").append(entry.getValue())
                        .append("\n");
            }
        }
        return allDecks.toString();
    }
}
