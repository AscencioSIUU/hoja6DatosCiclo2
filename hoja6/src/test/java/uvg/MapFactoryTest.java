package uvg;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;

public class MapFactoryTest {
    
    @Test
    public void HashMapTest(){
        MapFactory<String, String> mapFactory = new MapFactory<String, String>();
        Map<String, String> map = mapFactory.create("Hash");

        assertTrue(map instanceof HashMap);
    }

    @Test
    public void TreeMapTest(){
        MapFactory<String, String> mapFactory = new MapFactory<String, String>();
        Map<String, String> map = mapFactory.create("Tree");

        assertTrue(map instanceof TreeMap);
    }

    @Test
    public void LinkedHashMapTest(){
        MapFactory<String, String> mapFactory = new MapFactory<String, String>();
        Map<String, String> map = mapFactory.create("LinkedHash");

        assertTrue(map instanceof LinkedHashMap);
    }
}
