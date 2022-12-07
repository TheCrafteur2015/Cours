import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Gabriel ROCHE
 * @date 2 déc. 2022
 */
public class Table {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        File filePath = new File("");

        String fileName;

        if (args[0] == null || args[0].equals("Default")) {

            System.out.print("Nom du fichier (sans extension) : ");
            fileName = sc.nextLine();

            fileName += ".txt";

            filePath = new File("C:\\Users\\" + System.getenv("USERNAME") + "\\Documents\\" + fileName);

        } else {

            try {

                filePath = new File(args[0]);

            } catch (Exception e) {

                System.out.println("Erreur, chemin incorrect");
                System.exit(0);

            }

        }

        int nbLig;
        int nbCol;

        System.out.print("Nombre de colonnes : ");
        nbCol = sc.nextInt();

        System.out.print("Nombre de lignes : ");
        nbLig = sc.nextInt();

        int nbTab = 0;

        try (FileWriter fw = new FileWriter(filePath)) {

            fw.write("<table>\n\n");

            tabulations(fw, ++nbTab);
            fw.write("<thead>\n\n");

            tabulations(fw, ++nbTab);
            fw.write("<tr>\n\n");

            nbTab++;
            for (int i = 0; i < nbCol; i++) {

                tabulations(fw, nbTab);
                fw.write("<th>");
                fw.write("</th>\n");

            }

            fw.write("\n");

            tabulations(fw, --nbTab);
            fw.write("</tr>\n\n");

            tabulations(fw, --nbTab);
            fw.write("</thead>\n\n");

            tabulations(fw, nbTab);
            fw.write("<tbody>\n\n");

            nbTab++;
            for (int x = 0; x < nbLig; x++) {

                tabulations(fw, nbTab);
                fw.write("<tr>\n\n");

                for (int y = 0; y < nbCol; y++) {

                    tabulations(fw, ++nbTab);
                    fw.write("<td>");
                    fw.write("</td>\n");

                    nbTab--;

                }

                fw.write("\n");

                tabulations(fw, nbTab);
                fw.write("</tr>\n\n");

            }

            tabulations(fw, --nbTab);
            fw.write("</tbody>\n\n");

            tabulations(fw, nbTab);
            fw.write("<tfoot>\n\n");

            tabulations(fw, ++nbTab);
            fw.write("<tr>\n\n");

            for (int i = 0; i < nbCol; i++) {

                tabulations(fw, ++nbTab);
                fw.write("<td>");
                fw.write("</td>\n");

                nbTab--;

            }

            fw.write("\n");

            tabulations(fw, nbTab);
            fw.write("</tr>\n\n");

            tabulations(fw, --nbTab);
            fw.write("</tfoot>\n\n");

            tabulations(fw, --nbTab);
            fw.write("</table>");

        } catch (IOException e) {

            System.out.println("Erreur");

            System.exit(0);

        }

        System.out.println("Tableau créé avec succès !");

        sc.close();

    }

    public static void tabulations(FileWriter fw, int cpt) throws IOException {

        for (int i = 0; i < cpt; i++) {

            fw.write("\t");

        }

    }

}