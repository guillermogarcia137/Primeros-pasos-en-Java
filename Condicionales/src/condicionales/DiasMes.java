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
public class DiasMes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mes, dias;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el numero del mes: ");
        mes = scan.nextInt();
                //asi
/*
        switch(mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> dias = 31;
            case 2 -> dias = 28;
            case 4, 6, 9, 11 -> dias = 30;
            default -> {
                dias = -1;
                System.out.println("Ese numero no se corresponde con ningun mes");
            }
                    
        }
*/
        // osi
        //este es el original 
        switch(mes) {
            //asi 
            case 1, 3, 5, 7, 8, 10, 12:
                dias = 31;
                break;
            case 2:
                dias = 28;
                break;
            case 4, 6, 9, 11:
                dias = 30;
                break;
            default:
                dias = -1;
                System.out.println("Ese numero no se corresponde con ningun mes");

        }
        System.out.println("Tiene " + dias + " dias");
    }
    
}
