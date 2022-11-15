package Personnages;

import java.util.ArrayList;
import Arme.*;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author grego
 */
public class Personnages {
    String nom;
    int pdv;
    arme ajouter;
    ArrayList<arme> tab2 = new ArrayList<arme>();
    arme arme_en_main;
    
    
    public void ajouter_arme (arme armedonnée){
        ajouter=armedonnée;
        int taille3=tab2.size();
        if (taille3 < 5){
        tab2.add(armedonnée);
        }
        
    }
    
    public void équiper_arme (String nomarme){
        for (int i=0 ; i<tab2.size() ; i++){
            if (tab2.get(1).getNom().equals(nomarme)){
                System.out.println("L'arme à été trouvé et équipée");
            
        }
        
    
    
    
    }
    }
    
    public Personnages (String n, int pv){
        pdv = pv;
        nom = n;
        arme_en_main=null;
        
        
    }
    
    
}
