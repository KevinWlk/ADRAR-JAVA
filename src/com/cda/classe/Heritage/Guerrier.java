package com.cda.classe.Heritage;

public class Guerrier extends Personnage {
    private int bonusDefense;

    public Guerrier(String nom, int vie, int attaque, int defense, int bonusDefense) {
        super(nom, vie, attaque, defense);
        this.bonusDefense = bonusDefense;
    }

    public int getBonusDefense() {
        return bonusDefense;
    }

    public void setBonusDefense(int bonusDefense) {
        this.bonusDefense = bonusDefense;
    }

    @Override
    public void attaquer(Personnage cible) {
        double critereChance = Math.random();
        if (critereChance <= 0.05) {
            cible.setVie(cible.getVie() + bonusDefense);
        }
        super.attaquer(cible);
    }
}
