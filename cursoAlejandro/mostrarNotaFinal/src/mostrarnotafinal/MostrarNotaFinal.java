2/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mostrarnotafinal;

import java.util.Scanner;

/**
 *
 * @author Brayan Gomez
 */
public class MostrarNotaFinal {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        float participacion, primerExamen, segundoExamen, examenFinal, notaFinal;
        
        System.out.println("Digite la nota de la participacion : ");
        participacion = entrada.nextFloat();
        
        System.out.println("Digite la nota del primer examen : ");
        primerExamen = entrada.nextFloat();
        
        System.out.println("Digite la nota del segundo examen : ");
        segundoExamen = entrada.nextFloat();
        
        System.out.println("Digite la nota de la participacion : ");
        examenFinal = entrada.nextFloat();
        
        // Porcentajes 
        participacion *= 0.10;
        primerExamen *= 0.25;
        segundoExamen *= 0.25;
        examenFinal *= 0.40;
        
        notaFinal = participacion + primerExamen + segundoExamen + examenFinal;
        
        System.out.println("La nota final es de : "+notaFinal);
                
    }
    
}
