/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg6;

import javax.swing.JOptionPane;

/**
 *
 * @author Brayan Gomez
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numero;
       
       numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
       
       if(numero > 10){
           
           System.out.println("Solo se permiten numeros que esten en el rango de 0 a 10");
           
       }else{
           
           for (int i=1; i <= 10; i++) { 

               System.out.println(numero+" * "+i+" = "+numero*i);

           }
           
       }
       
    }
    
}
