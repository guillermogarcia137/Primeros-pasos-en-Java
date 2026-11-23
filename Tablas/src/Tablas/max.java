/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tablas;

import java.util.*;

/**
 *
 * @author Alumno
 */
public class max {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
    // TODO code application logic here
    int max;

    Scanner sc = new Scanner(System.in);
    int datos[] = {5, 2, 8, 1, 9, 3, 8};

    max = maximo(datos);
    System.out.println(Arrays.toString(datos));
    System.out.println("Máximo: " + max);
}

//************************************************************
// Definición de funciones
//************************************************************
    static int maximo(int num[]) {
        // Asignamos el valor de la primera posición de la tabla a la variable máximo
        
        int maximo = num[0];

        // Comparamos dicho valor con cada uno de los valores de la tabla
        for (int valor : num) {
            if (valor > maximo) { // si el valor es mayor que el máximo actual
                maximo = valor; // actualizamos el valor de máximo
            }
        }
        return maximo;
    }
    static int suma(int num[]) {
        
        int suma = num[0];
        for (int valor : num) {
                suma += valor;
        }
        return suma;
    }
}

