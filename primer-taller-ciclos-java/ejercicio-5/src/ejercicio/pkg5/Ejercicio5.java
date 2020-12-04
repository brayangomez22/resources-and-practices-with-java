/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg5;

import javax.swing.JOptionPane;

/**
 *
 * @author Brayan Gomez
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edades, alturas, suma_edades=0, conteo_edades=0, conteo_mayores=0, suma_alturas=0, conteo_alturas=0, conteo_muy_grandes=0;
        float media_edades, media_alturas;
        
        for(int i=1; i<=5; i++){

             edades = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad del alumno: "));

             if(edades > 18){
                 conteo_mayores ++;
             }

             suma_edades += edades;
             conteo_edades ++;

        }
           
        for(int i=1; i<=10; i++){

             alturas = Integer.parseInt(JOptionPane.showInputDialog("Digite la altura del alumno: "));

             if(alturas > 1.75){
                 conteo_muy_grandes ++;
             }

             suma_alturas += alturas;
             conteo_alturas ++;

        }

        media_edades = suma_edades/conteo_edades;
        System.out.println("La media de las edades es: "+media_edades);
        
        media_alturas = suma_alturas/conteo_alturas;
        System.out.println("La media de la estatura es: "+media_alturas);
        
        System.out.println("La cantidad de alumnos mayores son: "+conteo_mayores);
        
        System.out.println("La cantidad de alumnos que miden más de 1.75 son : "+conteo_muy_grandes);
            
    }
    
}
