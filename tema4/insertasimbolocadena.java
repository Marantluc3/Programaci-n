import java.util.Scanner;
public class insertasimbolocadena {
    public static void main(String[] args) {
        String cadena = "", cadenaModificada = "";
        int longitud = 0, i, j;
        Scanner sc = new Scanner(System.in);

        //Leemos una cadena x teclado
        System.out.println("Introduzca una cadena de caracteres: ");
        cadena = sc.nextLine();

        //Calculamos la longitud de la cadena
        longitud = cadena.length();

        //Copiamos la primera mitad de la cadena en cadenaModificada
        i = 0;
        while ( i < longitud /2 ) {
            cadenaModificada = cadenaModificada + cadena.charAt(i);
            i++;
        }
        // Añadimos a la cadena los caracteres "<>"
        cadenaModificada += "<>";
        //Copiamos la segunda mitad de la cadena
         while ( i < longitud ) {
            cadenaModificada = cadenaModificada + cadena.charAt(i);
            i++;
        }
        // Mostramos la cadena modificada
        System.out.println("La cadena modificada es: " + cadenaModificada);

        sc.close();
    }
}