import java.util.Scanner;
public class VolumenCilindro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Qué radio tiene el cilindro?: ");
        double r = sc.nextDouble();

        System.out.print("¿Qué altura tiene el cilindro?: ");
        double h = sc.nextDouble();

        volumenCilindro(r, h);
    }

    public static void volumenCilindro(double radio, double altura) {
        double volumen = Math.PI * Math.pow(radio, 2) * altura;
        System.out.println("El volumen del cilindro es: " + volumen);
    }
}