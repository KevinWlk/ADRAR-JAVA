package com.cda.classe.Interface;

import com.cda.classe.Heritage.Personnage;

public class Flash extends Personnage implements Competence {
    public Flash(String nom, int vie, int attaque, int defense) {
        super(nom, vie, attaque, defense);
    }
    @Override
    public void attaquer(Object cible) {
        if (cible instanceof Personnage ennemi) {
            int degats = this.getAttaque() - ennemi.getDefense();
            ennemi.setVie(ennemi.getVie() - degats);
            if (ennemi.getVie() < 0) {
                ennemi.setVie(0);
            }
            this.setDefense(this.getDefense() + 1);
        } else {
            System.out.println("La cible n'est pas un personnage valide.");
        }
    }
}