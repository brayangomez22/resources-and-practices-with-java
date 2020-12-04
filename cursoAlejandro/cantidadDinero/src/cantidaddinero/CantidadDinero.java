/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cantidaddinero;

import java.util.Scanner;

/**
 *
 * @author Brayan Gomez
 */
public class CantidadDinero {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float guillermo,luis,juan,total;
        
        System.out.println("Digite la cantidad de dinero que tiene guillermo :");
        guillermo = entrada.nextFloat();
        
        luis = guillermo/2;
        juan = (guillermo+luis)/2;
        
        total = guillermo+luis+juan;
        
        System.out.println("La cantidad de dinero que hay entre los tres es de : "+ total);
    }
    
}
