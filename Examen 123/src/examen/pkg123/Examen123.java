
package examen.pkg123;
import java.util.*;   //con esto importamos Scanner y el resto de util

public class Examen123 {
    public static void main(String[] args) {  
        // Alumno: Guillermo García Pérez
        Scanner sc = new Scanner(System.in);
        int edad, menores = 0, numCarnet=0, numEstudiantes=0;
        int contadorModulos = 0, sumaModulos = 0, mediaModulos=0;
        double modulos;
        double sumaEdad = 0, contadorEdad = 0, mediaEdad = 0;
        String nombre, ciudad, ciclo;
        boolean carnet;
        System.out.println("Vamos a recoger datos de alumnos "
                + "(finalizar con 0 en edad)");
        while (true){    
            System.out.println("Dime su edad: ");
            edad = sc.nextInt();
            if (edad == 0 )
                break; //si edad es igual a 0 se termina el bucle 
            else { 
                System.out.println("Dime su nombre: ");
                nombre = sc.next();
                System.out.println("Dime su ciudad de nacimiento: ");
                ciudad = sc.next();
                System.out.println("Tiene carnet de conducir. (true/false):  ");
                carnet = sc.nextBoolean();
                System.out.println("Que ciclo esta estudiando (DAM, DAW, ASIR, SMR:  ");
                ciclo = sc.next();
                System.out.println("Cuantos modulos cursa: ");
                modulos = sc.nextDouble();
                numEstudiantes++;
                
                if (edad < 18 && !carnet){ 
                    menores++;// si es mejor y no tiene carnet
                    System.out.println(nombre + ", de " + ciudad + ", es menor de edad,"
                            + " no tiene carnet y estudia "+modulos +" modulos en "+ ciclo );
                    
                }else if (edad >= 18 && carnet) { // si es mayor de edad y tiene carnet
                    System.out.println(nombre + ", de " + ciudad + ", es mayor de edad, tiene carnet"
                            + " y estudia "+modulos +" modulos en "+ ciclo );
                    numCarnet++;
                }else {  // si es mayor de edad pero no tiene carnet
                    System.out.println(nombre + ", de " + ciudad + ", es meyor de edad, tiene carnet"
                            + " y estudia "+modulos +" modulos en "+ ciclo );
                    numCarnet++;
                }
            }//cierre else           
            //calcular edad media
            sumaEdad += edad;
            contadorEdad++;
            mediaEdad = sumaEdad/contadorEdad;
            //calcular media modulos 
            sumaModulos +=modulos;
            contadorModulos++;
            mediaModulos = sumaModulos/contadorModulos;
                
            // cierre de else
        }//cierre while
        // estadisticas, ya fuera de bucle
        System.out.println("Hay " + menores + " menores de edad");
        System.out.println("La media de edad es: "+ mediaEdad);
        System.out.println("La media de modulos matriculados por estudiante es: "+mediaModulos);
        System.out.println(numCarnet +" estudiantes tiene carnet de conducir");
        System.out.println("Hemos recogido datos de "+numEstudiantes+ " estudiantes");
    }
}
