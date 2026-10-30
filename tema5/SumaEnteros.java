import java.util.Scanner;
public class SumaEnteros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int suma = 0;
        System.out.println("Introduzca nº o cero para terminar");
        do {
        System.out.print("Introduce el primer nº: ");
        numero = sc.nextInt();
        suma += numero;
        } while (numero !=0);
        
        System.out.println("La suma total es: " + suma);
        
        sc.close();
    }
}