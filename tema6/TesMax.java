import java.util.Scanner;
public class TesMax {
    public static void main(String[] args) {
        int i;
        int j;
        int k;
        int m;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        i = sc.nextInt();
        System.out.print("Introduce otro número: ");
        j = sc.nextInt();
        System.out.print("Introduce otro número: ");
        k = sc.nextInt();
        m = max(i, j, k);
        System.out.println("El máximo entre " + i + ", " + j + ", " + k + " es: " + m);
    }
    public static int max(int num1, int num2) {
        int result;
        if (num1 > num2) 
            result = num1;
        else
            result = num2;
        return result;
    }
    public static int max(int num1, int num2, int num3) {
        return max(max(num1, num2), num3);
    }
}
