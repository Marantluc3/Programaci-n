import java.util.Scanner;
public class conversor1 {
    public static void main(String[] args) {
        double kb;
        double mb;
        Scanner sc = new Scanner(System.in);
        // Solicitar al usuario que introduzca un número de megabytes
        System.out.println("Introduzca un nº de megabytes: ");
        // Leer el número de megabytes introducido por el usuario
        mb=sc.nextDouble();
        // Convertir megabytes a kilobytes
        kb=mb * 1000;
        // Mostrar el resultado de la conversión
        System.out.println(mb + " megabytes son " + kb + " kilobytes. ");
    }
}