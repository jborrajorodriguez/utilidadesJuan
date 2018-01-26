package com.juan.validar;

import javax.swing.JOptionPane;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class ValidacionNumeros {
    /**
     * Metodo que sirve para la validacion de un numero
     * @param min numero mennor del rango
     * @param max numero mayor del rango
     * @param num numero que se va ha validar
     * @return el numero validado
     */
    public static float validacionNum(float min,float max,float num) {
        
        do {
            num=Float.parseFloat(JOptionPane.showInputDialog("Introduce el número en el rango "+min+"---"+max));
            
            
        }
        while (num<min||num>max);
        
        return num;
        
   

    }
    
    
    
    
    

}
