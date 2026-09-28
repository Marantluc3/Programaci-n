import java.util.Scanner;
public class conversionTemperatura {
    public static void main(String[] args) {
        double celsius = 0.0;
        double fahrenheit = 0.0;
        Scanner sc = new Scanner(System.in);
        //Mostramos en pantalla
        System.out.println("calculamos el nº de grados celsius con el nº de grados fahrenheit");
        System.out.println("introduce el nº de grados Fahrenheit");
        //Leemos desde teclado
        fahrenheit =sc.nextDouble();
        //Calculamos
         celsius= (5.0/9) * (fahrenheit - 32);
        //Mostramos el resultado
        System.out.println("el nº de grados celsius es" + celsius);
    }
}