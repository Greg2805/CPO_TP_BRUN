/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurbrun;

import java.util.Scanner;

/**
 *
 * @author grego
 */
public class TP2_convertisseurBRUN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc;
        sc = new Scanner(System.in);
        
        Convertisseur temperature = new Convertisseur();
        
        System.out.println("Entrez l'unité de votre température en entrée: ");
        int a = sc.nextInt ();
        
        double result = temperature.CelciusVersKelvin (a);
        System.out.println(result);
        
       
        double result1 = temperature.KelvinVersCelcius (b);
        System.out.println(result1);
        
        double result2 = temperature.FerenheitVersKelvin (40);
        System.out.println(result2);
        
        double result3 = temperature.KelvinVersFerenheit (40);
        System.out.println(result3);
        
        double result4 = temperature.CelciusVersFerenheit (40);
        System.out.println(result4);
        
        double result5 = temperature.FerenheitVersCelcius (40);
        System.out.println(result5);
        
    
        
        
    }
    
}
