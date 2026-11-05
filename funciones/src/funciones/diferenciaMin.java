package funciones;
public class diferenciaMin {

    public static void main(String[] args) {
        // TODO code application logic here
        int diferencia = diferenciaMin (2,20,1,10);
        System.out.println(diferencia);
    }
    static int diferenciaMin (int hora1, int minuto1, int hora2, int minuto2){
        int diferencia = (hora1-hora2)*60+(minuto1-minuto2);
        return diferencia;
    }
}
