package uvg;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class MaperTest {
        @Test
     public void readLines() throws FileNotFoundException, IOException {
        FileManager a = new FileManager();
        ArrayList<String> L = a.readTXTFile("/cards_desc.txt");

        String[] arr = {" Altergeist Pixiel", "\"A\" Cell Breeding Device", "\"A\" Cell Incubator", "\"A\" Cell Recombination Device", "\"A\" Cell Scatter Burst"};

        Map<String, String> maperTest = Maper.GenerateDeck(L, "Hash");
        
        Map<String, String> expectedMap = new HashMap<String, String>();

        expectedMap.put(" Altergeist Pixiel", "Monstruo");
        expectedMap.put("\"A\" Cell Breeding Device", "Hechizo");
        expectedMap.put("\"A\" Cell Incubator", "Hechizo");
        expectedMap.put("\"A\" Cell Recombination Device", "Hechizo");
        expectedMap.put("\"A\" Cell Scatter Burst", "Hechizo");
        
        for (int i = 0; i<5 ; i++){
            assertEquals(expectedMap.get(arr[i]), maperTest.get(arr[i]));
        }
        
       
        
          
     }
}
