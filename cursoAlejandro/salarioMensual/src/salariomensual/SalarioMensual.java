/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salariomensual;

import java.util.Scanner;

/**
 * @author Brayan Gomez
 */
public class SalarioMensual {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int salario = 1000, comision = 150, valorCarro;
        double porCiento, salarioTotal;
        
        System.out.println("Cuanto dinero cuesta el auto ?");
        valorCarro = entrada.nextInt();
        
        porCiento = valorCarro * 0.05;
        salarioTotal = valorCarro+comision+porCiento;
        
        System.out.println("Su salario mensual es de : "+ salarioTotal);
        
    }
    
}
