/*
Calcular la utilidad que un trabajador recibe el reparto anual de utilidades si éste se le
asigna como un porcentaje de su salario mensual que depende de su antigüedad en la
empresa, de acuerdo con la siguiente tabla:
 */
package ejercicio.pkg12;

import javax.swing.JOptionPane;

public class Ejercicio12 {

    public static void main(String[] args) {
        
        String nombre, tiempo;
        
        nombre = JOptionPane.showInputDialog("Cual es tu nombre: ");
        tiempo = JOptionPane.showInputDialog("Cuantos años llevas en la empresa "+nombre+" ?");
        
        switch(tiempo){
            
            case "menos de un año": JOptionPane.showMessageDialog(null, nombre+" tu utilidad es del 5 por ciento del salario");
            break;
            
            case "un año": JOptionPane.showMessageDialog(null, nombre+" tu utilidad es del 7 por ciento del salario");
            break;
            case "mas de un año": JOptionPane.showMessageDialog(null, nombre+" tu utilidad es del 7 por ciento del salario");
            break;
            case "menos de dos años": JOptionPane.showMessageDialog(null, nombre+" tu utilidad es del 7 por ciento del salario");
            break;
            
            case "dos años": JOptionPane.showMessageDialog(null, nombre+" tu utilidad es del 10 por ciento del salario");
            break;
            case "mas de dos años": JOptionPane.showMessageDialog(null, nombre+" tu utilidad es del 10 por ciento del salario");
            break;
            case "menos de cinco años": JOptionPane.showMessageDialog(null, nombre+" tu utilidad es del 10 por ciento del salario");
            break;
            
            case "cinco años": JOptionPane.showMessageDialog(null, nombre+" tu utilidad es del 15 por ciento del salario");
            break;
            case "mas de cinco años": JOptionPane.showMessageDialog(null, nombre+" tu utilidad es del 15 por ciento del salario");
            break;
            case "menos de diez años": JOptionPane.showMessageDialog(null, nombre+" tu utilidad es del 15 por ciento del salario");
            break;
            
            case "diez año": JOptionPane.showMessageDialog(null, nombre+" tu utilidad es del 20 por ciento del salario");
            break;
            case "mas de diez años": JOptionPane.showMessageDialog(null, nombre+" tu utilidad es del 20 por ciento del salario");
            break;
            
            default: JOptionPane.showMessageDialog(null, nombre+" no sirves");

            
        }
        
    }
    
}
