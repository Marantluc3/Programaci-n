import java.util.Scanner;
public class Array10Inverso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        System.out.println("Introduzca 10 números: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("Nº " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }   
        System.out.println("Nº en orden inverso:");
        for (int i = 9; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }

        sc.close();
    }
}