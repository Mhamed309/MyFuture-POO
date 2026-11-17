public class MainE {
    // 7) Procédure qui affiche la plus grande valeur du tableau
    //    (ici : l'étudiant le plus âgé, car l'âge est la valeur numérique)
    public static void afficherPlusGrandAge(Etudiant[] tab) {
        int max = tab[0].getAge();
        for (int i = 1; i < tab.length; i++) {
            if (tab[i].getAge() > max) {
                max = tab[i].getAge();
            }
        }
        System.out.println("La plus grande valeur (age) du tableau : " + max);
    }

    public static void main(String[] args) {
        // 6) Tableau de 3 étudiants
        Etudiant[] tab = new Etudiant[3];

        // Test du constructeur paramétré
        tab[0] = new Etudiant("E1", "Ben Ali", "Ahmed", 20, "Tunis");

        // Test de saisirE (les deux autres étudiants sont saisis au clavier)
        tab[1] = new Etudiant("", "", "", 0, "");
        tab[2] = new Etudiant("", "", "", 0, "");
        System.out.println("Saisie de l'étudiant 2 :");
        tab[1].saisirE();
        System.out.println("Saisie de l'étudiant 3 :");
        tab[2].saisirE();

        // Test du setter / getter
        tab[0].setNom("Trabelsi");
        tab[0].setPrenom("Mohamed");
        System.out.println("Nom modifié : " + tab[0].getNom() + " " + tab[0].getPrenom());

        // Affichage des étudiants
        System.out.println("\nListe des étudiants :");
        for (Etudiant e : tab) {
            e.afficherE();
        }

        // Test de la procédure 7
        afficherPlusGrandAge(tab);
    }
    
}
