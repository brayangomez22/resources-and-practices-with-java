/*
Una compañía de seguros está abriendo un departamento de fianzas y estableció un
programa para captar clientes. El programa consiste en lo siguiente: Si el monto por el que
se efectúa la fianza es menor que S50 000 la cuota a pagar será por el 3% del monto y si el
monto es mayor que $50 000 la cuota a pagar será el 2% del monto. La afianzadora desea
determinar cuál será la cuota que debe pagar un cliente.
 */
package ejercicio.pkg9;

import javax.swing.JOptionPane;

public class Ejercicio9 {

    public static void main(String[] args) {
        
        int fianzas;
        double cuota;
        
        fianzas = Integer.parseInt(JOptionPane.showInputDialog("Cual es el monto de la fianza"));
        
        if(fianzas < 50000){
            
            cuota = fianzas * 0.03;
            
            JOptionPane.showMessageDialog(null,"la cuota que debe pagar es de: "+cuota);
            
        }else if(fianzas > 50000){
            
            cuota = fianzas * 0.02;
            JOptionPane.showMessageDialog(null,"la cuota que debe pagar es de: "+cuota);
            
        }
        
    }
    
}
