/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicionales;

import java.util.Scanner;

/**
 *
 * @author Guille
 */
public class ejGranja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numAnimales, comidaDiaria, kilosPorAnimal, comidaNecesaria;
        double kilosRacion;
        Scanner scan = new Scanner(System.in);

        System.out.print("Dime el numero de animales: ");
        numAnimales = scan.nextInt();

        if (numAnimales > 0) {
            System.out.print("Dime los kilos de comida por animal: ");
            kilosPorAnimal = scan.nextInt();
            System.out.print("Cuantos kilos de comida hay? ");
            comidaDiaria = scan.nextInt();

            comidaNecesaria = numAnimales * kilosPorAnimal;

            if (comidaDiaria >= comidaNecesaria) {
                kilosRacion = kilosPorAnimal;
                System.out.println("Hay suficiente comida para todos los animales");
            } else {
                kilosRacion = (double) comidaDiaria / numAnimales;
                System.out.println("No hay suficiente comida");
            }
            System.out.println("Su racion sera: " + kilosRacion);
        } else {
            System.out.println("No hace falta comida si no hay animales");
        }
    }
    
}
