import javax.swing.JOptionPane;

import java.util.*;

public  class LeerVectores {  
private int i,n;
private String Print,Valor;
    public  void VectorEntero(){
        int num[]= new int [0];
        int num_tem[]=new int[0];
        String opcion, operacion;
       	int dato, datoOperacion;
       	int elemento1 = 0, elemento2 = 0;
        double suma=0, resta=0, multiplicacion=1, division=0;
       	
       	do{
            
            opcion=JOptionPane.showInputDialog ("Menu Vectores de tipo Entero\n"
                                                + "1. Ingresar \n"
                                                + "2. Modificar\n "
                                                + "3. Eliminar\n "
                                                + "4. Mostrar\n "
                                                + "5. Hacer una operacion\n "
                                                + "6. Invertir el orden del arreglo\n "
                                                + "7. Salir");
            
            dato=Integer.parseInt (opcion);
            
            switch(dato){
       	  	case 1:		
                    if(num.length==0){
                        num=new int[1];                     
    			num[0] = Integer.parseInt (JOptionPane.showInputDialog  ("Ingrese el valor"));
                    }else if(num.length>0){
                        num_tem=new int [num.length+1];   
                        
    			for(int i=0;i<=(num.length-1);i++){
                            num_tem[i] = num[i];
                        }    				  				
    			
                        num_tem[num_tem.length-1] = Integer.parseInt (JOptionPane.showInputDialog  (null,"ingrese el valor  " ));		
    			num=new int [num_tem.length];    
                        
    			for(int i=0;i<=(num_tem.length-1);i++){
                            num[i]=num_tem[i];
                        }			
                    }	 
                break;
                
                case 2:
                    if (num.length >= 1) {                           
                        Print= "Numero de Registros " + num.length + "\n\n";
                        
                        for (i = 0; i <= (num.length - 1); i++) {
                            Print = Print + "Posicion " + (i + 1) + ": " + num[i] + "\n";
                        }
                        
                        Valor = JOptionPane.showInputDialog(null, "Cual es la posicion del Registro que desea Modificar. " + Print, "Modificar valor del vector", JOptionPane.QUESTION_MESSAGE);
                        
                        if (Integer.parseInt(Valor) <= num.length) {
                            n = Integer.parseInt(Valor);
                            Valor = JOptionPane.showInputDialog(null, "Nuevo Valor de la Posicion: " + n, "Modificar valor del vector", JOptionPane.QUESTION_MESSAGE);
                            num[n - 1] = Integer.parseInt(Valor);
                            Print = "Numero de Registros " + num.length + "\n\n";
                            
                            for (i = 0; i <= (num.length - 1); i++) {
                                Print= Print + "Posicion " + (i + 1) + ": " + num[i] + "\n";
                            }
                            
                            JOptionPane.showMessageDialog(null, "Registro Modificado Exitosamente! " +Print, "Moficicar valor del vector", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La Posicion Seleccionada No existe en este vector!.", "Modificar valor del vector", JOptionPane.ERROR_MESSAGE);
                        }
                        
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay Registros para Modificar.", "Modificar valor del vector", JOptionPane.ERROR_MESSAGE);
                    }
                break;
                
                case 3:    	    	
                    if (num.length > 1) {                            
                        Print= "Numero de Registros " + num.length + "\n\n";
                        
                        for (i = 0; i <= (num.length - 1); i++) {
                            Print = Print + "Posicion " + (i + 1) + " : " + num[i] + "\n";
                        }                           
                        
                        Valor = JOptionPane.showInputDialog(null, "Cual es la posicion del Registro que desea Eliminar. " + Print, "Eliminar datos vel vector", JOptionPane.QUESTION_MESSAGE);
                        elemento1 = Integer.parseInt(Valor) - 1;
                        
                        if (elemento1 <= num.length - 1) {
                            for (i = elemento1; i <= (num.length - 1); i++) {
                                if (i != num.length - 1) {
                                    num_tem[i] = num[i + 1];
                                }
                            }
                                
                            num= new int[num_tem.length - 1];
                            Print = "Numero de Registros " + num.length + "\n\n";
                               
                            for (i = 0; i <= (num.length - 1); i++) {
                                num[i] = num_tem[i];
                                Print = Print + "Posicion " + (i + 1) + ": " + num[i] + "\n";
                            }
                            
                            num_tem = new int[num.length];
                            
                            for (i = 0; i <= (num.length - 1); i++) {
                                num_tem[i] = num[i];
                            }
                                
                            JOptionPane.showMessageDialog(null, "valor Eliminado Exitosamente! " + Print, "Eliminar valor del vector", JOptionPane.INFORMATION_MESSAGE);
                            
                        } else {
                            JOptionPane.showMessageDialog(null, "La Posicion Seleccionada No existe en este arreglo.", "Eliminar valor del vector", JOptionPane.ERROR_MESSAGE);
                        }
                        
                    } else if (num.length == 1) {
                        num = new int[0];
                        num_tem = new int[0];
                        JOptionPane.showMessageDialog(null, "El Arreglo se encuentra Vacio. ", "Eliminar valor del vector", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay Registros para Eliminar.", "Eliminar valor del vector", JOptionPane.ERROR_MESSAGE);
                    }
                break;
                
                case 4:  
                    if (num.length >= 1) {
                        for (i = 0; i <= (num.length - 1); i++) {
                            for (n = 0; n <= (num.length - 2); n++) {                                    
                                elemento1 = num[n + 1];
                                elemento2 = num[n];
                                if (elemento1 < elemento2) {
                                    num[n] = elemento1;
                                    num[n + 1] = elemento2;
                                }
                            }
                        }
                        
                        Print = "Numero de Registros " + num.length + "\n\n";
                        for (i = 0; i <= (num.length - 1); i++) {
                            Print = Print + "Posicion " + (i + 1) + ": " + num[i] + "\n";
                        }
                        
                        JOptionPane.showMessageDialog(null, " " + Print, "Mostrar datos del vector", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay Registros en El arreglo", "Mostrar datos del vector", JOptionPane.ERROR_MESSAGE);
                    }
                break;
                
                case 5:
                    if (num.length >= 1) {
                        
                        operacion=JOptionPane.showInputDialog ("Menu de Operaciones\n"
                                                            + "1. Sumar todos los elemtos del array \n"
                                                            + "2. Restar dos elementos del array\n "
                                                            + "3. Multiplicar todos los elemtos del array\n "
                                                            + "4. Dividir dos elementos del array\n ");
                    
                        datoOperacion=Integer.parseInt (operacion);

                        switch(datoOperacion){
                            case 1:
                                for(i=0; i<num.length; i++){
                                    suma += num[i];
                                }
                                Print = "Tu suma es igual a:  " + suma ;
                            break;
                            
                            case 2:
                                resta = num[0] - num[1];
                                Print = "Tu resta es igual a:  " + resta;
                            break;
                            
                            case 3:
                                for(i=0; i<num.length; i++){
                                    multiplicacion *= num[i];
                                }
                                Print = "Tu multiplicacion es igual a:  " + multiplicacion ;
                            break;
                            
                            case 4:
                                division = num[1] / num[0];
                                Print = "Tu division es igual a:  " + division ;
                            break;
                        }
                        
                        JOptionPane.showMessageDialog(null, " " + Print, "Mostrar datos del vector", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay Registros en El arreglo", "Mostrar datos del vector", JOptionPane.ERROR_MESSAGE);
                    }
                    
                break;
                
                case 6:
                    if (num.length >= 1) {
                        
                        int aux, b;
                        
                        b=num.length;
                        for(i=0; i<=b/2; i++){
                            aux = num[i];
                            num[i] = num[b-1];
                            num[b-1] = aux;
                            b--;
                        }
                        
                        Print = "Arreglo con sus valores invertidos\n" ;
                        for(i=0; i<num.length; i++){
                            Print = Print + "Posicion " + (i + 1) + ": " + num[i] + "\n";
                        }
                        
                        JOptionPane.showMessageDialog(null, " " + Print, "Mostrar datos del vector", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay Registros en El arreglo", "Mostrar datos del vector", JOptionPane.ERROR_MESSAGE);
                    }
                break;
                
                case 7:
                    System.exit (0);
                break;
    	    			
            }			
    					
       	}while(Integer.parseInt (opcion)!=6);					
    }//fin metodo     
            
    //:::..metodo vector de tipo real::::::::::       
    public  void VectorReal(){        	
        double  dato[]=new double  [0];
 	double  dato_t[]=new double [0];
        String opcion;
       	int dat;
        double  elemen1 = 0, elemen2 = 0;
       	
        do{
            opcion=JOptionPane.showInputDialog ("Menu Vectores de tipo Real\n "
                                                + "1. Ingresar \n "
                                                + "2. Modificar\n "
                                                + "3. Eliminar\n "
                                                + "4. Mostrar\n "
                                                + "5. Salir");
            
            dat=Integer.parseInt (opcion);  
            
            switch(dat){
                case 1:		
                    if(dato.length==0){
                        dato=new double [1];     		
                        dato[0]=Integer.parseInt (JOptionPane.showInputDialog  ("Ingrese el valor  "  ));
                    }else if(dato.length>0){
                        dato_t=new double  [dato.length+1];    				

                        for(int i=0;i<=(dato.length-1);i++){
                            dato_t[i]=dato[i];
                        }    				  				

                        dato_t[dato_t.length-1]=Integer.parseInt (JOptionPane.showInputDialog  (null,"ingrese el valor  " ));		
                        dato=new double [dato_t.length];    				

                        for(int i=0;i<=(dato_t.length-1);i++){
                            dato[i]=dato_t[i];
                        }			
                    }
                break;
                    
                case 2:
                    if (dato.length >= 1) {                           
                        Print= "Numero de Registros " + dato.length + "\n\n";
                        
                        for (i = 0; i <= (dato.length - 1); i++) {
                            Print = Print + "Posicion " + (i + 1) + ": " + dato[i] + "\n";
                        }
                        
                        Valor = JOptionPane.showInputDialog(null, "Cual es la posicion del Registro que desea Modificar. " + Print, "Modificar valor del vector", JOptionPane.QUESTION_MESSAGE);
                        
                        if (Integer.parseInt(Valor) <= dato.length) {
                            n = Integer.parseInt(Valor);
                            Valor = JOptionPane.showInputDialog(null, "Nuevo Valor de la Posicion: " + n, "Modificar valor del vector", JOptionPane.QUESTION_MESSAGE);
                            dato[n - 1] = Integer.parseInt(Valor);
                            Print = "Numero de Registros " + dato.length + "\n\n";
                            
                            for (i = 0; i <= (dato.length - 1); i++) {
                                Print= Print + "Posicion " + (i + 1) + ": " + dato[i] + "\n";
                            }
                            
                            JOptionPane.showMessageDialog(null, "Registro Modificado Exitosamente! " +Print, "Moficicar valor del vector", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La Posicion Seleccionada No existe en este vector!.", "Modificar valor del vector", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay Registros para Modificar.", "Modificar valor del vector", JOptionPane.ERROR_MESSAGE);
                    }
    		break;
                
    		case 3:
                    if (dato.length > 1) {                            
                        Print= "Numero de Registros " + dato.length + "\n\n";
                        
                        for (i = 0; i <= (dato.length - 1); i++) {
                            Print = Print + "Posicion " + (i + 1) + " : " + dato[i] + "\n";
                        }
                        
                        Valor= JOptionPane.showInputDialog(null, "Cual es la posicion del Registro que desea Eliminar. " + Print, "Eliminar datos vel vector", JOptionPane.QUESTION_MESSAGE);
                        elemen1 = Double.parseDouble (Valor)-1;
                        int x;
                        x=(int)elemen1;                           
                        
                        if (elemen1 <= dato.length - 1) {
                            for (i = x; i <= (dato.length - 1); i++) {
                                if (i != dato.length - 1) {
                                    dato_t[i] = dato[i + 1];}
                            }                              
                            
                            dato= new double [dato_t.length - 1];
                            Print = "Numero de Registros " + dato.length + "\n\n";
                            
                            for (i = 0; i <= (dato.length - 1); i++) {
                                dato[i] = dato_t[i];
                                Print = Print + "Posicion " + (i + 1) + ": " + dato[i] + "\n";
                            }
                            
                            dato_t = new double [dato.length];
                            
                            for (i = 0; i <= (dato.length - 1); i++){
                               dato_t[i] = dato[i];
                            }                                
                            JOptionPane.showMessageDialog(null, "valor Eliminado Exitosamente! " + Print, "Eliminar valor del vector", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La Posicion Seleccionada No existe en este arreglo.", "Eliminar valor del vector", JOptionPane.ERROR_MESSAGE);
                        }
                    } else if (dato.length == 1) {
                        dato = new double [0];
                        dato_t = new double [0];
                        JOptionPane.showMessageDialog(null, "El Arreglo se encuentra Vacio. ", "Eliminar valor del vector", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay Registros para Eliminar.", "Eliminar valor del vector", JOptionPane.ERROR_MESSAGE);
                    }
    		break;
                
    		case 4:
                    if (dato.length >= 1) {
                        for (i = 0; i <= (dato.length - 1); i++) {
                            for (n = 0; n <= (dato.length - 2); n++) {                                    
                                elemen1 = dato[n + 1];
                                elemen2 = dato[n];
                                if (elemen1 < elemen2) {
                                    dato[n] = elemen1;
                                    dato[n + 1] = elemen2;
                                }
                            }
                        }
                        Print = "Numero de Registros " + dato.length + "\n\n";

                        for (i = 0; i <= (dato.length - 1); i++) {
                            Print = Print + "Posicion " + (i + 1) + ": " + dato[i] + "\n";
                        }

                        JOptionPane.showMessageDialog(null, " " + Print, "Mostrar datos del vector", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay Registros en El arreglo", "Mostrar datos del vector", JOptionPane.ERROR_MESSAGE);
                    }
    		break;
                
    		case 5:
                    System.exit (0);
    		break;
    			
            }		
    			
       	}while(Integer.parseInt (opcion)!=6);
    }//fin metodo
       
    //::::::::metodo vector nombre asignaturas:::::::::::
    public  void VectorTexto(){  
        int elemen1=0,elemen2=0;
        int dato;
        String opcion, opcionBuscar;	      	
        String texto[]=new String  [0];
 	String texto_t[]=new String [0]; 
        boolean asignaturaEncontrada;
        
        do{
            opcion=JOptionPane.showInputDialog ("Menu Vectores de asignaturas\n "
                                                + "1.Ingresar \n "
                                                + "2. Modificar\n "
                                                + "3. Eliminar\n "
                                                + "4. Mostrar\n "
                                                + "5. Ordenar alfabeticamente el arreglo\n "
                                                + "6. Buscar una asignatura\n "
                                                + "7. Invertir el arreglo\n "
                                                + "8. Salir");
            
            dato=Integer.parseInt (opcion); 
            
            switch(dato){      	  		
                case 1:	 		
                    if(texto.length==0){
                        texto=new String [1];     		
                        texto[0]=JOptionPane.showInputDialog ("Ingrese el dato   "  );
                    }else if(texto.length>0){
                        texto_t=new String [texto.length+1];    				
                        
                        for(int i=0;i<=(texto.length-1);i++){
                            texto_t[i]=texto[i];
                        }    				  				
                         
                        texto_t[texto_t.length-1]=JOptionPane.showInputDialog  (null,"ingrese el dato  " );		
                        texto=new String [texto_t.length];    				
                                    
                        for(int i=0;i<=(texto_t.length-1);i++){
                            texto[i]=texto_t[i];
                        }			
                    }
                break;
    			
                case 2:
                    if (texto.length >= 1) {                           
                        Print= "Numero de Registros " + texto.length + "\n\n";
                         
                        for (i = 0; i <= (texto.length - 1); i++) {
                             Print = Print + "Posicion " + (i + 1) + ": " + texto[i] + "\n";
                        }
                         
                        Valor = JOptionPane.showInputDialog(null, "Cual es la posicion del Registro que desea Modificar. " + Print, "Modificar valor del vector", JOptionPane.QUESTION_MESSAGE);
                        
                        if (Integer.parseInt(Valor) <= texto.length) {
                            n = Integer.parseInt(Valor);
                            texto[n - 1] =  JOptionPane.showInputDialog(null,"Nuevo dato de la Posicion: " + n, "Modificar valor del vector", JOptionPane.QUESTION_MESSAGE);
                            Print = "Numero de Registros " + texto.length + "\n\n";
                             
                            for (i = 0; i <= (texto.length - 1); i++) {
                                 Print= Print + "Posicion " + (i + 1) + ": " + texto[i] + "\n";
                            }
                            
                            JOptionPane.showMessageDialog(null, "Registro Modificado Exitosamente! " +Print, "Moficicar valor del vector", JOptionPane.INFORMATION_MESSAGE);
                         } else {
                             JOptionPane.showMessageDialog(null, "La Posicion Seleccionada No existe en este vector!.", "Modificar valor del vector", JOptionPane.ERROR_MESSAGE);
                         }
                     } else {
                         JOptionPane.showMessageDialog(null, "No hay Registros para Modificar.", "Modificar valor del vector", JOptionPane.ERROR_MESSAGE);
                     }
                break;
                
                case 3:
                    if (texto.length > 1) {                            
                        Print= "Numero de Registros " + texto.length + "\n\n";
                        for (i = 0; i <= (texto.length - 1); i++) {
                             Print = Print + "Posicion " + (i + 1) + " : " + texto[i] + "\n";
                        }                                        
                        
                        Valor= JOptionPane.showInputDialog(null, "Cual es la posicion del Registro que desea Eliminar. " + Print, "Eliminar datos vel vector", JOptionPane.QUESTION_MESSAGE);
                        elemen1 =Integer.parseInt (Valor)-1;                                             
                        
                        if (elemen1 <= texto.length - 1) {
                            for (i =elemen1; i <= (texto.length - 1); i++) {
                                if (i != texto.length - 1) {
                                    texto_t[i] = texto[i + 1];
                                }
                            }   
                            
                            texto= new String[texto_t.length - 1];
                            Print = "Numero de Registros " + texto.length + "\n\n";
                            
                            for (i = 0; i <= (texto.length - 1); i++) {
                                texto[i] = texto_t[i];
                                Print = Print + "Posicion " + (i + 1) + ": " + texto[i] + "\n";
                            }
                            texto_t = new String [texto.length];
                            
                            for (i = 0; i <= (texto.length - 1); i++) {
                                texto_t[i] = texto[i];
                            }                                
                            
                            JOptionPane.showMessageDialog(null, "dato Eliminado Exitosamente! " + Print, "Eliminar dato del vector", JOptionPane.INFORMATION_MESSAGE);
                         } else {
                            JOptionPane.showMessageDialog(null, "La Posicion Seleccionada No existe en este arreglo.", "Eliminar valor del vector", JOptionPane.ERROR_MESSAGE);
                         }
                    } else if (texto.length == 1) {
                        texto = new String [0];
                        texto_t= new String [0];
                        JOptionPane.showMessageDialog(null, "El Arreglo se encuentra Vacio. ", "Eliminar valor del vector", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay Registros para Eliminar.", "Eliminar valor del vector", JOptionPane.ERROR_MESSAGE);
                    }
                break;
                
                case 4:
                    String elem1,elem2;
                    if (texto.length >= 1) {
                        for (i = 0; i <= (texto.length - 1); i++) {
                            for (n = 0; n <= (texto.length - 2); n++) {                                    
                                elem1 = texto[n + 1];
                                elem2 = texto[n];
                                if (elem1.length ()< elem2.length ()) {
                                    texto[n] = elem1;
                                    texto[n + 1] = elem2;
                                }
                            }
                        }
                        Print = "Numero de Registros " + texto.length + "\n\n";
                         
                        for (i = 0; i <= (texto.length - 1); i++) {
                            Print = Print + "Posicion " + (i + 1) + ": " + texto[i] + "\n";
                        }
                        
                        JOptionPane.showMessageDialog(null, " " + Print, "Mostrar datos del vector", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay Registros en El arreglo", "Mostrar datos del vector", JOptionPane.ERROR_MESSAGE);
                    }
                break;
                
                case 5:
                    if (texto.length >= 1) {
                        
                        // Ordenamos la lista.
                        Collections.sort(Arrays.asList(texto)); 

                        Print = "Numero de Registros " + texto.length + "\n\n";    
                        for (i = 0; i <= (texto.length - 1); i++) {
                            Print = Print + "Posicion " + (i + 1) + ": " + texto[i] + "\n";
                        }
                        
                        JOptionPane.showMessageDialog(null, " " + Print, "Mostrar datos del vector", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay Registros en El arreglo", "Mostrar datos del vector", JOptionPane.ERROR_MESSAGE);
                    }
                break;
                
                case 6:
                    if (texto.length >= 1) {
                        
                        asignaturaEncontrada = false;
                                
                        opcionBuscar = JOptionPane.showInputDialog("Cual es la asignatura que deseas buscar ?");
                        
                        i = 0;
                        while(i<texto.length && asignaturaEncontrada == false){
                            if(texto[i].equals(opcionBuscar)){
                                asignaturaEncontrada = true;
                            }
                            i++;
                        }
                        
                        if(asignaturaEncontrada == false){
                            JOptionPane.showMessageDialog(null, "La asignatura no se encuentra en el array");
                        }else{
                            JOptionPane.showMessageDialog(null, "La asignatura ha sido encontrada en la posicion "+ (i-1));
                        }
                       
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay Registros en El arreglo", "Mostrar datos del vector", JOptionPane.ERROR_MESSAGE);
                    }
                break;
                
                case 7:
                    if (texto.length >= 1) {

                        Print = "Numero de Registros " + texto.length + "\n\n";   
                        
                        Collections.reverse(Arrays.asList(texto));
                        for (String lenguaje : texto) {
                            Print = Print + "Posicion " + (i + 1) + ": " + lenguaje + "\n";
                        }
                        
                        JOptionPane.showMessageDialog(null, " " + Print, "Mostrar datos del vector", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay Registros en El arreglo", "Mostrar datos del vector", JOptionPane.ERROR_MESSAGE);
                    }       
                break;
                
                case 8:
                    System.exit (0);
                break;
            }		
        }while(dato!=6);	
    }//fin metodo
}