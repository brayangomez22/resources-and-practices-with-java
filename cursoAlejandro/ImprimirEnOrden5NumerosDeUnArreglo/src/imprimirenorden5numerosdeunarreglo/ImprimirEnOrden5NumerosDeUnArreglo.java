/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprimirenorden5numerosdeunarreglo;

import java.util.Scanner;

/**
 *
 * @author Brayan Gomez
 */
public class ImprimirEnOrden5NumerosDeUnArreglo {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        float numeros[] = new float[5];
        
        System.out.println("Guardando los datos en el arreglo");
        for(int i=0; i<5; i++){
            System.out.println((i+1)+". Digite un numero");
            numeros[i] = entrada.nextFloat();
        }
        
        System.out.println("Imprimir los elementos del arreglo");
        for(float i:numeros){
            System.out.println(i);
        }
        
    }
    
}
