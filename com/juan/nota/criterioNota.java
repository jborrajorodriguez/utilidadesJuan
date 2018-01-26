package com.juan.nota;

import javax.swing.JOptionPane;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */

/**
 *
 * @author Juan
 */
public class criterioNota {

    private static float notaEscrita1, notaEscrita2, practica, nBoletines, nBoletinesTotal, notaTotal, notaBoletin, nota;

    public static float calculoDeNotas(float max,float min) {
        
        do{
        notaEscrita1=Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota de la primera proba escrita"));
        }while(notaEscrita1>max||notaEscrita1<min);
        do{
        notaEscrita2=Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota de la segunda proba escrita"));
        }while(notaEscrita2>max||notaEscrita2<min);
        do{
        practica=Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota de la proba practica"));
        }while(practica>max||practica<min);
        nBoletines=Float.parseFloat(JOptionPane.showInputDialog("Introduce el numero de boletines"));
        nBoletinesTotal=Float.parseFloat(JOptionPane.showInputDialog("Introduce el numero total de boletines"));

        float porcentaxeA=(float) (nBoletinesTotal/0.9);
        if (nBoletines>(nBoletinesTotal*0.9)) {
            notaBoletin=2;
        }
        else if (nBoletines<=nBoletinesTotal*0.9&&nBoletines>nBoletinesTotal*0.7) {
            notaBoletin=1;
        }
        else {
            notaBoletin=0;

        }

        notaTotal=(float) ((((notaEscrita1+notaEscrita2)/2)*0.4)+(practica*0.4))+notaBoletin;

        return notaTotal;

    }

}
