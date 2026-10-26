import java.util.Scanner;
public class TablaDelNueve {
    public static void main(String[] args) {
        System.out.println("Tabla del 9");
        System.out.println("-----------");

        for (int i=1; i<11;i++){
            
            System.out.printf("9 x %2d = %2d%n",i, i * 9);
        }
    }
}