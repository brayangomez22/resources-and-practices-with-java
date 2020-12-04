/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosbasicos;

import javax.swing.JOptionPane;

/**
 *
 * @author JUAN FERNANDO
 */
public class EjercicioFour {
        public static void main(String[] args){
        String letra;
        letra = JOptionPane.showInputDialog("Digite una vocal");
        
        if (letra.equals("a") || letra.equals("e") ||  letra.equals("o")) {
			System.out.println("Es una bocal abierta");
		} else {
			System.out.println("Es una bocal cerrada");
		}
    
    }
    
}
