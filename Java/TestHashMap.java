import java.util.HashMap;

/**
 * Le HashMap permet de d'associer une clé (key) du type de votre choix avec une valeur (value) du type de votre choix.
 *
 *
 *
 */

public class TestHashMap {

    public static void main(String[] args) {
      
        /* Instanciation de l'objet HashMap, les types entre les signes <> définissent le type de la clé ainsi que de la valeur. */
        /* Notez que les types primitifs ne peuvent êtres utilisés pour définir les types.                                       */
      
        HashMap<String, Integer> map = new HashMap<String, Integer>();
      
        map.put( "ABC",     1 ); // Ajout de la clé "ABC" associée à la valeur 1
        map.put( "Pain",    4 ); // Ajout de la clé "Pain" associée à la valeur 4
        map.put( "Voiture", 3 ); // Ajout de la clé "Voiture" associée à la valeur 3
      
        map.remove( "Pain" ); // Suppression de la clé "Pain" ainsi que sa valeur associée (4)
      
        map.put( "Pain", 2); // Ajout de la clé "Pain" associée à la valeur 2
      
        System.out.println( map.toString() ); // Affichage du HashMap avec la méthode toString()
      
        /* L'affichage ressemblera à ceci */
        /*   [ABC=1, Pain=2, Voiture=3]   */
      
    }
  
}
