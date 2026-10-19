import java.util.Scanner;
public class SeparaporA {
    public static void main(String[] args) {
        String palabra;
        int mitad;
        Scanner sc = new Scanner(System.in);
        System.out.println("inserte una palabra: ");
        palabra = sc.nextLine();
        mitad = palabra.indexOf("a");
        System.out.println("La palabra queda como: " + palabra.substring(0, mitad) + " " + palabra.substring(mitad));
        sc.close();

    }
}