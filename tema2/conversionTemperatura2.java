import java.util.Scanner;
public class conversionTemperatura2 {
    public static void main(String[] args) {
        double celsius = 0.0;
        double fahrenheit = 0.0;
        Scanner sc = new Scanner(System.in);
        //Mostramos en pantalla
        System.out.println("calculamos el nº de grados fahrenheit con el nº de grados celsius");
        System.out.println("introduce el nº de grados Celsius");
        //Leemos desde teclado
        celsius = sc.nextDouble();
        //Calculamos
         fahrenheit = (9.0 / 5.0) * celsius + 32;
        //Mostramos el resultado
        System.out.println("el nº de grados fahrenheit es" + fahrenheit);
    }
}