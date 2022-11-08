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
    
    public Personnages (String n, int pv){
        pdv = pv;
        nom = n;
        
        
    }
    
    @Override
public String toString() {
String chaine_a_retourner;
chaine_a_retourner = ("L'arme "+nom+" a un niveau d'attaque de "+pdv);
return chaine_a_retourner;
}
}
