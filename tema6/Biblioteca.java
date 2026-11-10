import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Comprobar si es capicúa");
            System.out.println("2. Calcular potencia");
            System.out.println("3. Contar dígitos");
            System.out.println("4. Voltear número");
            System.out.println("5. Quitar dígitos por detrás");
            System.out.println("6. Pegar dígito por delante");
            System.out.println("7. Salir");
            System.out.print("\nElige una opción (1-7): ");

            opcion = sc.nextInt();
        } while (opcion < 1 || opcion > 7);
        switch (opcion) {
            case 1:
                System.out.println("Has elegido comprobar si es capicúa");
                break;
            case 2:
                System.out.println("Has elegido calcular potencia");
                break;
            case 3:
                System.out.println("Has elegido contar dígitos");
                break;
            case 4:
                System.out.println("Has elegido voltear número");
                break;
            case 5:
                System.out.println("Has elegido quitar dígitos por detrás");
                break;
            case 6:
                System.out.println("Has elegido pegar dígito por delante");
                break;
            case 7:
                System.out.println("Has elegido salir");
                break;
            default:
                System.out.println("El nº no vale, elige un nº del 1 al 7");
        }
    }
}