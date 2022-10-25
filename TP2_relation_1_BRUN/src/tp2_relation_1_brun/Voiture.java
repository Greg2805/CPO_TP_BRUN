package tp2_relation_1_brun;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author grego
 */
public class Voiture {
    String Marque;
    int PuissanceCV;
    String Modele;
    Personne proprietaire;
    
    public Voiture (String lemodele, String lamarque, int lapuissance){
        Marque= lamarque;
        PuissanceCV=lapuissance;
        Modele=lemodele;   
    }
    @Override
    public String toString() {
        return Modele + "venant de chez "+ Marque+ "de puissance"+ PuissanceCV;
    }

}
