/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraaritmética;

import javax.swing.JOptionPane;

/**
 *
 * @author Brayan Gomez
 */
public class CalculadoraAritmética {

    public static void main(String[] args) {
        
        int num1,num2,suma,resta,mul,div;
        char operacion;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        operacion = JOptionPane.showInputDialog("Digite la operacion que deseas realizar: ").charAt(0);
        
        switch(operacion){
            
            case 's':
            case 'S': suma = num1+num2;
                      JOptionPane.showMessageDialog(null,"La suma es: "+suma);
                      break;
            case 'r':
            case 'R': resta = num1-num2;
                      JOptionPane.showMessageDialog(null,"La resta es: "+resta);
                      break;
            case 'p':
            case 'P':
            case 'm':
            case 'M': mul = num1*num2;
                      JOptionPane.showMessageDialog(null,"La multiplicaion es: "+mul);
                      break;
            case 'd':
            case 'D': div = num1/num2;
                      JOptionPane.showMessageDialog(null,"La division es: "+div);
                      break;
            default: JOptionPane.showMessageDialog(null,"Ingrese una letra valida");
                      
        }
        
    }
    
}
