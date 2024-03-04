package uvg;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws FileNotFoundException, IOException
    {
        FileManager a = new FileManager();
        ArrayList<String> L = a.readTXTFile("/cards_desc.txt");

        Map<String, String> maperTest = Maper.GenerateDeck(L, "");
        
        Map<String, String> expectedMap = new HashMap<String, String>();

        expectedMap.put(" Altergeist Pixiel", "Monstruo");
        expectedMap.put("\"A\" Cell Breeding Device", "Hechizo");
        expectedMap.put("\"A\" Cell Incubator", "Hechizo");
        expectedMap.put("\"A\" Cell Recombination Device", "Hechizo");
        expectedMap.put("\"A\" Cell Scatter Burst", "Hechizo");
        
        System.out.println("");
        
    }
}
