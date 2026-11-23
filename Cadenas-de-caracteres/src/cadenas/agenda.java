
package cadenas;
import java.util.Scanner;
public class agenda {

    public static void main(String[] args) {
        // TODO code application logic here
        agenda();
    }
    public static void agenda(){
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        while (!salir){
            System.out.println("a) Añadir un nuevo contacto (nombre:telefono");
            System.out.println("b) Buscar el teléfono de un contacto a partir de su nombre");
            System.out.println("c) Mostrar la información de todos los contactos");
            System.out.println("Salir");
            String opcion = sc.next().toLowerCase(); //escanea y convierte en minuscula
            /*if (opcion.equals("a")){
                opcion = "1";
            }else if (opcion.equals("b")){
                opcion = "2";
            }else if (opcion.equals("c")){
                opcion = "3";
            }else{
                System.out.println("Error");
            }
            */
            //No hace falta esto para el case, se puede usar letras
            
            switch (opcion){

                case "a" -> añadirContacto() ;
                case "Salir" -> salir = true;
            }
        }
    }

    private static void añadirContacto() {
        System.out.println("hola");
    }
    private static void buscarTelefono() {
        System.out.println("hola");
    }
    
    
}
