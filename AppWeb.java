import java.util.Scanner;

public class AppWeb {
    public static void main(String[] args) {

        int Cin;
        String Nom;
        String Prénom;
        int Numcompte;
        double Solde;

        final double Plafond_Retrait = 500.0;

        System.out.println(Plafond_Retrait);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le CIN :");
        Cin = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Entrez le Nom :");
        Nom = scanner.nextLine();

        System.out.println("Entrez le Prénom :");
        Prénom = scanner.nextLine();

        System.out.println("Entrez le Numcompte :");
        Numcompte = scanner.nextInt();

        System.out.println("Entrez le Solde Initial (TND) :");
        Solde = scanner.nextDouble();

        int choix;

        do {
            System.out.println("1. Consulter le compte");
            System.out.println("2. Effectuer un dépôt");
            System.out.println("3. Effectuer un retrait");
            System.out.println("4. Quitter");
            System.out.println("Votre choix (1-4) :");

            choix = scanner.nextInt();

            switch (choix) {

                case 1:
                    System.out.println("Client : " + Nom + " " + Prénom);
                    System.out.println("CIN : " + Cin);
                    System.out.println("N° de Compte : " + Numcompte);
                    System.out.println("Solde Actuel : " + Solde + " TND");
                    System.out.println("Plafond Max : " + Plafond_Retrait + " TND");
                    break;
            }

        } while (choix != 4);
    }
}