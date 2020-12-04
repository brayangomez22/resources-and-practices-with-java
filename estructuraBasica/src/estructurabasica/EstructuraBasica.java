
package estructurabasica;

import java.util.Scanner;

public class EstructuraBasica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int dias;
        double sb, st, sp, se;
        System.out.println("Ingrese los dias laborados");
        dias = leer.nextInt();
        sb = dias * 20.5;
        sp = sb * 0.03;
        se = sb * 0.4;
        st = sb - sp;   
        System.out.println("su salario bruto es: "+sb+", su salario total es: "+st);
        
    }
    
}
