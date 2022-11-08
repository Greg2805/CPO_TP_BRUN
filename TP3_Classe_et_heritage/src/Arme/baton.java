package Arme;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author grego
 */
public class baton extends arme {
    int age;    
    public baton (String n, int i, int a){
        super(n , i);
        if (a>100){
            age=100;
            
        }
        else{
            age=a;
        }
    }
    
    
}

