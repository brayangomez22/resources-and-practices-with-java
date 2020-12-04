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
public class EjercicioSix {
    
    public static void main(String[] args){
        
        int figura;
        
        int valor;
        
        double resultado;
        
        int altura;
        
    
    
    JOptionPane.showMessageDialog(null, "Por favor seleccione a que figura le quiere hallar el area");
    JOptionPane.showMessageDialog(null, "1: circulo");
    JOptionPane.showMessageDialog(null, "2: cuadrado");
    JOptionPane.showMessageDialog(null, "3: triangulo");
    figura = Integer.parseInt(JOptionPane.showInputDialog("Que figura desea hallar el area?"));
    
    switch (figura) {
	case 1:
	    valor = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto mide el radio de su circulo?"));
            resultado = valor*valor/3.1416;
             JOptionPane.showMessageDialog(null, "El area del circulo es de "+ resultado);
	    break;
            
        case 2:
	    valor = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto mide un lado del cuadrado?"));
            resultado = valor*valor/4;
            JOptionPane.showMessageDialog(null, "El area del cuadrado es de "+ resultado);
            break;
            
        case 3:
	    valor = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto mide la base del triangulo?"));
            altura = Integer.parseInt(JOptionPane.showInputDialog("Que cuanto mide la altura del triangulo?"));
            resultado = valor*altura;
            JOptionPane.showMessageDialog(null, "El area del triangulo es de "+ resultado);
            break;
    }
    
    }
    
}
