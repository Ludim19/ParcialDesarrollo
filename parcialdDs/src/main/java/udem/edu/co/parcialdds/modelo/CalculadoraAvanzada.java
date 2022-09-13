/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.parcialdds.modelo;

import udem.edu.co.parcialdds.abstractas.OperacionesAvanzadas;
import udem.edu.co.parcialdds.interfaz.Calculo;

/**
 *
 * @author Santiago Soto
 */
public class CalculadoraAvanzada extends OperacionesAvanzadas implements Calculo{
    //Calculadora para hayar Y en funcion de X tomando como entrada una funcion
    private String funcion;

    public CalculadoraAvanzada(String funcion) {
        super(funcion);
        this.funcion = funcion;
    }

    @Override
    public String toString() {
        return "{"
                +"CalculadoraAvanzada:" 
                +"{"
                + "funcion:" + getFuncion()+","
                + super.toString()
             
                + "}"
                +"}";
    }
    
    
    
    //Getters and Setters
    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    @Override
    public int finResultado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
