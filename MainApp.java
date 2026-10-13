public class MainApp {

    public static void main(String[] args) {

        // Création des clients
        Client c1 = new Client("07123456", "Ben Salah",
                "Sonia", "98765432");

        Client c2 = new Client("09876543", "Kacem",
                "Ahmed", "50112233");

        // Création des comptes
        CompteBancaire compte1 =
                new CompteBancaire("CB-1001", 500.0, c1);

        CompteBancaire compte2 =
                new CompteBancaire("CB-1002", 1500.0, c2);

        // Affichage des comptes
        System.out.println("===== INFORMATIONS INITIALES =====");
        compte1.afficherDetails();
        compte2.afficherDetails();

        // Test du dépôt
        System.out.println("\n===== TEST DEPOT =====");
        compte1.deposer(200.0);

        // Test du retrait
        System.out.println("\n===== TEST RETRAIT =====");
        compte1.retirer(1000.0);
        compte1.retirer(300.0);

        // Test du virement
        System.out.println("\n===== TEST VIREMENT =====");
        compte2.virement(compte1, 500.0);

        // Affichage final
        System.out.println("\n===== SOLDES FINAUX =====");
        compte1.afficherDetails();
        compte2.afficherDetails();

        // Nombre de comptes
        System.out.println("\nNombre total de comptes créés : "
                + CompteBancaire.getNombreComptes());
    }
}
