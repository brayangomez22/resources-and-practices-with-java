/*
Calcular el total que una persona debe pagar en una llantera si el precio de cada llanta es
de $300 si se compran menos de 5 llantas y de $250 si se compran 5 o más.
 */
package ejercicio.pkg7;

import javax.swing.JOptionPane;

public class Ejercicio7 {

    public static void main(String[] args) {

       int totalPagar, cantidadLlantas, precioLlantas;
       
       cantidadLlantas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de llantas a comprar: "));
       
       if(cantidadLlantas < 5){
           
           precioLlantas = 300;
           totalPagar = precioLlantas * cantidadLlantas;
           
           JOptionPane.showMessageDialog(null,"El total a pagar en la Llanteria es de: "+totalPagar);
           
       }else if(cantidadLlantas >= 5){
           
           precioLlantas = 250;
           totalPagar = precioLlantas * cantidadLlantas;
           
           JOptionPane.showMessageDialog(null,"El total a pagar en la Llanteria es de: "+totalPagar);
           
       }
        
    }
    
}
