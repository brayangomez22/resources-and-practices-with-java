/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosbasicos;
import java.util.Scanner;
/**
 *
 * @author JUAN FERNANDO
 */
public class EjercicioOne {
    
     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int num2 = num-1;
        
        while((num%num2) != 0){
            num2--;
        }
        if(num2 == 1){
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }
    }
}
