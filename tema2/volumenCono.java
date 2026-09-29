import java.util.Scanner;
public class volumenCono {
public static void main(String[] args) {
    double volumen;
    double radio;
    double altura;
    Scanner sc = new Scanner (System.in);
    //Mostramos en pantalla
    System.out.println("Calculamos el volumen de un cono");
    System.out.println("--------------------------------------------------------------");
    System.out.println("Introduce el radio del cono");
    //Leemos desde teclado
    radio = sc.nextDouble();
    System.out.println("Introduce la altura del cono");
    //Leemos desde teclado
    altura = sc.nextDouble();

    //Calculamos
    volumen = 0.33 * 3.14159 * Math.pow(radio, 2) * altura;

    //Mostramos el resultado
    System.out.println("El volumen del cono es: " + volumen);
}
}
