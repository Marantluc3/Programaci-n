import java.util.Scanner;
public class conversor2 {
    public static void main(String[] args) {
        double kb;
        double mb;
        Scanner sc = new Scanner(System.in);
        // Solicitar al usuario que introduzca un número de kilobytes
        System.out.println("Introduzca un nº de kilobytes: ");
        // Leer el número de kilobytes introducido por el usuario
        kb=sc.nextDouble();
        // Convertir kilobytes a megabytes
        mb=kb / 1000;
        // Mostrar el resultado de la conversión
        System.out.println(kb + " kilobytes son " + mb + " megabytes. ");
    }
}