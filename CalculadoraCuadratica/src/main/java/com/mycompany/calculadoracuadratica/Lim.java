/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoracuadratica;

/**
 *
 * @author diego
 */
class Lim extends Forma {
     private double num1;
    public Lim(double num1) {
        this.num1 = num1;
        
    }

    @Override
    public double calcular() {
      return (num1+2)/(num1-3);
    }
    
    
}
