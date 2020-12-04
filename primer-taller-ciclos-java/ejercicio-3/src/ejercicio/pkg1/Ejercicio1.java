/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author Brayan Gomez
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numeros, suma_pos=0, conteo_pos=0, suma_neg=0, conteo_neg=0, conteo_ceros=0;
       float media_pos, media_neg;
       
       for(int i=1; i<=10; i++){
           
           numeros = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
           
           if(numeros == 0){ // Si el numero es cero
               conteo_ceros ++;
           }
           else if(numeros > 0){ // Si el numero es positivo
               suma_pos += numeros;
               conteo_pos ++;
           }
           else{ // Si el numero es negativo 
               suma_neg += numeros;
               conteo_neg ++;
           }
           
       }
       
       // Tratamos con los positivos
       if(conteo_pos == 0){
           System.out.println("No se puede sacar la media de los positivos");
       }else{
           media_pos = (float) suma_pos/conteo_pos;
           System.out.println("La media de los numeros positivos es: "+ media_pos);
       }
       
        // Tratamos con los negativos
       if(conteo_neg == 0){
           System.out.println("No se puede sacar la media de los negativos");
       }else{
           media_neg = (float) suma_neg/conteo_neg;
           System.out.println("La media de los numeros negativos es: "+ media_neg);
       }
       
       System.out.println("La cantidad de ceros es: "+conteo_ceros);
    }
    
}
