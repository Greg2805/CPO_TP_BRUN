package Arme;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author grego
 */
public class arme {
    int attaque;
    String nom;
    
    
    public arme (String n, int i){
        attaque = i;
        nom = n;
        
        
    }
    
    @Override
public String toString() {
String chaine_a_retourner;
chaine_a_retourner = ("L'arme "+nom+" a un niveau d'attaque de "+attaque);
return chaine_a_retourner;
}
    
}