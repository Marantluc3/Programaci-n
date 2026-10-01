import java.util.Scanner;
public class NumeroMenor {
    public static void main(String[] args) {
        int numero1, numero2, numero3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        numero1 = sc.nextInt();
        System.out.println("Introduce el segundo número: ");
        numero2 = sc.nextInt();
        System.out.println("Introduce el tercer número: ");
        numero3 = sc.nextInt();
        if (numero1 < numero2 && numero1 < numero3) {
            System.out.println("El número menor es: " + numero1);
        } else if (numero2 < numero1 && numero2 < numero3) {
            System.out.println("El número menor es: " + numero2);
        } else {
            System.out.println("El número menor es: " + numero3);
        }
        sc.close();
    }
}