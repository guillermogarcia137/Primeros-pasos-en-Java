/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicionales;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Guille
 */
public class ejCalculadora {
//ejercicio calculadora con ramdom 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2, calculo;
        Random rd = new Random(); 
        Scanner sc = new Scanner(System.in);
        //System.out.println( (int) (Math.random()*100));
        int operacion = rd.nextInt(1,4);
        num1 = rd.nextInt(1,100);
        num2 = rd.nextInt(1,100);
                calculo = 0;

        String operacionTexto = switch (operacion) { // ejemplo con switch y case
            case 1 -> {
                calculo = num1 + num2;
                yield "sumar";
            }
            case 2 -> {
                calculo = num1 - num2;
                yield "restar";
            }
            case 3 -> {
                calculo = num1 * num2;
                yield "multiplicar";
            }
                    default -> "El random de operacion va mal ";
                        
        }; //importante poner punto y coma 
        System.out.println("Dime el resultado de " + operacionTexto + " los numeros "
                + num1 + " y " + num2);
        int resultadoUsuario = sc.nextInt();
        if (resultadoUsuario == calculo) System.out.println("Correcto");
        else System.out.println("Va a ser que no");
        
        /*
        if (operacion == 1) operacionTexto = "suma";
        else if (operacion == 2) operacionTexto = "resta ";
        else if (operacion == 3) operacionTexto = "multipicacion";
        */
    }
    
}
