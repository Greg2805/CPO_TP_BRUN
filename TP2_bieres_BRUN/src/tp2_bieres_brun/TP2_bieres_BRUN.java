/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_brun;

/**
 *
 * @author grego
 */
public class TP2_bieres_BRUN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",7.0 ,"Dubuisson") ;
        uneBiere.lireEtiquette();
        
        
        
        

        
        BouteilleBiere uneBiere2 = new BouteilleBiere("Chouffe",7.0 ,"Brasserie d'Achouffe") ;
        uneBiere2.lireEtiquette();

        BouteilleBiere uneBiere3 = new BouteilleBiere("La bête",7.0 ,"Castellan") ;
        uneBiere3.lireEtiquette();
        
        boolean var;
        
        var=uneBiere.Decapsuler();
        System.out.println(var);
        System.out.println(uneBiere);
        
    }
    
}


