import java.util.Scanner;

public class Maximo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        System.out.print("Introduce un número: ");
        num1 = sc.nextInt();
        System.out.print("Introduce otro número: ");
        num2 = sc.nextInt();
        System.out.println("El máximo es " + max(num1, num2));
        sc.close();
    }
     public static int max(int numero1, int numero2) {
        int result = Math.max(numero1, numero2);
        return result;
    }
}