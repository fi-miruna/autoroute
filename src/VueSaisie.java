import fr.ipst.io.Clavier;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

public class VueSaisie {

    public FormAutoroute lire() {
        System.out.print("Nombre de voitures : ");
        int nb_v = Clavier.lireInt();
        System.out.print("Nombre de caisses : ");
        int nb_c = Clavier.lireInt();
        System.out.print("Kilom�trage min : ");
        int min = Clavier.lireInt();
        System.out.print("Kilom�trage max : ");
        int max = Clavier.lireInt();
        System.out.print("Vitesse moyenne des v�hicules : ");
        int vitesse = Clavier.lireInt();
        FormAutoroute f = new FormAutoroute(nb_v, nb_c, min, max, vitesse);
        return f;
    }
}

