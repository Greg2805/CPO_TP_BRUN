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
        
        System.out.println("Entrez l'unité de votre température en entrée:\n1 pour Ferenheit \n2 pour Celcius\n3 pour Kelvin ");
        int entrée = sc.nextInt ();
        
        System.out.println("Entrez l'unité que vous souhaitez :\n1 pour Ferenheit \n2 pour Celcius\n3 pour Kelvin ");
        int sortie = sc.nextInt ();
        
        System.out.println("Entrez la valeur de votre température");
        int c = sc.nextInt ();
        
        
        if (entrée==2 && sortie==3){
        double result = temperature.CelciusVersKelvin (c);
        System.out.println(result);
        }
       
        if (entrée==3 && sortie==2){
        double result1 = temperature.KelvinVersCelcius (c);
        System.out.println(result1);
        }
        
        if (entrée==1 && sortie==3){
        double result2 = temperature.FerenheitVersKelvin (c);
        System.out.println(result2);
        }
        
        if (entrée==3 && sortie==1){
        double result3 = temperature.KelvinVersFerenheit (c);
        System.out.println(result3);
        }
        
        if (entrée==2 && sortie==1){
        double result4 = temperature.CelciusVersFerenheit (c);
        System.out.println(result4);
        }
        
        if (entrée==1 && sortie==2){
        double result5 = temperature.FerenheitVersCelcius (c);
        System.out.println(result5);
        }
        
        
        
    
        
        
    }
    
}
