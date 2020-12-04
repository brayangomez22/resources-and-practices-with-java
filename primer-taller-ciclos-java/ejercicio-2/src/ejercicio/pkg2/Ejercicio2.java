/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Brayan Gomez
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numero;
       int iFactorial = 1;
       
       numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
       
       for(int i=2; i <= numero; i++){
           
           iFactorial *= i;
           
       }
       
       System.out.println("El factorial del "+numero+" es: "+iFactorial);
       
    }
    
}
