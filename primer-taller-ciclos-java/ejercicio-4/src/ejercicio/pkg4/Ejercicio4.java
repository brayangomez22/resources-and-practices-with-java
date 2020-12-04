/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg4;

import javax.swing.JOptionPane;

/**
 *
 * @author Brayan Gomez
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sueldos, suma_sueldos=0, conteo_sueldos=0;
        
        for(int i=1; i<=10; i++){
           
           sueldos = Integer.parseInt(JOptionPane.showInputDialog("Digite un sueldo: "));
           
           if(sueldos > 1000){
               conteo_sueldos++;
           }
            
           suma_sueldos += sueldos;
           
        }
   
        System.out.println("El total del sueldo es: "+suma_sueldos);
        System.out.println("Los sueldos mayores de 1000 son: "+conteo_sueldos);
    }
    
}
