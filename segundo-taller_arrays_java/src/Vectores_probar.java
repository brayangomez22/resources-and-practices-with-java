
    import javax.swing.*;
    public class Vectores_probar {    
    public static void main (String[] args) {
   	LeerVectores ve=new LeerVectores();
    String opcion;
     int n;
   	do{
   	opcion=JOptionPane.showInputDialog ("Menu\n 1. Vector de Enteros\n 2. Vector Reales\n 3.Vector de asignaturas\n 4.Salir");
   	n=Integer.parseInt (opcion);
   	switch(n)
   	{
   	 case 1: ve.VectorEntero ();break;
   	 case 2:ve.VectorReal (); break;
   	 case 3:ve.VectorTexto ();break;	
   	 case 4:System.exit (0);break;
   	}  		
   	}while(n!=4);}    
    }
   	