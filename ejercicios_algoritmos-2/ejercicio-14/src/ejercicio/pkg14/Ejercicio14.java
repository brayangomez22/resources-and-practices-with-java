/*
Una empresa que comercializa cosméticos tiene organizados a sus vendedores en tres
departamentos y ha establecido un programa de incentivos para incrementar su
productividad. El gerente, al final del mes, pide el importe global de los tres
departamentos y aquellos que excedan el 33% de las ventas globales se les paga una
cantidad extra equivalente al 20% de su salario mensual. Si todos los ven-dedores ganan lo
mismo, determinar cuánto recibirán los vendedores de los tres departamentos al finalizar
el mes.
 */
package ejercicio.pkg14;

import javax.swing.JOptionPane;

public class Ejercicio14 {

    public static void main(String[] args) {
        
        int ventas, departamento1, departamento2, departamento3, salarioMensual;
        double excedan, salarioExtra, salarioTotal;
        
        ventas = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de las ventas a vender: "));
        departamento1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor del importe del primer departamento"));
        departamento2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor del importe del segundo departamento"));
        departamento3 = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor del importe del tercer departamento"));
        salarioMensual = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de dinero que gana mensualmente"));
        
        excedan = ventas * 0.33;
        
        /*----------------------*/
        /*PRIMER DEPARTAMENTO*/
        /*----------------------*/
        
        if(departamento1 >= excedan){
            
            salarioExtra = salarioMensual * 0.20;
            salarioTotal = salarioMensual + salarioExtra;
            
            JOptionPane.showMessageDialog(null,"El salario total del departamento 1 es de "+salarioTotal);
            
        }else{
            
            JOptionPane.showMessageDialog(null,"El salario total del departamento 1 es de "+salarioMensual+" por no vender demasiado");
            
        }
        
        /*----------------------*/
        /*SEGUNDO DEPARTAMENTO*/
        /*----------------------*/
        
        if(departamento2 >= excedan){
            
            salarioExtra = salarioMensual * 0.20;
            salarioTotal = salarioMensual + salarioExtra;
            
            JOptionPane.showMessageDialog(null,"El salario total del departamento 2 es de "+salarioTotal);
            
        }else{
            
            JOptionPane.showMessageDialog(null,"El salario total del departamento 2 es de "+salarioMensual+" por no vender demasiado");
            
        }
        
        /*----------------------*/
        /*TERCER DEPARTAMENTO*/
        /*----------------------*/
        
        if(departamento3 >= excedan){
            
            salarioExtra = salarioMensual * 0.20;
            salarioTotal = salarioMensual + salarioExtra;
            
            JOptionPane.showMessageDialog(null,"El salario total del departamento 3 es de "+salarioTotal);
            
        }else{
            
            JOptionPane.showMessageDialog(null,"El salario total del departamento 3 es de "+salarioMensual+" por no vender demasiado");
            
        }
        
    }
    
}
