import java.util.Scanner;
public class letras {
    public static void main(String[] args) {
        String palabraMayuscula = "";
        //genero 5 letras mayusculas aleatorias
        for (int i= 0; i < 5; i++) {
            char letra = (char) ('A' + Math.random() * 26);
            palabraMayuscula += letra;
        }
        //convertimos las mayusculas a minusculas
        String palabraMinuscula = palabraMayuscula.toLowerCase();
        //muestro ambos resultados
        System.out.println("Palabra en mayúsculas: " + palabraMayuscula);
        System.out.println("Palabra en minúscula: " + palabraMinuscula);
    }
}