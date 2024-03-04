package uvg;

import java.util.ArrayList;
import java.util.Map;

public class CardDeck {
    private Map<String, String> deck;

    public CardDeck(ArrayList<String> arr, String mapType){
        deck = Maper.GenerateDeck(arr, mapType);


    }

    public String getCard(String key){
        if(deck.containsKey(key)){
            return key;
        }else{
            return null;
        }
    }

}
