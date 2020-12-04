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
public class EjercicioFive {
    public static void main(String[] args){
        String letra;
        letra = JOptionPane.showInputDialog("Digite una letra");
        
        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
			System.out.println("Es una bocal");
		} else {
			System.out.println("Es una consonante");
		}
    
    }
    
}
