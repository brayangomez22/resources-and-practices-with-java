/*
Leer 5 elementos numéricos que se introducirán ordenados de forma creciente.
Éstos los guardaremos en una tabla de tamaño 10. Leer un número N, e insertarlo 
en el lugar adecuado para que la tabla continúe ordenada.
 */
package insertarunnumeroenunarregloordenado;

import java.util.Scanner;

/**
 *
 * @author Brayan Gomez
 */
public class InsertarUnNumeroEnUnArregloOrdenado {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        boolean creciente = true;
        int numero, sitio_numero=0, j=0; 
        
        System.out.println("Llenar el arreglo");
        
        do{
            
            //Llenando el arreglo
            for(int i=0; i<5; i++){
                System.out.print((i+1)+". Digite un numero : ");
                arreglo[i] = entrada.nextInt();
            }
            
            for(int i=0; i<4; i++){
                if(arreglo[i] < arreglo[i+1]){
                    creciente = true;
                }
                if(arreglo[i] > arreglo[i+1]){
                    creciente = false;
                    break;
                }
            }
            
            if(creciente == false){
                System.out.println("\nEl arreglo no esta ordenado en forma creciente, vueiva a digitar los numeros ");
            }
            
        }while(creciente == false);
        
        System.out.println("Digite un nuevo numero a insertar");
        numero = entrada.nextInt();
        
        //Esto es para darnos cuenta en que posicion va el numero
        while(arreglo[j]<numero && j<5){
            sitio_numero++;
            j++;
        }
        
        //Trasladamos una posicion a los elementos que van de tras del numero insertado
        for(int i=4; i>=sitio_numero; i--){
            arreglo[i+1] = arreglo[i];
        }
        
        //Insertamos el numero que el usuario puso
        arreglo[sitio_numero] = numero;
        
        System.out.print("\nEl arreglo queda : ");
        for(int i=0; i<6; i++){
            System.out.print(arreglo[i]+" - ");
        }
        
    }
    
}
