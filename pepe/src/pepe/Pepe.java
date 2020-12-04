/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pepe;

import java.util.Scanner;

/**
 *
 * @author Brayan Gomez
 */
public class Pepe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
	int a = lector.nextInt();
		
        for(int i=0; i<=a-1; i++){
            int b = lector.nextInt();
            int c = lector.nextInt();

            int suma = b+c;
            System.out.println("suma: "+suma);
        }
    }  
}