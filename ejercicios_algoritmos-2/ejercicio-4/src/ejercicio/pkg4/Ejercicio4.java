/*
Un hombre desea saber cuánto dinero se generará por concepto de intereses sobre la
cantidad que tiene en inversión en el banco. Él decidirá reinvertir los intereses siempre y
cuando éstos excedan a $7 000, y en ese caso desea saber cuánto dinero tendrá
finalmente en su cuenta.
 */
package ejercicio.pkg4;

import javax.swing.JOptionPane;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        int dineroIntereses,cantidadBanco,reinvertir;
        
        cantidadBanco = Integer.parseInt(JOptionPane.showInputDialog("Cual es la cantidad que tiene en inversión en su banco?"));
        
        if(cantidadBanco >= 7000){
            
            reinvertir = Integer.parseInt(JOptionPane.showInputDialog("Cuanto dinero deseas reinvertir en tu cuenta ?"));
            
            dineroIntereses = cantidadBanco + reinvertir;
            
            JOptionPane.showMessageDialog(null, "El dinero que tienes finalmente en tu cuenta es de: "+dineroIntereses);
            
        }else{
            
            JOptionPane.showMessageDialog(null, "Por el momento no deseas reinvertir en tu cuenta");
            
        }
        
    }
    
}
