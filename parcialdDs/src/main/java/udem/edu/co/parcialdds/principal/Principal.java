/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.parcialdds.principal;

import java.util.ArrayList;
import java.util.List;
import udem.edu.co.parcialdds.interfaz.Calculo;
import udem.edu.co.parcialdds.modelo.CalculadoraAvanzada;
import udem.edu.co.parcialdds.modelo.CalculadoraSimple;

/**
 *
 * @author Santiago Soto
 */
public class Principal {
    public static void main(String[] args) {
        List<Calculo> calculadoras=new ArrayList<Calculo>();
        CalculadoraSimple calculadora1=new CalculadoraSimple("suma", 5, 6);
        CalculadoraSimple calculadora2=new CalculadoraSimple("resta", 7, 2);
        CalculadoraAvanzada calgrafica=new CalculadoraAvanzada("x+1");
        calculadoras.add(calculadora1);
        calculadoras.add(calculadora2);
        calculadoras.add(calgrafica);
        System.out.println(calculadoras.toString());
    }
}
