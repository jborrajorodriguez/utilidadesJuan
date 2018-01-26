package com.juan.datos;

import javax.swing.JOptionPane;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class PedirDatos {
    /**
     * Metodo para leer un mensaje
     * @param mensaxe tipo string 
     * @return un String
     */
    public static String leerString(String mensaxe){
        String dato;
        dato=JOptionPane.showInputDialog(mensaxe);
        return dato;
    }
    /**
     * Metodo para leer una variable de tipo int
     * @param mensaxe
     * @return devuelve un valor de tipo int
     */
    public static int leerInt(String mensaxe){
        int dato=Integer.parseInt(JOptionPane.showInputDialog("Dame numero"));
        return dato;
    }

}
