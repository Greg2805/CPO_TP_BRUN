/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author grego
 */
public class Convertisseur {

    public int nbConversions;

    public Convertisseur() {
        nbConversions = 0;
    }
    
    public double CelciusVersKelvin(double Tc){
        double Tk;
        Tk=Tc+273.15;     
        return Tk;
    }
     public double KelvinVersCelcius(double Tk){
        double Tc;
        Tc=Tk-273.15;     
        return Tk;
    }
     
    public double FerenheitVersCelcius(double Tf){
        double Tc;
        Tc=(Tf-32)*5.0/9.0;     
        return Tc;
    }
    
    public double CelciusVersFerenheit(double Tc){
        double Tf;
        Tf=((Tc)*9.0/5.0)+32;     
        return Tf;
    }
    public double KelvinVersFerenheit(double Tk){
        double Tf;
        Tf=(Tk-273.15)*9.0/5.0+32;   
        return Tf;
    }
    
    public double FerenheitVersKelvin(double Tf){
        double Tk;
        Tk=(Tf-32)*5.0/9.0+273.15;     
        return Tk;
    }
    
    
    
     
    
public String toString () {
 return "nb de conversions"+ nbConversions;
}
}
