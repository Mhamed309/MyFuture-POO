public class Voiture {

    private String marque;
    private int vitesse;
    private String couleur;

    public Voiture(String m, int v, String c) {
        marque = m;
        vitesse = v;
        couleur = c;
    }

    public String getCouleur() {
        return couleur;
    }

    public void afficherDetails() {
        System.out.println("Marque : " + marque);
        System.out.println("Vitesse : " + vitesse + " km/h");
        System.out.println("Couleur : " + couleur);
    }
}

