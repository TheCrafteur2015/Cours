Dans ce répertoire se trouve des exemples de code en Java ainsi que des explications

Syntaxe de base d'un programme Java :

```bash
public class Main {

	public static void main(String[] args) {
	
		// Insérez votre code ici
	
	}

}
```

Syntaxe de base d'une classe objet :

```bash
public class Main {

	private int nbVente; // Variable
	
	/*  Constructeur de la classe Main  */
	public Main(int nbVente) {
	
		this.nbVente = nbVente;
		
		// Contenu du constructeur
	
	}
	
	/*  Accesseur  */
	public int getVente() {
	
		return this.nbVente;
	
	}

}
```
