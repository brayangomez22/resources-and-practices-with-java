package algoritmosbasicos;

import javax.swing.JOptionPane;

public class EjercicioTwo {

    public static void main(String[] args) {
        int num;
       
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero del 1 al 7"));
        
        switch (num) {
		case 1:
			System.out.println("El dia correspondiente es lunes");
			break;
		case 2:
			System.out.println("El dia correspondiente es martes");
			break;
		case 3:
			System.out.println("El dia correspondiente es miercoles");
			break;
		case 4:
			System.out.println("El dia correspondiente es jueves");
			break;
		case 5:
			System.out.println("El dia correspondiente es viernes");
			break;
		case 6:
			System.out.println("El dia correspondiente es sabado");
			break;
		case 7:
			System.out.println("El dia correspondiente es domingo");
			break;
		default:
			System.out.println("El nuemro ingresado no corresponde a ningun dia de la semana");
		}
        
    
	}


}

