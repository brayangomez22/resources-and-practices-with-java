/*
Determinar la cantidad de dinero que recibirá un trabajador por concepto de las horas
extras trabajadas en una empresa, sabiendo que cuando las horas de trabajo exceden de
40, el resto se consideran horas extras y que éstas se pagan al doble de una hora normal
cuando no exceden a 8; si las horas extras exceden de 8 se pagan las primeras 8 al doble
de lo que se paga por una hora normal y el resto al triple.
 */
package ejercicio.pkg11;

import javax.swing.JOptionPane;

public class Ejercicio11 {

    public static void main(String[] args) {
        
        String obrero;
        int horas, horasExtra, valorHoras, valorHoraExtra, valorHoraTriple;
        
        obrero = JOptionPane.showInputDialog("Nombre el obrero:");
        horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas trabajadas:"));
        valorHoras = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de cada hora trabajada:"));
        
        if(horas > 40){
            
            valorHoraExtra = horas%40;
            
            if(valorHoraExtra < 8){
                
                valorHoraExtra = valorHoraExtra * valorHoras;
                
                JOptionPane.showMessageDialog(null,"\"La cantidad de dinero de "+obrero+" por concepto de horas es de: "+"$"+valorHoraExtra);
                
            }else if(valorHoraExtra > 8){               
                
                valorHoraExtra = valorHoraExtra * valorHoras;
                
                valorHoraTriple = valorHoraExtra * valorHoras;             
                
                JOptionPane.showMessageDialog(null,"La cantidad de dinero de "+obrero+" por concepto de horas es de: "+"$"+valorHoraTriple);
                
            }                             
            
        }
        
    }
    
}
