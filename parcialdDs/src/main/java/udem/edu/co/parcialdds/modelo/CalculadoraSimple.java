/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.parcialdds.modelo;

import udem.edu.co.parcialdds.abstractas.OperacionesSimples;
import udem.edu.co.parcialdds.interfaz.Calculo;

/**
 *
 * @author Santiago Soto
 */
public class CalculadoraSimple extends OperacionesSimples implements Calculo{
    private int variable1;
    private int variable2;
    private String operacion;

    public CalculadoraSimple(String operacion,int variable1, int variable2) {
        super(operacion, variable1, variable2);
        this.variable1 = variable1;
        this.variable2 = variable2;
        this.operacion=operacion;
    }

    @Override
    public String toString() {
        return "{"
                +"CalculadoraSimple:"+"{" 
                +"operacion:"+getOperacion()+","
                + "variable1:" + getVariable1() + ","
                + "variable2:" + getVariable2() +","
                + super.toString()
                +"}"
              + "}";
    }
    
    public String getOperacion() {
        return operacion;
    }

    //Getters And Setters
    public void setOperacion(String operacion) {    
        this.operacion = operacion;
    }

    public int getVariable1() {
        return variable1;
    }

    public void setVariable1(int variable1) {
        this.variable1 = variable1;
    }

    public int getVariable2() {
        return variable2;
    }

    public void setVariable2(int variable2) {
        this.variable2 = variable2;
    }

    @Override
    public int finResultado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
