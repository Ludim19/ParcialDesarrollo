/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.parcialdds.abstractas;

/**
 *
 * @author Santiago Soto
 */
public abstract class OperacionesSimples {
    private float result;
    public OperacionesSimples(String operacion,int a,int b) {
        if (operacion=="suma") {
            this.result=suma(a,b);
        }
        if (operacion=="resta") {
            this.result=resta(a,b);
        }
        if (operacion=="multiplicacion") {
            this.result=multiplicacion(a,b);
        }
        if (operacion=="division") {
            this.result=division(a,b);
        }
    }

    @Override
    public String toString() {
        return "result:" + getResult();
    }
    
    public float getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }
    
    
    private int suma(int a,int b){
        return a+b;
    }
    private int multiplicacion(int a,int b){
        return a*b;
    }
    private int resta(int a,int b){
        return a-b;
    }
    private float division(int a,int b){
        return a/b;
    }
}
