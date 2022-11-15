/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_classe_et_heritage;

import Personnages.Personnages;
import Personnages.Magicien;
import Personnages.Guerrier;
import Arme.*;

import java.util.ArrayList;

/**
 *
 * @author grego
 */
public class TP3_Classe_et_heritage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        
        épée épée1 = new épée("Excalibur", 7, 5);
        épée épée2 = new épée("Durandal", 4, 7);
        
        baton baton1 = new baton("Chêne", 4, 5);
        baton baton2 = new baton("Charme", 5, 6);
        
        System.out.println(baton1);
        System.out.println(baton2);
        System.out.println(épée1);
        System.out.println(épée1);
        
        ArrayList<arme> n_arme = new ArrayList<arme>();
        n_arme.add(épée1);
        n_arme.add(épée2);
        n_arme.add(baton1);
        n_arme.add(baton2);
        
        int taille = n_arme.size();
        int longueur=taille-1;
        for (int i=0 ; i<longueur; i++){
            System.out.println(n_arme.get(i));
        
        }
        Magicien magi1 = new Magicien ("Gandalf", 65, true);
        System.out.println(n_arme.get(taille-1));
        Magicien magi2 = new Magicien ("Garcimor", 44, false);
        Guerrier g1 = new Guerrier ("Conan", 78, false);
        Guerrier g2 = new Guerrier ("Lannister", 45, true);
        
        ArrayList<Personnages> tab_p = new ArrayList<Personnages>();
        tab_p.add(magi1);
        tab_p.add(magi2);
        tab_p.add(g1);
        tab_p.add(g2);
        
        int taille2 =tab_p.size();
        
        int longueur2=taille2-1;
        for (int i=0 ; i<longueur2; i++){
            System.out.println(tab_p.get(i));
            
        
        Guerrier g3 = new Guerrier("océane le troll", 2, false);
        Magicien m3 = new Magicien ("jules le gobelin", 8, false);
        baton baton10 = new baton ("branche", 5 , 5);
        baton baton11 = new baton ("branche2", 5 , 5);
        baton baton12 = new baton ("branche3", 5 , 5);
        
        épée épée10 = new épée ("kalisce", 5, 6);
        épée épée11 = new épée ("kalisce2", 5, 6);
        épée épée12 = new épée ("kalisce3", 5, 6);
        
        g3.ajouter_arme(épée10);
        g3.ajouter_arme(épée11);
        g3.ajouter_arme(baton10);
        
        m3.ajouter_arme(baton11);
        m3.ajouter_arme(baton12);
        m3.ajouter_arme(épée12);

        
        
        
        
        
        
    }
    
}
}
