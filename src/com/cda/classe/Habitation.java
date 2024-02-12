package com.cda.classe;

public class Habitation {
    private String nom;
    private double longueur;
    private double largeur;
    private int nbrEtage;


    public Habitation() {
    }

    // Constructeur avec les 3 attributs
    public Habitation(String nom, double longueur, double largeur) {
        this.nom = nom;
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public Habitation(String nom, double longueur, double largeur, int nbrEtage) {
        this.nom = nom;
        this.longueur = longueur;
        this.largeur = largeur;
        this.nbrEtage = nbrEtage;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }
    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double surface() {
        return this.longueur * this.largeur;
    }

    public int getNbrEtage() {
        return nbrEtage;
    }
    public void setNbrEtage(int nbrEtage) {
        this.nbrEtage = nbrEtage;
    }
}
