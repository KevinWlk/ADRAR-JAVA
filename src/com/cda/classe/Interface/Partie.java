package com.cda.classe.Interface;

import com.cda.classe.Heritage.Personnage;

public class Partie {
    private final Personnage perso1;
    private final Personnage perso2;
    private int nbrTour;

    // Constructeur
    public Partie(Personnage perso1, Personnage perso2, int nbrTour) {
        this.perso1 = perso1;
        this.perso2 = perso2;
        this.nbrTour = nbrTour;
    }
//    public void lancerPartie() {
//        for (int tour = 1; tour <= nbrTour; tour++) {
//            perso1.attaquer(perso2);
//            perso2.attaquer(perso1);
//
//            if (perso1.getVie() <= 0) {
//                System.out.println(perso2.getNom() + " a gagné !");
//                return;
//            } else if (perso2.getVie() <= 0) {
//                System.out.println(perso1.getNom() + " a gagné !");
//                return;
//            }
//        }
//        if (perso1.getVie() > 0 && perso2.getVie() > 0) {
//            System.out.println("Egalité !");
//        }
//    }
    public void lancerPartie() {
        while (nbrTour > 0) {
            this.perso1.attaquer(this.perso2);
            this.perso2.attaquer(this.perso1);
            this.nbrTour--;

            if (this.perso2.getVie() <= 0) {
                System.out.println("Le gagnant est " + this.perso1.getNom());
                return;
            } else if (this.perso1.getVie() <= 0) {
                System.out.println("Le gagnant est " + this.perso2.getNom());
                return;
            }
        }
        System.out.println("Égalité");
    }
}
