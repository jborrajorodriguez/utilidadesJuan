package com.juan.validar;

import javax.swing.JOptionPane;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class ValidacionNumeros {

    public static float validacionNum(float min,float max,float num) {
        
        do {
            num=Float.parseFloat(JOptionPane.showInputDialog("Introduce el número en el rango "+min+"---"+max));
            
            
        }
        while (num<min||num>max);
        
        return num;
        
   

    }
    
    
    
    
    

}
