package uvg;

import java.util.ArrayList;
import java.util.Map;

public class Maper {

    public static Map<String, String> GenerateDeck(ArrayList<String> arr, String MapType){
        MapFactory<String, String> mapFactory = new MapFactory<String, String>();

        Map<String, String> map = mapFactory.create(MapType);

        String[] line;
        for(String str : arr){
            line = str.split("\\|");
            map.put(line[0], line[1]);
        }

        return map;
    }
    
}
