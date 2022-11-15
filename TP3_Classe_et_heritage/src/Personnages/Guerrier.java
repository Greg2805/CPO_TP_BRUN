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
chaine_a_retourner = ("Le Guerrier "+nom+ " a "+pdv+ "point de vie et est à cheval et mani "+arme_en_main);
return chaine_a_retourner;
}
else {
    chaine_a_retourner = ("Le Guerrier "+nom+ " a "+pdv+ "point de vie et est à pieds et mani "+arme_en_main);

   return chaine_a_retourner; 
}
}



    
    

}

    


