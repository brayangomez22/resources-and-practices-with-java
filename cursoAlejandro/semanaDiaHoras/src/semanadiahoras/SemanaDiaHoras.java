/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semanadiahoras;

import java.util.Scanner;

/**
 *
 * @author Brayan Gomez
 */
public class SemanaDiaHoras {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int horasTotales,semanas,dias,horas;
        
        System.out.println("Digite el total de horas");
        horasTotales = entrada.nextInt();
        
        semanas = horasTotales / 168;
        dias = horasTotales%168 / 24;
        horas = horasTotales%24;
        
        System.out.println("El equivalente es: ");
        System.out.println("Semanas: "+semanas);
        System.out.println("Dias: "+dias);
        System.out.println("Hoaras: "+horas);
        
    }
    
}
