/*
Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera
de la forma: el 1º de A, el 1ºde B, el 2º de A, el 2º de B, etc.
 */
package mezclardosarreglos;

import java.util.Scanner;

/**
 *
 * @author Brayan Gomez
 */
public class MezclarDosArreglos {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int a[],b[],c[];
        
        a = new int[10];
        b = new int[10];
        c = new int[20];
        
        //Pedimos el arreglo a
        System.out.println("Digite el primer arreglo: ");
        for(int i=0; i<10; i++){
            System.out.print((i+1)+". Digite un numero: ");
            a[i] = entrada.nextInt();
        }
        
        //Pedimos el b
        System.out.println("\nDigite el segundo arreglo: ");
        for(int i=0; i<10; i++){
            System.out.print((i+1)+". Digite un numero: ");
            b[i] = entrada.nextInt();
        }
        
        //Mezclar los dos arreglos en el arreglo c
        int j = 0;
        
        for(int i=0; i<10; i++){
            c[j] = a[i]; // 1*A 2*2 ...
            j++;
            
            c[j] = b[i]; // 1*B 2*B ...
            j++;
        }
        
        //Mostrar arreglo c
        System.out.print("\nEl tercer arreglo es :");
        for(int i=0; i<20; i++){
            System.out.print(c[i]+" ");
        }
        
        System.out.println();
        
    }
    
}
