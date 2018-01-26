package com.juan.ordenar;
/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class OrdenarArrays {
    
    public static void ordArrays(float[]tem){
        int i,j;
        float aux;
        for(i=0;i<tem.length-1;i++)
            for(j=i;j<tem.length;j++){
                if(tem[i]<tem[j]){
                    aux=tem[i];
                    tem[i]=tem[j];
                    tem[j]=aux;
                }
            }
    }
    public static void reverseOrdArray(){
        
    }

}
