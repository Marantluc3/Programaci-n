import java.util.Scanner;
public class NumeroMayor {
    public static void main(String[] args) {
        int numero1, numero2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        numero1 = sc.nextInt();
        System.out.println("Introduce el segundo número: ");
        numero2 = sc.nextInt();
        if (numero1 > numero2) {
            System.out.println("El número mayor es: " + numero1);
        } else { 
            System.out.println("El número mayor es: " + numero2);
        
        }
        sc.close();
    }
}