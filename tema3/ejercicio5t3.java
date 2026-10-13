import java.util.Scanner;
public class ejercicio5t3 {
    public static void main(String[] args) {
        double nota1, nota2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la primera nota: ");
        nota1 = sc.nextDouble();
        System.out.println("Introduce la segunda nota: ");
        nota2 = sc.nextDouble();
        double media = (nota1 + nota2) / 2;
        if (media >= 5) {
            System.out.println("Apto, tu media es:" +media);
        } else {
             System.out.println("¿Resultado de la recuperación? (apto/no apto)");
            String resultado = sc.next();
            if (resultado.equalsIgnoreCase("apto")) {
                System.out.println("Has recuperado, tu nota es un 5");
            } else {
                System.out.println("No apto, tu media es:" + media);
            }
        }
    }
}