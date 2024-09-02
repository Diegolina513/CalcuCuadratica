/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoracuadratica;

/**
 *
 * @author diego
 */
class Suma extends Forma {
private double num1;
    private double num2;
    public Suma(double num1,double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public double calcular() {
      return num1+num2; 
    }
}