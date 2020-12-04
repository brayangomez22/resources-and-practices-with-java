/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumacuadrado;

import javax.swing.JOptionPane;

/**
 *
 * @author Brayan Gomez
 */
public class SumaCuadrado {

    public static void main(String[] args) {
        
        double a,b,suma,cuadrado;
        
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de a : "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de b : "));
        
        suma = a+b;
        cuadrado = Math.pow(suma, 2);
        
        JOptionPane.showMessageDialog(null, "El cuadrado de tu suma es de : "+cuadrado);
        
    }
    
}
