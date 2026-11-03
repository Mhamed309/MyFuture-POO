import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Donner le prix : ");
        double prix = sc.nextDouble();

        System.out.print("Donner la quantité : ");
        int qte = sc.nextInt();

        Produit p = new Produit("P01", "Clavier", prix, qte);

        int choix;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Afficher");
            System.out.println("2. Calculer la valeur du stock");
            System.out.println("3. Appliquer une remise");
            System.out.println("4. Quitter");
            System.out.print("Votre choix : ");
            choix = sc.nextInt();

            switch (choix) {
                case 1:
                    p.afficher();
                    break;

                case 2:
                    System.out.println("La valeur du stock est : " + p.calculerValeurStock());
                    break;

                case 3:
                    System.out.print("Donner le pourcentage de remise : ");
                    double remise = sc.nextDouble();
                    p.appliquerRemise(remise);
                    System.out.println("Remise appliquée. Nouveau prix HT : " + p.getPrixHT());
                    break;

                case 4:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide, entrez un nombre entre 1 et 4.");
            }
        } while (choix != 4);

        sc.close();
    }
}