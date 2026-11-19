import java.util.Scanner;
public class DivisoresPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un nº entero positivo: ");
        int n = sc.nextInt();
        if (n<=1) {
            System.out.println("El número debe ser mayor que 1.");
        } else {
            int resultado = divisoresPrimos(n);
            System.out.println("El número de divisores primos de " + n + " es: " + resultado);
        }
        sc.close();
    }
   public static int divisoresPrimos(int n) {
    int divisores = 0;
    int aux = n;
    for (int i = 2; i <= n; i++) {
        if (n % i == 0) {
            divisores++;
            while (aux % i == 0) {
                aux /= i;
            }
        }
        if (aux == 1) {
            break;
        }
    }
    return divisores;
   }
}