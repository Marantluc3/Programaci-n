import java.util.Random;
public class letras {
    public static void main(String[] args) {
        String Mayuscula = "";
        String Minuscula = "";
        int contador = 0;
        int numMay = 0;
        int numMin = 0;
        char character;
        while (contador < 5) {
            // Generamos el codigo ASCII en mayuscula
            numMay = (int) (65 + Math.random() * 26);
            character = (char) numMay;
            //Concatenamos el caracter a la cadena
            Mayuscula = Mayuscula + character;
            // Calculamos el código en minúsculas, sumando 32
            numMin = numMay + 32;
            // Convertimos el caracter en minúscula
            character = (char) numMin;
            //Concatenamos el caracter a la cadena
            Minuscula = Minuscula + character;
            contador++;
        }
        System.out.println(Mayuscula);
        System.out.println(Minuscula);
    }
}