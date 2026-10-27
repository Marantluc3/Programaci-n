import java.util.Scanner;
public class EscaleraDerecha {
    public static void main(String[] args) {
   
            System.out.println();
        //Mostramos la segunda escalera
           for (int i = 1; i <= 4; i++) {
            //pintamos en pantalla los espacios dentro de cada fila
            for (int j = (4*3) - (i*3); j > 0; j--)
                System.out.print(" ");
            //Mostramos los nº dentro de cada fila
            for (int k = 1; k <= i; k++) 
                System.out.print(k + "  ");
            System.out.println();
        }
    }
}