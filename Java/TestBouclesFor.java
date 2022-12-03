public class TestBouclesFor {

    public static void main(String[] args) {
    
        /*  Première boucle  */
        for (int i = 0; i < 10; i++) {
         
            System.out.println("A");
          
        }
		
        /*  Deuxième boucle  */
        for (int i = 0, y = 20; i < 20 && y > 0; i++, y--) {
         
            System.out.println( i + y );
          
        }
        
        char[] arr = { 'A', 'B', 'C', 'D', 'E', 'F', 'G' };
        
        /*  Troisième boucle  */
        
        /*  Cette boucle itère sur les valeurs du tableau de caractères arr  */
        for (char c : arr) {
         
            System.out.println( c );
            
        }
    
    }

}
