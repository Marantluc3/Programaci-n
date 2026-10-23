import java.util.Scanner;

public class dossiete {
    public static void main(String[] args) {
        // 1. Inicio el Scanner que lee el teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número (entre 2 y 7 dígitos): ");
        String texto = sc.nextLine();
        
        // 2. veo la longitud (2 a 7) y que sean dígitos
        if (texto.length() >= 2 && texto.length() <= 7 && texto.matches("\\d+")) {
            System.out.println("¡Perfecto! El número introducido es válido: " + texto);
        } else {
            System.out.println("Error: El texto debe ser un número con una longitud entre 2 y 7 dígitos.");
        }
        
        sc.close();
    }
}