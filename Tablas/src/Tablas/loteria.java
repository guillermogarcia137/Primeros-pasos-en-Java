package Tablas;
import java.util.Arrays;
import java.util.Scanner;

//para evitar hacer esto se hace import java.util.*;

public class loteria {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int ganadora[] = {0,7,8,18,23,40};
        int boleto[] = {30,15,20,9,0,7};
        
        //System.out.println("Aciertos: " + chequeoPrimitiva(boleto,ganadora));
        // System.out.println("Aciertos2: " + chequeoPrimitiva2(boleto,ganadora));
        //int datos[];     | variable de tabla, esta vacia por que no se ha añadido nada
        
        int datos [] = new int[0];   //ahora si se ha creado la tabla
        
        System.out.println("Introducir numeros en la tabla. (Finalizar con 0) ");
        int numero;
        do {
            numero = sc.nextInt();
            if (numero !=0)
            datos = insertarElementoEnTabla(datos,numero);
        } while(numero !=0);
            System.out.println("Tabla final:  " + Arrays.toString(datos));
        
    }
    //-----------------------------------------------------------------------
    //--------------------Aqui empiezan las funciones------------------------
    //-----------------------------------------------------------------------
    
    static int[] sinRepetidos(int t []){
    int tfinal[] = new int[0];
    
    return t ;
    }
    static int chequeoPrimitiva(int[] boleto, int[] ganadora){ //aqui ordenamos primero
        int numAciertos = 0;
        if (boleto.length != ganadora.length){
            System.out.println("Tablas de distinto tamaño");
        }else{
            Arrays.sort(boleto);
            Arrays.sort(ganadora);
            for (int i = 0; i < boleto.length; i++) {
                if(boleto [i] == ganadora[i])
                    numAciertos++;
            }
        }
        return numAciertos;
    }
    static int chequeoPrimitiva2(int[] boleto, int[] ganadora){ //en esta lo vamos recorriendo 
    int numAciertos = 0; 
    for (int i = 0; i < boleto.length; i++) { 
        for (int j = 0; j < ganadora.length; j++) { 
            if(boleto[i] == ganadora[j])
                numAciertos++; 
        }
    }
    
    return numAciertos; 
}
    //como lo hace el libro 
    //Devuelve el número de coincidencias entre los elementos de las tablas //[cite: 3]
static int primitiva(int apuesta[], int[] combinacionGanadora) { //[cite: 3]
    int aciertos = 0; //contador de aciertos //[cite: 3]

    for (int a : apuesta) { // recorremos la tabla de apuesta //[cite: 3]
        //aprovechamos que la tabla con la combinación está ordenada //[cite: 3]
        if (Arrays.binarySearch(combinacionGanadora, a) >= 0) { //si está //[cite: 3]
            aciertos++; //hemos acertado un número más //[cite: 3]
        } //[cite: 3]
    } //[cite: 3]
    return (aciertos); //[cite: 3]
} //[cite: 3]

//lo que hace es ordenar y luego usar binarySearch para buscar, que solo funciona cuando esta ordenada 
//funciones tablas dinamicas
    static int[] insertarElementoEnTabla(int t[], int elem){
    t = Arrays.copyOf(t, t.length +1);
    t[t.length-1] = elem;
        System.out.println("Tras insertar el elemento en el nuevo hueco: + " + Arrays.toString(t));
    return t;
    }

    static void modificarElementoEnTabla (int t[], int indice, int nuevoValor){
        t[indice] = nuevoValor;
        
    }

}
