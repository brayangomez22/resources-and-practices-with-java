/*
Leer por teclado una serie de 10 números enteros. La aplicación debe indicarnos 
si los números están ordenados de forma creciente, decreciente, o si están 
desordenados.
 */
package arregloenformacrecientedecreciente;

import java.util.Scanner;

/**
 *
 * @author Brayan Gomez
 */
public class ArregloEnFormaCrecienteDecreciente {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        boolean creciente=false,decreciente=false;
        
        System.out.println("Llenar el arreglo");
        for(int i=0; i<10; i++){
            System.out.print((i+1)+". Digite un numero :");
            arreglo[i] = entrada.nextInt();
        }
        
        for(int i=0; i<9; i++){
            if(arreglo[i] < arreglo[i+1]){
                creciente = true;
            }
            if(arreglo[i] > arreglo[i+1]){
                decreciente = true;
            }
        }
        
        if(creciente==true && decreciente==false){
            System.out.println("\nEl arreglo esta de forma creciente");
        }
        else if(decreciente==true && creciente==false){
            System.out.println("\nEl arreglo esta de forma decreciente");
        }
        else if(creciente==true && decreciente==true){
            System.out.println("\nEl arreglo esta de forma desordenada");
        }
        else if(creciente==false && decreciente==false){
            System.out.println("\nTodos los elementos del arreglo son iguales");
        }
        
    }
    
}
