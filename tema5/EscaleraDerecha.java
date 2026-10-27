import java.util.Scanner;
public class EscaleraDerecha {
    public static void main(String[] args) {
        final int MAX = 4;

            System.out.println();
        //Mostramos la  escalera
        System.out.println("Muestro la escalera");
           for (int i = 1; i <= MAX; i++) {
            //pintamos en pantalla los espacios dentro de cada fila
            for (int j = MAX - i; j > 0; j--)
                System.out.print(" ");
            //Mostramos los nº dentro de cada fila
            for (int k = i; k >= 1; k--) 
                System.out.print(k);
            System.out.println();
        }
    }
}
