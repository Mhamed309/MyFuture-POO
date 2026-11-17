import java.util.Scanner;

// 1) Classe Etudiant avec ses champs
public class Etudiant {
    private String codeE;
    private String nom;
    private String prenom;
    private int age;
    private String ville;

    // 2) Constructeur paramétré
    public Etudiant(String codeE, String nom, String prenom, int age, String ville) {
        this.codeE = codeE;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.ville = ville;
    }

    // 3) Getters et setters du nom et du prénom
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    // 4) Procédure saisirE : saisie des champs avec Scanner
    public void saisirE() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Code : ");
        this.codeE = sc.nextLine();
        System.out.print("Nom : ");
        this.nom = sc.nextLine();
        System.out.print("Prénom : ");
        this.prenom = sc.nextLine();
        System.out.print("Age : ");
        this.age = sc.nextInt();
        sc.nextLine(); // consomme le retour à la ligne
        System.out.print("Ville : ");
        this.ville = sc.nextLine();
    }

    // 5) Procédure afficherE : affichage des champs
    public void afficherE() {
        System.out.println("Code   : " + codeE);
        System.out.println("Nom    : " + nom);
        System.out.println("Prénom : " + prenom);
        System.out.println("Age    : " + age);
        System.out.println("Ville  : " + ville);
        System.out.println("-------------------------");
    }
}
