import java.util.Random;
import java.util.Scanner;

public class Prix {
    public static void main(String[] args) {
        int nombreMystere;
        int tentativeUtilisateur = 0;
        int nombreDeCoup = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        nombreMystere = random.nextInt(100) + 1;
        while (tentativeUtilisateur != nombreMystere) {
            System.out.print("Veuillez choisir un nombre:   ");
            tentativeUtilisateur = scanner.nextInt();
            nombreDeCoup++;

            if (tentativeUtilisateur < nombreMystere) {
                System.out.println("Votre nombre est inférieur au nombre mystère, veuillez saisir un nombre plus grand :");
            } else if (tentativeUtilisateur > nombreMystere) {
                System.out.println("Votre nombre est supérieur au nombre mystère, veuillez saisir un nombre plus petit :");
            }
            /*if (nombreDeCoup > 5) {
                System.out.println("Trop de tentatives le jeux s'arrete ");
            }*/


        }
        System.out.println("Bravo vous avez trouvé le nombre mystère : " + nombreMystere + " en " + nombreDeCoup + " tentatives");
        scanner.close();
    }
}
