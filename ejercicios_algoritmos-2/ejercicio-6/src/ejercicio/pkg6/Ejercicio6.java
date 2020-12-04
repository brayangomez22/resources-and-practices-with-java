/*
Una empresa quiere hacer una compra de varias piezas de la misma clase a un fabricante
de refacciones. La empresa, dependiendo del monto total de la compra, decidirá qué
hacer para pagar al fabricante. Si el monto total de la compra excede de $500 000 la
empresa tendrá la capacidad de invertir de su propio dinero un 55% del monto de la
compra, pedir prestado un 30%, y el resto lo pagará solicitando un crédito al fabricante. Si
el monto total de la compra no excede de $500 000 la empresa tendrá la capacidad de
invertir de su propio dinero un 70% y el restante 30% lo pagará solicitando un crédito al
fabricante. El fabricante cobra por concepto de intereses un 20% sobre la cantidad que se
le pague a crédito. La empresa necesita determinar: cuánto dinero deberá invertir de sus
propios fondos; si hay necesidad, cuánto tendrá que pedir prestado al banco, cuánto
tendrá que pagar a crédito y cuánto pagará por concepto de intereses que se generen en
el crédito.
 */
package ejercicio.pkg6;

import javax.swing.JOptionPane;

public class Ejercicio6 {

    public static void main(String[] args) {
        
        int montoTotal, prestamo;
        double inversionEmpresa, dineroEmpresa, dineroPrestado, credito, intereses;
        
        dineroEmpresa = Integer.parseInt(JOptionPane.showInputDialog("De cuanto dinero dispone la empresa ?"));
        montoTotal = Integer.parseInt(JOptionPane.showInputDialog("Cual es el monto total de la compra ?"));
        
        if(montoTotal >= 500000){
            
            /*--------------------------------*/
            /*INVERSION DE LA EMPRESA*/
            /*--------------------------------*/
            
            inversionEmpresa = montoTotal * 0.55;            
            
            /*--------------------------------*/
            /*DINERO PRESTADO*/
            /*--------------------------------*/
            
            dineroPrestado = montoTotal * 0.30;                    
            
            /*-------------------------------------*/
            /*DINERO QUE SERA PAGADO POR CREDITO*/
            /*-------------------------------------*/
            
            credito = montoTotal * 0.15;            
            
            /*-------------------------------------------*/
            /*INTERESES DEL FABRICANTE DE LOS PRODUCTOS*/
            /*-------------------------------------------*/
            
            intereses = montoTotal * 0.20;            
            
            /*-------------*/
            /*RESULTADOS*/
            /*-------------*/
            
            JOptionPane.showMessageDialog(null,"La acantidad que debe invertir la empresa de sus propios fondos es de: "+inversionEmpresa);
            JOptionPane.showMessageDialog(null,"La acantidad de dinero que tendra que pedir prestado la empresa al banco es de: "+dineroPrestado);
            JOptionPane.showMessageDialog(null,"La acantidad de dinero que tendra que pagar a credito es de: "+credito);
            JOptionPane.showMessageDialog(null,"La acantidad de dinero que tendra que pagar de intereses es de: "+intereses);

        }else{
            
            /*--------------------------------*/
            /*INVERSION DE LA EMPRESA*/
            /*--------------------------------*/
            
            inversionEmpresa = montoTotal * 0.70;   
            
            /*-------------------------------------*/
            /*DINERO QUE SERA PAGADO POR CREDITO*/
            /*-------------------------------------*/
            
            credito = montoTotal * 0.30;   
            
            /*-------------------------------------------*/
            /*INTERESES DEL FABRICANTE DE LOS PRODUCTOS*/
            /*-------------------------------------------*/
            
            intereses = montoTotal * 0.20; 
            
            /*-------------*/
            /*RESULTADOS*/
            /*-------------*/
            
            JOptionPane.showMessageDialog(null,"La acantidad que debe invertir la empresa de sus propios fondos es de: "+inversionEmpresa);
            JOptionPane.showMessageDialog(null,"La acantidad de dinero que tendra que pagar a credito es de: "+credito);
            JOptionPane.showMessageDialog(null,"La acantidad de dinero que tendra que pagar de intereses es de: "+intereses);
            
        }
        
    }
    
}
