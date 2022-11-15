package Personnages;


import Arme.arme;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author grego
 */
public class Guerrier extends Personnages{
    
    boolean cheval;    
    
    public Guerrier (String n, int pv, boolean a){
        super(n , pv);
        cheval=a;
        
    }
     @Override
public String toString() {
String chaine_a_retourner;
if (cheval == true){
chaine_a_retourner = ("Le magicien "+nom+pdv+ "vie à cheval");
return chaine_a_retourner;
}
else {
    chaine_a_retourner = ("Le magicien "+nom+pdv+ "vie à pieds");

   return chaine_a_retourner; 
}
    
    
}
}

    


