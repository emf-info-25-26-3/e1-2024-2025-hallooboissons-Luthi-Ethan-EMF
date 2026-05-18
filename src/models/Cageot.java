package models;

public class Cageot {
    // Constante
    public static final int MAX_BOUTEILLE = 12;
    // Attribut
    private int capacite;
    private String identifiant;
    private Bouteille[] tabbouteille;
    private Bouteille bouteille;

    // Constructeur
    public Cageot(String indentifiant) {
        this.capacite = MAX_BOUTEILLE;
        this.identifiant = identifiant;
        this.tabbouteille = new Bouteille[capacite];
    }

    // Methodes
    public Bouteille[] rangerBouteille() {
        for (int i = 0; i < tabbouteille.length; i++) {
            if (tabbouteille[i] == null) {
                tabbouteille[i] = bouteille;
                break;
            }

        }
        return tabbouteille;
    }

    public Bouteille[] prendreBouteilles() {
        for (int i = 0; i < tabbouteille.length; i++) {
            if (tabbouteille[i] != null) {
                tabbouteille[i] = null;
            }
        }
        return tabbouteille;
    }

    public int nombreBouteille() {
        int nombre = 0;

        for (int i = 0; i < tabbouteille.length; i++) {
            if (tabbouteille[i] != null) {
                nombre++;
            }

        }
        return nombre;
    }

    public int nombreBouteilledispo() {
        int nombredispo = 0;
        for (int i = 0; i < tabbouteille.length; i++) {
            if (tabbouteille == null) {
                nombredispo++;
            }
        }
        return nombredispo;
    }

    public 


    // Getters et setters
    public String getIdentifiant() {
        return identifiant;
    }
    // ToString
}
