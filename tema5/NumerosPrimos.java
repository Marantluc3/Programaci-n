import java.util.Scanner;
public class NumerosPrimos {
    public static void main(String[] args) {
        final int MAX_PRIMOS = 50;
        int num = 2, cont= 0;
        boolean esPrimo;
        Scanner sc = new Scanner(System.in);

        while ( cont < MAX_PRIMOS ) {
            //averiguamos si nº es primo
            esPrimo = true;
            if ( num <= 1 )
                esPrimo = false;
            else {
                for ( int i = 2; i < num; i++)
                    if (num % i == 0)
                        esPrimo = false;
            }
            if (esPrimo) {
                cont++;
                System.out.print(num +" ");
            }
            num++;
        }
        sc.close();
    }
}