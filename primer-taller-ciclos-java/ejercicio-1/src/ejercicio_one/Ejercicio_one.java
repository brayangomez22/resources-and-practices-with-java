/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_one;

import javax.swing.JOptionPane;

/**
 *
 * @author Brayan Gomez
 */
public class Ejercicio_one {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numeros, suma=0;
       
       for(int i=1; i<=15; i++){
           
           numeros = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

           suma += numeros;
    
       }
       
       System.out.println("La suma es: "+suma);
       
    }
    
}
