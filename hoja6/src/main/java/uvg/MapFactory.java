package uvg;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapFactory<K, T> {

    public Map<K, T> create(String mapType){
        switch (mapType) {
            case "Hash":
                return new HashMap<K, T>();
            
            case "Tree":
                return new TreeMap<K, T>();

            case "LinkedHash":
                return new LinkedHashMap<K, T>();
        
            default:
                return null;
        }
    }
}
