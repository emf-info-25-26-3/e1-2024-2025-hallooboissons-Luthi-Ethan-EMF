package models;

public class Bouteille {

    // Constante

    // Attribut
    private String nom;
    private double prix;
    private double litre;
    private boolean enVerre;
    private double remplissage;

    // Constructeur
    public Bouteille(String nom, double prix, double litre, boolean enVerre, double remplissage) {
        this.nom = nom;
        this.prix = prix;
        this.litre = litre;
        this.enVerre = enVerre;
        this.remplissage = remplissage;

    }
    // Methodes

    // Getters et setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public double getLitre() {
        return litre;
    }

    public void setLitre(double litre) {
        this.litre = litre;
    }

    public boolean isEnVerre() {
        return enVerre;
    }

    public void setEnVerre(boolean enVerre) {
        this.enVerre = enVerre;
    }

    // ToString
    public String toString() {
        String enVerree;
        String remplissage67;
        if (enVerre == true) {
            enVerree = "en verre";
        } else {
            enVerree = "en plastique";
        }
        if (remplissage < 100.0) {
            remplissage67 = "entamé";
        } else {
            remplissage67 = "plein";
        }
        return "Bouteille " + nom + " de " + litre + " " + enVerree + " à " + prix + " " + remplissage67;
    }
}
