/*
En una escuela la colegiatura de los alumnos se determina según el número de materias
que cursan. El costo de todas las materias es el mismo. Se ha establecido un programa
para estimular a los alumnos, el cual consiste en lo siguiente: si el promedio obtenido por
un alumno en el último periodo es mayor o igual que 9, se le hará un descuento del 30%
sobre la colegiatura y no se le cobrará IVA; si el promedio obtenido es menor que 9 deberá
pagar la colegiatura completa, la cual incluye el 10% de IVA. Obtener cuánto debe pagar
un alumno.
 */
package ejercicio.pkg10;

import javax.swing.JOptionPane;

public class Ejercicio10 {

    public static void main(String[] args) {
        
        int promedio, colegiatura;
        double iva = 0.16, descuentoColegiatura, porcentajeColegiatura;
        
        colegiatura = Integer.parseInt(JOptionPane.showInputDialog("Cuanto cuesta la colegiatura ?"));
        promedio = Integer.parseInt(JOptionPane.showInputDialog("Cual es el promedio del estudiante en el ultimo periodo: "));
        
        if(promedio >= 9){
            
            porcentajeColegiatura = colegiatura * 0.30;
            descuentoColegiatura = colegiatura - porcentajeColegiatura;
            
            JOptionPane.showMessageDialog(null,"El valor que debera pagar el alumno es de: "+descuentoColegiatura);
            
        }else if(promedio < 9){
            
            porcentajeColegiatura = colegiatura * 0.10;
            descuentoColegiatura = colegiatura + porcentajeColegiatura;
            
            JOptionPane.showMessageDialog(null,"El valor que debera pagar el alumno es de: "+descuentoColegiatura);

        }
        
    }
    
}
