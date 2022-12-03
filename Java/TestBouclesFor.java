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
    
    }

}
