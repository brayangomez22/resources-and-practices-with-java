/*
En un supermercado se hace una promoción mediante la cual el cliente obtiene un
descuento dependiendo de un número que escoge al azar. Si el número escogido es
menor que 74, el descuento es del 15% sobre el total de la compra, y si es mayor o igual a
74 el descuento es del 20%. Obtener cuánto dinero se le descuenta.
 */
package ejercicio.pkg8;

import javax.swing.JOptionPane;

public class Ejercicio8 {

    public static void main(String[] args) {
        
        String producto;
        int numeroAzar, totalCompra;
        double descuento, totalPagar;
        
        producto = JOptionPane.showInputDialog("Que producto deseas comprar ?");
        totalCompra = Integer.parseInt(JOptionPane.showInputDialog("Cuanto es el valor del producto ?"));
        
        numeroAzar = Integer.parseInt(JOptionPane.showInputDialog("Escoge un numero del 1 al 100"));
        
        if(numeroAzar < 74){
            
            descuento = totalCompra * 0.15;
            totalPagar = totalCompra - descuento;
            
            JOptionPane.showMessageDialog(null,"El dinero a pagar por tu "+producto+" es de: $"+totalPagar+" Y tu descuento fue de: $"+descuento);
            
        }else if(numeroAzar >= 74){
            
            descuento = totalCompra * 0.20;
            totalPagar = totalCompra - descuento;
            
            JOptionPane.showMessageDialog(null,"El dinero a pagar por tu "+producto+" es de: $"+totalPagar+" Y tu descuento fue de: $"+descuento);
            
        }
        
    }
    
}
