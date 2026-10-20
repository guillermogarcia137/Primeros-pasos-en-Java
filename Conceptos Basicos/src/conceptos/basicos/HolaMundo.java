/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conceptos.basicos;
import java.util.Scanner;
/**
 *
 * @author Guille
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         byte variableByte;
         variableByte = 127;
        System.out.println(variableByte);
        variableByte++; //asi se desborda 
        System.out.println(variableByte);
        
        
        variableByte = 123;   //luego lo podemos actualizar
        System.out.println(variableByte);
        //si usamos int solo llega hasta 127 y -128, apartir de eso ya pasamos a int
        int variableInt;
        variableInt = 129; 
        System.out.println(variableInt);
        
        
        final double PI;
        
        PI = 3.14;          // esto es una constante, no cambia como las variables y siempre se pone en mayusculas 
        
        
        java.time.LocalTime hora;
        hora = java.time.LocalTime.now();  //aqui se ven las APIs     
        System.out.println(hora);
        
        /**
         * Y ahora vamos arriba a importar para no tener que escribir javatime
         */
        
        
       double valorNumerico = 16;
       double raizCuadrada;
            raizCuadrada = Math.sqrt(valorNumerico);
        System.out.println(raizCuadrada);    
            //Ahora algo más extendido y vamos a usar Math.ramdom para general la raiz cuadrada de un numero aleatorio, asi usamos otra funcion de las librerias
            System.out.println("Raiz cuadrada de " + valorNumerico + ": " + raizCuadrada);
          
         double valorRandom = Math.random();
            double raizCuadradaRandom;
                  raizCuadradaRandom = Math.sqrt(valorRandom);
                         System.out.println(raizCuadradaRandom);
                            System.out.println("Raiz cuadrada de " + valorRandom + " es " + raizCuadradaRandom);
                            
         //pasamos a los escaners
         
         int edad;
         String nombre;
         String direccion;
         
                // como nombre y dirección son del mismo tipo los puedo declarar en la misma linea poniendo una como seria " String nombre, dirección; "
         
         Scanner miScanner = new Scanner(System.in);
           System.out.println("dime tu edad");
        edad = miScanner.nextInt();
        //  System.out.println("dime tu dirección");
        //   direccion = miScanner.next();
        
      
      //  miScanner.useLocale(locale.US);

      //  System.out.println("Dime tu peso: ");
      //  peso = miScanner.nextDouble();
        
       // System.out.println("Dime tu peso: ");
      //  System.out.println("Tu peso es: " + peso);

    }
    
}
