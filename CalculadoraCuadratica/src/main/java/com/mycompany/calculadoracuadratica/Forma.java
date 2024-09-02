/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoracuadratica;

abstract class Forma {
    public abstract double calcular();

    public void mostrarCalculo() {
        System.out.println("El resultado es: " + calcular());
    }
}