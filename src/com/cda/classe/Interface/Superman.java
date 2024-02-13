package com.cda.classe.Interface;

import com.cda.classe.heritage.Personnage;

public class Superman extends Personnage implements Competence {
    public Superman(String nom, int vie, int attaque, int defense) {
        super(nom, vie, attaque, defense);
    }
    @Override
    public void attaquer(Object cible) {
        if (cible instanceof Personnage) {
            Personnage ennemi = (Personnage) cible;
            int degats = this.getAttaque() - ennemi.getDefense();
            ennemi.setVie(ennemi.getVie() - degats);
            if (ennemi.getVie() < 0) {
                ennemi.setVie(0);
            }
            this.setVie(this.getVie() + 5);
        } else {
            System.out.println("La cible n'est pas un personnage valide.");
        }
    }
}