/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llenararreglo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Brayan Gomez
 */
public class LlenarArreglo {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int nElementos;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elemtos del arreglo"));
        
        char[] letras = new char[nElementos];
        
        System.out.println("Digite los elementos del arreglo");
        
        for(int i=0; i<nElementos; i++){
            System.out.println((i+1)+" Digite un caracter");
            letras[i] = entrada.next().charAt(0);
        }
        
        System.out.println("Los caracteres del arreglo son: ");
        for(int i=0; i<nElementos; i++){
            System.out.println(letras[i]);
        }
        
    }
    
}
