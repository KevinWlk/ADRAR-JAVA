import com.cda.classe.*;

public class Main {
    public static void main(String[] args) {
//        Exercice 1-2
//        Habitation habitation1 = new Habitation("Maison", 10.5, 7.8, 2);
//        Habitation habitation2 = new Habitation("Appartement", 8.2, 5.6, 1);
//        Habitation habitation3 = new Habitation("Villa", 15.3, 12.6, 3);
//
//        System.out.println("L'habitation : " + habitation1.getNom() + " a une surface de : " + habitation1.surface() + " m².");
//        System.out.println("L'habitation : " + habitation2.getNom() + " a une surface de : " + habitation2.surface() + " m².");
//        System.out.println("L'habitation : " + habitation3.getNom() + " a une surface de : " + habitation3.surface() + " m².");


//        Exerice 3-4
//        Vehicule Vehicule = new Vehicule("Peugeot", 4, 120);
//        Vehicule moto = new Vehicule("Yamaha", 2, 100);
//        Vehicule autre = new Vehicule("Vélo", 2, 20);
//
//        System.out.println("Le véhicule : " + Vehicule.getNom() + " est de type " + Vehicule.detect());
//        System.out.println("Le véhicule : " + moto.getNom() + " est de type " + moto.detect());
//        System.out.println("Le véhicule : " + autre.getNom() + " est de type " + autre.detect());
//
//        Vehicule.boost();
//        moto.boost();
//        autre.boost();
//
//        System.out.println("Le véhicule : " + Vehicule.getNom() + " possède une vitesse de : " + Vehicule.getVitesse() + " km/h.");
//        System.out.println("Le véhicule : " + moto.getNom() + " possède une vitesse de : " + moto.getVitesse() + " km/h.");
//        System.out.println("Le véhicule : " + autre.getNom() + " possède une vitesse de : " + autre.getVitesse() + " km/h.");
//
//        Vehicule Vehicule1 = new Vehicule("Bugatti Chiron", 4, 420);
//        Vehicule Vehicule2 = new Vehicule("Ferrari 458 Italia", 4, 325);
//
//        System.out.println(Vehicule1.plusRapide(Vehicule2));

//        Exerice 5

        Assassin assassin = new Assassin("Ezio", 100, 10, 5, 8);
        Guerrier guerrier = new Guerrier("Aragorn", 100, 20, 10, 50);

        Partie partie = new Partie(assassin, guerrier, 10);

        partie.lancerPartie();

        Assassin assassin1 = new Assassin("Hitman",10,80, 9, 5);
        Guerrier guerrier1 = new Guerrier("Legolas",100,90,5, 10);

        Partie partie1 = new Partie(assassin1, guerrier1, 5);

        partie1.lancerPartie();
    }
}
