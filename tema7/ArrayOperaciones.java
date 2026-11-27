import java.util.Scanner;
public class ArrayOperaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numeros[] = new double[10];
        System.out.println("Introduce diez nº: ");
        for (int i = 0; i < 10; i++) {
            numeros[i]= sc.nextDouble();
        }

        double suma = numeros[0];
        double resta = numeros[0];
        double multiplicacion = numeros[0];
        double division = numeros[0];

        for (int i = 1; i < 10; i++) {
            suma += numeros[i];
            resta -= numeros[i];
            multiplicacion *= numeros[i];
            
            if (numeros[i] != 0) {
                division /= numeros[i];
            } else {
                System.out.println("No se puede dividir entre 0.");
            }
        }

        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicación es: " + multiplicacion);
        System.out.println("El resultado de la división es: " + division);
        
    sc.close();
    }
   
}