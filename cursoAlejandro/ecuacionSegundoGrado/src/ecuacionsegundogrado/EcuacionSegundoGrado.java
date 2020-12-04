/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuacionsegundogrado;

import java.util.Scanner;

/**
 *
 * @author Brayan Gomez
 */
public class EcuacionSegundoGrado {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int a,b,c;
        double raiz, result1, result2;
        
        System.out.println("Digite el valor de a, b y c ");
        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();
        
        raiz = Math.sqrt(Math.pow(b,2)-4*a*c);
        
        result1 = -b+raiz;
        result2 = -b-raiz;
        
        System.out.println("Primer resultado : "+result1);
        System.out.println("Segundo resultado : "+result2);
        
    }
    
}
