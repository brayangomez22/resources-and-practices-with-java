/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosrepetidos;

import java.util.Arrays;
/**
 *
 * @author Brayan Gomez
 */
public class NumerosRepetidos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] ar = { 1, 2, 2, 1, 1, 3, 5, 1, 2, 5, 5 };

        // ARRAY ORDENADO
        Arrays.sort(ar);

        // ARRAY DE NUMERO DE ELEMENTOS
        int[] arNumElementos = encontrarElementosRepetidos(ar);

        // ARRAY DE NUMEROS NO REPETIDOS ORDENADOS
        int[] arNoDuplicates = eliminarDuplicados(ar);

        // CONTAR NUMERO DE ELEMENTOS PARA EL ARRAY BIDIMENSIONAL
        int contadorOnly = 0;
        for (int elemento : arNoDuplicates) {
            if (elemento != 0)
                contadorOnly++;
        }

        // ARRAY BIDIMENSIONAL CON EL ELEMENTO Y NUMERO DE ELEMENTOS
        int[][] arRepetidos = new int[contadorOnly][2];

        for (int x = 0; x < arRepetidos.length; x++){
            for (int y = 0; y < arRepetidos[x].length; y++){ 
                if (y == 0){
                    arRepetidos[x][y] = arNoDuplicates[x];
                }else{
                    arRepetidos[x][y] = arNumElementos[x];
                }
            }
        }

        // IMPRIMIR ARRAY BIDIMENSIONAL
        for (int x = 0; x < arRepetidos.length; x++) {
            System.out.print("{ ");
            for (int y = 0; y < arRepetidos[x].length; y++){
                System.out.print("" + arRepetidos[x][y] + " ");
            }
            System.out.print("},");
        }

    };

    private static int[] eliminarDuplicados(int[] arOriginal) {
        int[] tempArray = new int[arOriginal.length];

        int indexJ = 0;
        for (int i = 0; i < arOriginal.length - 1; i++) {
            int elemento = arOriginal[i];
            if (elemento != arOriginal[i + 1]) {
                tempArray[indexJ++] = elemento;
            }
        }

        tempArray[indexJ++] = arOriginal[arOriginal.length - 1];

        return tempArray;
    }

    private static int[] encontrarElementosRepetidos(int[] arOriginal) {
        // ARRAY ORDENADO
        Arrays.sort(arOriginal);

        // ARRAY DE NUMERO DE ELEMENTOS
        int[] arNumElementos = new int[arOriginal.length];
        int contador = 0;
        int aux = arOriginal[0];
        int iterador = 0;
        for (int i = 0; i < arOriginal.length; i++) {
            if (aux == arOriginal[i]) {
                contador++;
            } else {
                arNumElementos[iterador] = contador;
                contador = 1;
                aux = arOriginal[i];
                iterador++;
            }
        }
        arNumElementos[iterador] = contador;
        return arNumElementos;
    
    }
    
}
