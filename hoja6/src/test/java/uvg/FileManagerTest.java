package uvg;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

public class FileManagerTest {
    @Test
     public void readLines() throws FileNotFoundException, IOException {
          FileManager a = new FileManager();
          String[] arr = {" Altergeist Pixiel|Monstruo", "\"A\" Cell Breeding Device|Hechizo", "\"A\" Cell Incubator|Hechizo", "\"A\" Cell Recombination Device|Hechizo", "\"A\" Cell Scatter Burst|Hechizo"};

          ArrayList<String> L = a.readTXTFile("/cards_desc.txt");
          for (int i = 0; i<5 ; i++){
               assertEquals(arr[i], L.get(i));
          }
          
     }
}
