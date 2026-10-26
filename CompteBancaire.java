public class CompteBancaire {

    private String numeroCompte;
    private double solde;
    private Client titulaire;
    private static int nombreComptes = 0;

    public CompteBancaire(String num, double s, Client c) {
        numeroCompte = num;
        titulaire = c;

        if (s >= 0) {
            solde = s;
        } else {
            solde = 0;
        }

        nombreComptes++;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public double getSolde() {
        return solde;
    }

    public Client getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(Client c) {
        titulaire = c;
    }

    public static int getNombreComptes() {
        return nombreComptes;
    }

    public void deposer(double montant) {
        if (montant > 0) {
            solde = solde + montant;
            System.out.println("Dépôt effectué : " + montant + " TND");
        } else {
            System.out.println("Erreur : montant invalide.");
        }
    }

    public void retirer(double montant) {
        if (montant > 0 && montant <= solde) {
            solde = solde - montant;
            System.out.println("Retrait effectué : " + montant + " TND");
        } else if (montant > solde && montant > 0) {
            System.out.println("Échec : Solde insuffisant sur le compte "
                    + numeroCompte + " (Solde actuel : " + solde + " TND).");
        } else {
            System.out.println("Erreur : montant invalide.");
        }
    }

    public void virement(CompteBancaire destination, double montant) {
        System.out.println("\nTentative de virement de " + montant
                + " TND vers le compte "
                + destination.getNumeroCompte() + "...");

        if (montant > 0 && montant <= solde) {
            retirer(montant);
            destination.deposer(montant);
            System.out.println("Virement réussi !");
        } else {
            System.out.println("Échec du virement : solde insuffisant "
                    + "ou montant invalide.");
        }
    }

    public void afficherDetails() {
        System.out.println("Compte N° : " + numeroCompte);
        System.out.print("Titulaire : ");
        titulaire.afficherClient();
        System.out.println("Solde Actuel : " + solde + " TND");
    }
}