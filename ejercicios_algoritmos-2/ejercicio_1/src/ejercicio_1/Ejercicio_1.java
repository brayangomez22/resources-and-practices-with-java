/*Determinar si un alumno aprueba o reprueba un curso, sabiendo que aprobará si su
promedio de tres calificaciones es igual o mayor a 7; reprueba en caso contrario.
*/

package ejercicio_1;

import javax.swing.JOptionPane;

public class Ejercicio_1 {

    public static void main(String[] args) {
        
        String curso;
        int cal1,cal2,cal3,promedio;
        
        curso = JOptionPane.showInputDialog("Dgite el curso que estas cursando: ");
        cal1 = Integer.parseInt(JOptionPane.showInputDialog("Digite su primera calificacion: "));
        cal2 = Integer.parseInt(JOptionPane.showInputDialog("Digite su segunda calificacion: "));
        cal3 = Integer.parseInt(JOptionPane.showInputDialog("Digite su tercera calificacion: "));
        
        promedio = cal1 + cal2 +cal3;
        
        
        if(promedio >= 7){
            
            JOptionPane.showMessageDialog(null, "El promedio del curso "+curso+" es de: "+promedio+", felicidades aprobaste");
            
        }else{
            
            JOptionPane.showMessageDialog(null, "Que burro reprobaste");
            
        }
        
        
    }
    
}
