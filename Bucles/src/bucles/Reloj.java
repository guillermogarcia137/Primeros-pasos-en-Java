
package bucles;

import java.util.Scanner;

public class Reloj {

    public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
        int hora, minutos, segundos, incremento;
        System.out.println("Dime la hora  ");
        hora = sc.nextInt();
        if (hora>23){
            System.out.println("Formato de hora incorrecto");
            sc.close();
        }else{
            System.out.println("Dime los minutos  ");
            minutos = sc.nextInt();
            if (minutos >59){
                System.out.println("Formato de hora incorrecto");
                sc.close();
            }else{
                System.out.println("Dime los segundos  ");
                segundos = sc.nextInt();
                if (segundos >59){
                System.out.println("Formato de hora incorrecto");
                }else{
                    System.out.println("Cuanto quieres sumarle ? ");
                    incremento = sc.nextInt();
        
                        for (int i = 0; i < incremento; i++) {
                            segundos++;
                            if (segundos > 59){
                                segundos = 0;
                                minutos ++;
                            }
                            if (segundos >59){ 
                                segundos = segundos - 60;
                                minutos ++;
                            }
                            if (minutos > 59){
                                minutos = 0;
                                hora++;
                            }
                            if (hora >23 ){
                                hora =0;
                            }
                        }
                        System.out.printf("La hora final es: %02d:%02d:%02d%n", hora, minutos, segundos);                          

                }
            }
        }
    }
}
