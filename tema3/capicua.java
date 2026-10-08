import java.util.Scanner;
public class capicua {
    public static void main(String[] args) {
        int original = 0;
        int numero = 0;
        int inverso = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero entero positivo y menor de 6 cifras: ");
        original = sc.nextInt();
        numero = original;
        if (original  > 99999) {
            System.out.println("cifra inválida");
        } else if (original < 0) {
            System.out.println("signo inválido");
        } else {
            //uso bucle
            while (numero != 0) {
                inverso = inverso * 10 + numero % 10;
                numero = numero / 10;
            } if (original == inverso) {
                System.out.println(original + " es un nº capicúa");
            } else if (original != inverso) {
                System.out.println(original + " no es un nº capicúa");
            }
        }
        sc.close();
    }
}