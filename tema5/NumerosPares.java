import java.util.Scanner;
public class NumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.print("Introduce un nº: ");
        numero = sc.nextInt();
        System.out.println("Los nº pares entre el 1 y el " + numero + " son: ");
        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}