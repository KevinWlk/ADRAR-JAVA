import com.cda.classe.Habitation;
import com.cda.classe.Voiture;

public class Main {
    public static void main(String[] args) {
        Habitation habitation1 = new Habitation("Maison", 10.5, 7.8, 2);
        Habitation habitation2 = new Habitation("Appartement", 8.2, 5.6, 1);
        Habitation habitation3 = new Habitation("Villa", 15.3, 12.6, 3);

        System.out.println("L'habitation : " + habitation1.getNom() + " a une surface de : " + habitation1.surface() + " m².");
        System.out.println("L'habitation : " + habitation2.getNom() + " a une surface de : " + habitation2.surface() + " m².");
        System.out.println("L'habitation : " + habitation3.getNom() + " a une surface de : " + habitation3.surface() + " m².");



        Voiture voiture = new Voiture("Peugeot", 4, 120);
        Voiture moto = new Voiture("Yamaha", 2, 100);
        Voiture autre = new Voiture("Vélo", 2, 20);

        System.out.println("Le véhicule : " + voiture.getNom() + " est de type " + voiture.detect());
        System.out.println("Le véhicule : " + moto.getNom() + " est de type " + moto.detect());
        System.out.println("Le véhicule : " + autre.getNom() + " est de type " + autre.detect());

        voiture.boost();
        moto.boost();
        autre.boost();

        System.out.println("Le véhicule : " + voiture.getNom() + " possède une vitesse de : " + voiture.getVitesse() + " km/h.");
        System.out.println("Le véhicule : " + moto.getNom() + " possède une vitesse de : " + moto.getVitesse() + " km/h.");
        System.out.println("Le véhicule : " + autre.getNom() + " possède une vitesse de : " + autre.getVitesse() + " km/h.");
    }
}
