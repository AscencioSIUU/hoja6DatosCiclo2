package uvg;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws FileNotFoundException, IOException
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el sistema a ejecutar");
        System.out.println("1. Menu de usuario \n 2. Prueba de Profiler");
        String menu = scan.nextLine();
        
        if(menu.equals("1")){
            MenuMode();
        }else if(menu.equals("2")){
            ProfilingMode();
        }else{
            System.out.println("Esa opción no existe");
        }

        

        /*
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
        */
    }

    public static void ProfilingMode() throws FileNotFoundException, IOException{
        FileManager a = new FileManager();
        ArrayList<String> L = a.readTXTFile("/cards_desc.txt");

        ArrayList<String> hashTimes = Maper.ProfilingGenerateDeck(L, "Hash");
        ArrayList<String> treeTimes = Maper.ProfilingGenerateDeck(L, "Tree");
        ArrayList<String> linkedTimes = Maper.ProfilingGenerateDeck(L, "LinkedHash");

        a.exportCSVFile(hashTimes, "hashTimes.csv");
        a.exportCSVFile(treeTimes, "treeTimes.csv");
        a.exportCSVFile(linkedTimes, "linkedTimes.csv");

    }

    public static void MenuMode() throws FileNotFoundException, IOException{
        boolean program = true;
        Scanner scan = new Scanner(System.in);

        FileManager a = new FileManager();
        ArrayList<String> L = a.readTXTFile("/cards_desc.txt");

        CardDeck cardDeck = null;
        PlayerDeck playerDeck = null;

        System.out.println("¡Bienvenido a Barajas Nesstor! De todo en cartas y hechizos");
        System.out.println("Primero se debe escoger el tipo de mapa a implementar en cada baraja");
        System.out.println("Barajas Nesstor ofrece tres opciones, escoja la más conveniente para su caso.");
        System.out.println("1. Hash Map \n 2. Tree Map \n 3. Linked Hash Map");
        String tipo = scan.nextLine();

        switch (tipo){
            case "1":
                cardDeck = new CardDeck(L, "Hash");
                playerDeck = new PlayerDeck("Hash");
                System.out.println("Hemos implementado HashMap en las barajas, FELIZ JUEGO");
                break;
                
            case "2":
                cardDeck = new CardDeck(L, "Tree");
                playerDeck = new PlayerDeck("Tree");
                System.out.println("Hemos implementado TreeMap en las barajas, FELIZ JUEGO");
                break;

            case "3": 
                cardDeck = new CardDeck(L, "LinkedHash");
                playerDeck = new PlayerDeck("LinkedHash");
                System.out.println("Hemos implementado LinkedHashMap en las barajas, FELIZ JUEGO");
                break;
        }
        while(program){

           


            System.out.println("Ingrese la opción que desea ejecutar");
            System.out.println("1. Agregar carta a coleccion personal");
            System.out.println("2. Mostrar tipo de carta");
            System.out.println("3. Mostrar colección personal completa");
            System.out.println("4. Mostrar coleción personal ordenada por tipo");
            System.out.println("5. Mostrar todas las cartas existentes");
            System.out.println("6. Mostrar todas las cartas existentes por tipo");
            System.out.println("7. Salir");
            String option = scan.nextLine();
            String name;

            switch (option) {
                case "1":
                    System.out.println("Ingrese el nombre de la carta que desea agregar");
                    name = scan.nextLine();
                    if(cardDeck.getCard(name) != null){
                        String type = cardDeck.getCardType(name);
                        playerDeck.addCard(name, type);
                        System.out.println("Se ha añadido la carta " + name + ", tipo " + type + " a su baraja");
                    }else{
                        System.out.println("No se ha encontrado la carta " + name + " en el inventario de Barajas Nesstor");
                    }
                    break;
                case "2":
                    System.out.println("Ingrese el nombre de la carta a evaluar");
                    name = scan.nextLine();
                    if(cardDeck.getCard(name) != null){
                        String type = cardDeck.getCardType(name);
                        System.out.println("La carta " + name + " es tipo " + type);
                    }else{
                        System.out.println("No se ha encontrado la carta " + name + " en el inventario de Barajas Nesstor");
                    }

                    break;

                case "3":
                    System.out.println(playerDeck.showPlayerDeck());
                    break;
                default:
                    break;

                case "4":
                    System.out.println(playerDeck.showDeck(""));
                    break;

                case "5":
                    System.out.println(cardDeck.showDeck());
                    break;

                case "6":
                    System.out.println(cardDeck.showDeckType("name"));
                    break;
                    
                case "7":
                    program = false;
                    System.out.println("Gracias por visitar Barjas Nesstor");
                    break;
            }



        }
    }

}
