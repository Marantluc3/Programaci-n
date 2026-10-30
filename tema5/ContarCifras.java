import java.util.Scanner;
public class ContarCifras {
    public static void main(String[] args) {
        int numero;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un nº entero positivo: ");
        numero = sc.nextInt();
        if (numero == 0) {
            System.out.println("El nº tiene 1 cifra");
        } else {
        int contador = 0;
        int aux = numero;

            while (aux > 0) {
                aux = aux / 10;
                contador++;
            }
            System.out.println("El nº " + numero + " tiene " + contador + " cifras.");
            sc.close();
        }
    }
}