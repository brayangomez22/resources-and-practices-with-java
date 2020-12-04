/*
En un almacén se hace un 20% de descuento a los clientes cuya compra supere los $ 1000.
¿Cuál será la cantidad de dinero que pagará una persona por su compra?
*/

package ejercicio.pkg2;

import javax.swing.JOptionPane;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        String producto;
        int valorCompra,valorSupremo = 1000;
        double descuentoProducto, descuento = 0.20, cantidadPagar;
        
        producto = JOptionPane.showInputDialog("Cual es el producto que deseas comprar ?");
        valorCompra = Integer.parseInt(JOptionPane.showInputDialog("Cual es el valor del producto: "));
        
        if(valorCompra >= valorSupremo){
            
            descuentoProducto = valorCompra * descuento;
            cantidadPagar = valorCompra - descuentoProducto;
            
            JOptionPane.showMessageDialog(null,"La cantidad de dinero que tienes que pagar por tu "+producto+" es de: "+cantidadPagar);
            
        }else{
            
            JOptionPane.showMessageDialog(null,"A tu producto no se le puede hacer descuento");
            
        }
        
    }
    
}
