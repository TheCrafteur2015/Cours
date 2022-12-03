Dans ce répertoire se trouve des exemples de code en Java ainsi que des explications

Syntaxe de base d'un programme Java :

```bash
/**
 *
 *@author 
 *@version
 *@since
 */
public class Main {

	/**
	 *@param args An array of String
	 *
	 */
	public static void main(String[] args) {
	
		// Insérez votre code ici
	
	}

}
```

Syntaxe de base d'une classe objet :

```bash
/**
 *
 *@author 
 *@version
 *@since
 */
public class Main {

	private int nbVente; // Variable privée
	
	/*  Constructeur de la classe Main  */
	public Main(int nbVente) {
	
		this.nbVente = nbVente; // Notez l'utilisation du préfixe this
		
		// Contenu du constructeur
	
	}
	
	/*  Accesseur  */
	public int getVente() {
	
		return this.nbVente;
	
	}

}
```
