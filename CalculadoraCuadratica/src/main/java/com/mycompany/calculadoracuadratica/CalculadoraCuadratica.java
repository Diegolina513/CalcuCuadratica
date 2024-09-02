
package com.mycompany.calculadoracuadratica;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class CalculadoraCuadratica {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        double numS1,numS2,numR1,numR2,numD1,numD2;
         double numC1,numC2,numC3;
         double numL1;
        
         System.out.println(" Ingrese 2 numeros para la suma:");
        numS1= scanner.nextDouble();
        numS2= scanner.nextDouble();
        System.out.println(" Ingrese 2 numeros para la resta:");
        numR1= scanner.nextDouble();
        numR2= scanner.nextDouble();
        System.out.println(" Ingrese 2 numeros para la division:");
        numD1= scanner.nextDouble();
        numD2= scanner.nextDouble();
         System.out.println(" Ingrese 3 numeros para la cuadratica:");
        numC1= scanner.nextDouble();
        numC2= scanner.nextDouble();
        numC3= scanner.nextDouble();
         System.out.println(" Ingrese 1 numeros para el limite:");
        numL1= scanner.nextDouble();
       
        
        
        
        
        
       Forma suma = new Suma(numS1,numS2);
        Forma resta = new Resta(numR1,numR2);
        Forma division = new Division(numD1,numD2);
        Forma cuadratica = new Cuadratica(numC1,numC2,numC3);
        Forma cuadraticaN = new CuadraticaNegativa(numC1,numC2,numC3);
        Forma lim = new Lim(numL1);

        suma.mostrarCalculo();
        resta.mostrarCalculo();
        division.mostrarCalculo();
        cuadratica.mostrarCalculo();
         cuadraticaN.mostrarCalculo();
          if(numL1==3)
        {
        System.out.println("la funcion se indefine");
        }
        else
        {
        lim.mostrarCalculo();
        }
  }
 }