import java.util.Scanner;
public class divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int numero;
       int resultado;
        System.out.println("Introduzca un número: ");
        numero = sc.nextInt();
        if (numero % 2 == 0 && numero % 3 == 0) 
            System.out.println("El número es divisible entre 2 y 3");
        else if (numero % 2 == 0 && numero % 3 != 0)
            System.out.println("El nº es divisible entre 2 pero no entre 3");
        else if (numero % 2 != 0 && numero % 3 == 0)
            System.out.println("El nº es divisible entre 3 pero no entre 2");
        else
            System.out.println("El nº no es divisible entre 2 ni entre 3");
        sc.close();
        }
    }
