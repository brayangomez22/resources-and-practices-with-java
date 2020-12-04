/*
En una tienda de descuento se efectúa una promoción en la cual se hace un descuento
sobre el valor de la compra total, según el color de la bolita que el cliente saque al pagar
en caja. Si la bolita es blanca no se le hará descuento alguno, si es verde se le hará un 10%
de descuento, si es amarilla un 25% de descuento, si es azul un 50% y si es roja un 100 por
ciento. Determinar la cantidad final que un cliente deberá pagar por su compra. Se sabe
que sólo hay bolitas de los colores mencionados.
 */
package ejercicio.pkg13;

import javax.swing.JOptionPane;

public class Ejercicio13 {

    public static void main(String[] args) {
        
        String producto, colorBola;
        int valorProducto;
        double descuento, valorDescuento;
        
        producto = JOptionPane.showInputDialog("Que producto deseas comprar");
        valorProducto = Integer.parseInt(JOptionPane.showInputDialog("Cuanto vale el producto ?"));
        colorBola = JOptionPane.showInputDialog("De que color deseas el color de la bola");
        
        switch(colorBola){
            
            case "blanca": 
                valorDescuento = valorProducto;
                JOptionPane.showMessageDialog(null,"La cantidad que tendras que pagar ahora por tu "+producto+" es de: "+valorDescuento);
                break;
            
            case "verde":
                valorDescuento = valorProducto * 0.10;
                descuento = valorProducto - valorDescuento;
                JOptionPane.showMessageDialog(null,"La cantidad que tendras que pagar ahora por tu "+producto+" es de: "+descuento);
                break;
                
            case "amarilla":
                valorDescuento = valorProducto * 0.25;
                descuento = valorProducto - valorDescuento;
                JOptionPane.showMessageDialog(null,"La cantidad que tendras que pagar ahora por tu "+producto+" es de: "+descuento);
                break;
                
            case "azul":
                valorDescuento = valorProducto * 0.50;
                descuento = valorProducto - valorDescuento;
                JOptionPane.showMessageDialog(null,"La cantidad que tendras que pagar ahora por tu "+producto+" es de: "+descuento);
                break;
                
            case "roja":
                JOptionPane.showMessageDialog(null,"Felicidades, ahora tendras tu "+producto+" totalmente gratis");
                break;
                
            default: JOptionPane.showMessageDialog(null,"Sigue intentando por un descuento increible");
            
        }
        
    }
    
}
