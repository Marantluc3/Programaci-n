import java.util.Scanner;
public class NumeroValido {
    public static void main(String[] args) {
     int numero;
     Scanner sc = new Scanner(System.in);
     System.out.println("Introduce un número entre el 0 y el 9.999: ");
     numero = sc.nextInt();
     if (numero < 0 || numero > 9999) {
        System.out.println("El número es inválido.");
     } else {
        if (numero <10) {
            System.out.println("El número tiene 1 cifra.");
        } else if (numero <100) {
            System.out.println("El número tiene 2 cifras.");
        } else if (numero <1000) {
            System.out.println("El número tiene 3 cifras.");
        } else {
            System.out.println("El número tiene 4 cifras.");
        }
        sc.close();
     }
    }
    
}