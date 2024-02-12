package com.cda.classe;

public class Partie {
    private Personnage joueur1;
    private Personnage joueur2;
    private int nbrTour;

    public Partie(Personnage joueur1, Personnage joueur2, int nbrTour) {
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
        this.nbrTour = nbrTour;
    }

    public Personnage getJoueur1() {
        return joueur1;
    }

    public void setJoueur1(Personnage joueur1) {
        this.joueur1 = joueur1;
    }

    public Personnage getJoueur2() {
        return joueur2;
    }

    public void setJoueur2(Personnage joueur2) {
        this.joueur2 = joueur2;
    }

    public int getNbrTour() {
        return nbrTour;
    }

    public void setNbrTour(int nbrTour) {
        this.nbrTour = nbrTour;
    }

    public void lancerPartie() {
        while (nbrTour > 0) {
            joueur1.attaquer(joueur2);
            joueur2.attaquer(joueur1);
            nbrTour--;

            if (joueur1.getVie() <= 0) {
                System.out.println("Le gagnant est " + joueur2.getNom());
                return;
            } else if (joueur2.getVie() <= 0) {
                System.out.println("Le gagnant est " + joueur1.getNom());
                return;
            }
        }
        System.out.println("Égalité");
    }
}
