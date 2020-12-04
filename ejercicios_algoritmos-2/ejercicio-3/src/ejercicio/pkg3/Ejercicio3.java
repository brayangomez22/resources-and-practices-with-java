/*
Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
Si trabaja 40 horas o menos se le paga $4 por hora. Si trabaja más de 40 horas se le paga
$4 por cada una de las primeras 40 horas y $6 por cada hora extra.
*/
package ejercicio.pkg3;

import javax.swing.JOptionPane;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        String obrero;
        int salarioMensual, horas, horasExtra;
        
        obrero = JOptionPane.showInputDialog("Nombre el obrero:");
        horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas trabajadas:"));
        
        if(horas == 40 || horas < 40){
            
            salarioMensual = 4 * horas;
            
            JOptionPane.showMessageDialog(null,"El salario semanal de "+obrero+" es de: "+"$"+salarioMensual);
            
        }else if(horas > 40){
            
            horasExtra = 6 * horas%40;
            salarioMensual = 4 * horas + horasExtra;
            
            JOptionPane.showMessageDialog(null,"El salario semanal de "+obrero+" es de: "+"$"+salarioMensual+" por su buen trabajo");
            
        }
        
    }
    
}
