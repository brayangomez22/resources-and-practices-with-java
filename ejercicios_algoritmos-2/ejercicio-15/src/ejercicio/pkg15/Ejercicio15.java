/*
El Instituto Mexicano del Seguro Social (imss) requiere clasificar a las personas que se
jubilarán en el año de 2003. Existen tres tipos de jubilaciones: por edad, por antigüedad
joven y por antigüedad adulta. Las personas adscritas a la jubilación por edad deben tener
60 años o más y una antigüedad en su empleo de menos de 25 años. Las personas
adscritas a la jubilación por edad joven deben tener menos de 60 años y una antigüedad
en su empleo de 25 años o más. Las personas adscritas a la jubilación por edad adulta
deben tener 60 años o más y una antigüedad en su empleo de 25 años o más. Determinar
en qué tipo de jubilación quedará adscrita una persona.
 */
package ejercicio.pkg15;

import javax.swing.JOptionPane;

public class Ejercicio15 {

    public static void main(String[] args) {
        
        int edad, añosTrabajo;

        edad = Integer.parseInt(JOptionPane.showInputDialog("Que edad tienes"));
        
        if(edad >= 60){
            
            añosTrabajo = Integer.parseInt(JOptionPane.showInputDialog("Cuantos años lleva trabajando ?"));
            
            if(añosTrabajo < 25){
               
                JOptionPane.showMessageDialog(null, "Su tipo de jubilacion es por edad");
                
            }else if(añosTrabajo >= 25){
                
                JOptionPane.showMessageDialog(null, "Su tipo de jubilacion es por adulta");
                
            }
                                  
        }else if(edad < 60){
            
            JOptionPane.showMessageDialog(null, "Su tipo de jubilacion es por joven");
            
        }
        
    }
    
}
