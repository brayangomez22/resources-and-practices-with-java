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
public class EjercicioThree {
        public static void main(String[] args) {
        int num;
       
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero del 1 al 12"));
        
        switch (num) {
		case 1:
			System.out.println("El mes correspondiente es Enero");
			break;
		case 2:
			System.out.println("El mes correspondiente es Febrero");
			break;
		case 3:
			System.out.println("El mes correspondiente es Marzo");
			break;
		case 4:
			System.out.println("El mes correspondiente es Abril");
			break;
		case 5:
			System.out.println("El mes correspondiente es Mayo");
			break;
		case 6:
			System.out.println("El mes correspondiente es Junio");
			break;
		case 7:
			System.out.println("El mes correspondiente es Julio");
			break;
                case 8:
			System.out.println("El mes correspondiente es Agosto");
			break;
                case 9:
			System.out.println("El mes correspondiente es Septiembre");
			break;
                case 10:
			System.out.println("El mes correspondiente es Octubre");
			break;
                case 11:
			System.out.println("El mes correspondiente es Noviembre");
			break;
                case 12:
			System.out.println("El mes correspondiente es Diciembre");
			break;
		default:
			System.out.println("El nuemro ingresado no corresponde a ningun mes del año");
		}
        
    
	}
    
}
