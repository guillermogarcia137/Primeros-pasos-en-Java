package encasa;
import java.util.*;
public class tres {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String operacion;
        double resultado = 0, num1, num2;
        System.out.println("Que operacion quieres hacer ? sumar, restar, multiplicar");
        operacion = sc.next();
        System.out.println("Dime el primer numero: ");
        num1 = sc.nextDouble();
        System.out.println("Dime el segundo numero");
        num2 = sc.nextDouble();
        switch (operacion) {
            case "sumar" -> resultado = num1+num2;
            
            case "restar" -> resultado = num1-num2;
            
            case "multiplicar" -> resultado = num1*num2;
            
            default -> System.out.println("ERROR");
        }
        System.out.println("El resultado de " + operacion + " " + num1 
                           + " y " + num2 + " es " + resultado );
    }
    
}
