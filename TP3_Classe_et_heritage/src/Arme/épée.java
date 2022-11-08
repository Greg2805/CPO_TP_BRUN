package Arme;

import Arme.arme;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author grego
 */
public class épée extends arme {
    int indice;
    
    public épée (String n, int i, int f){
        super(n, i);
        if (f>100){
            indice=100;
            
        }
        else{
            indice=f;
        }
    }
    
    
}
