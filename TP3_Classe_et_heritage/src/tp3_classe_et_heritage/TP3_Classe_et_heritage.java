/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_classe_et_heritage;

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
        System.out.println(n_arme.get(taille-1));
        
        
       
    }
    
}
