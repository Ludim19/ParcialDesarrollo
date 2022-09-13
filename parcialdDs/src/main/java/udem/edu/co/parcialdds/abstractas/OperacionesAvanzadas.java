/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.parcialdds.abstractas;

import java.util.Arrays;

/**
 *
 * @author Santiago Soto
 */
public abstract class OperacionesAvanzadas {
    int[] result;
    int[] arreglox;
    
    public OperacionesAvanzadas(String funcion) {
        this.result = fx(funcion);
        this.arreglox=x(funcion);
    }

    @Override
    public String toString() {
        return  "x:" + Arrays.toString(getArreglox())+","
                +"y:"+ Arrays.toString(getResult())  ;
    }

    public int[] getArreglox() {
        return arreglox;
    }

    public void setArreglox(int[] arreglox) {
        this.arreglox = arreglox;
    }
    
    public int[] getResult() {
        return result;
    }

    public void setResult(int[] result) {
        this.result = result;
    }
    private int[] x(String funcion){
        int[] result=new int[10];
        
        for (int i = 0; i < 10; i++) {
            result[i]=i;
            
        }
        return result;
    }
    private int[] fx(String funcion){
        int[] result=new int[10];
        int aux=0;
        for (int i = 0; i < 10; i++) {
            aux=i+1;
            result[i]=aux;
            aux=0;
        }
        return result;
    }
}
