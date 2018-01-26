package com.juan.datos;

import javax.swing.JOptionPane;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class PedirDatos {
    
    public static String leerString(String mensaxe){
        String dato;
        dato=JOptionPane.showInputDialog(mensaxe);
        return dato;
    }
    
    public static int leerInt(String mensaxe){
        int dato=Integer.parseInt(JOptionPane.showInputDialog("Dame numero"));
        return dato;
    }

}
