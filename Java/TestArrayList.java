import java.util.ArrayList;

/**
 *
 * @author
 * @version
 * @since
 */
public class TestArrayList {

	/**
	 * @param args An array of String
	 *
	 */
	public static void main(String[] args) {

		ArrayList<String> liste = new ArrayList<String>();

		liste.add("Lundi");
		liste.add("Mardi");
		liste.add("Mercredi");
		liste.add("Jeudi");
		liste.add("Vendredi");
		liste.add("Samedi");
		liste.add("Dimanche");

		for (String str : liste) {

			System.out.print(String.format("%$1s,", str));

		}

	}

}
