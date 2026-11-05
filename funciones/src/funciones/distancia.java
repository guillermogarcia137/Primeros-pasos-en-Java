package funciones;

public class distancia {
    
    public static void main(String[] args) {
        // TODO code application logic here
        double x1 = 1.1, y1 = 2.2,x2 = 3.3,y2 = 4.4;
        
       
        //Tambien se puede hacer 
        /* 
        double distancia = distancia(x1, y1,x2,y2);
        System.out.println(distancia);
       */
        System.out.print("La distancias es " + distancia(x1, y1,x2,y2));
    }
    static double distancia(double x1, double y1, double x2, double y2){
        
        double distancia = Math.sqrt(Math.pow((x1 - x2),2 ) + Math.pow((y1 - y2),2 ) );  
//esta distancia es una variable lo otro es lo de la funcion, ademas solo se ve en la funcion
        return distancia;
     
    }
}
