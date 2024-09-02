/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoracuadratica;

/**
 *
 * @author diego
 */
public class Cuadratica extends Forma{
    private double num1;
    private double num2;
    private double num3;
    public Cuadratica(double num1,double num2,double num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    @Override
    public double calcular() {
      return (-num2 + Math.sqrt((num2 * num2) - (4 * num1 * num3))) / (2 * num1);

    }
}
