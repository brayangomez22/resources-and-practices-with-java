/*
Una persona enferma que pesa 70 kilogramos se encuentra en reposo y desea saber
cuántas calorías consume su cuerpo durante todo el tiempo que realice una misma
actividad. Las actividades que tiene permitido realizar son únicamente dormir o estar
sentado en reposo. Los datos que tiene son que estando dormido consume 1.08 calorías
por minuto y estando sentado en reposo consume 1.66 calorías por minuto.
 */
package ejercicio.pkg5;

import javax.swing.JOptionPane;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        String obesa;
        int peso = 70, minutosSueño, tiempoSentado;
        double dormir = 1.08, sentado = 1.66, datoDormir, datoSueño, calorias;
        
        obesa = JOptionPane.showInputDialog("Cual es el nombre de la persona obesa");
        minutosSueño = Integer.parseInt(JOptionPane.showInputDialog("Cuantos minutos duerme "+obesa+" por dia"));
        tiempoSentado = Integer.parseInt(JOptionPane.showInputDialog("Cuanto tiempo permanece "+obesa+" sentado por dia"));

        datoDormir = dormir * minutosSueño;
        datoSueño = sentado * tiempoSentado;
        calorias = datoDormir + datoSueño;
        
        JOptionPane.showMessageDialog(null,"Las calorias que consume "+obesa+" durante todo el tiempo que realice una actividad es de: "+calorias);
        
    }
    
}
