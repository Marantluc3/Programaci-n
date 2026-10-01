import java.util.Scanner;
public class RandomTest {
    public static void main(String[] args) {

        int random1 = (int) (Math.random() * 10.0);
        int random2 = (int) (Math.random() * 10.0);
        int resultado;
        Scanner sc = new Scanner(System.in);

        System.out.println("primer nº aleatorio: " + random1);
        System.out.println("segundo nº aleatorio: " +random2);

        
        //Suma de los dos nº aleatorios
        int suma =random1 + random2;
        System.out.println("¿cuál es la suma de los dos nº aleatorios? ");
        resultado = scanner.nextInt();
        System.out.println("introduce tu respuesta: " + resultado);
        

    }
}