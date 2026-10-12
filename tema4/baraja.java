import java.util.Scanner;
public class baraja {
    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);
        //definimos los palos y los valores
String[] palos = {"Corazones", "Diamantes", "Tréboles", "Picas"};
        String[] valores = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
      int indicePalo = (int) (Math.random() * palos.length);
      int indiceValor = (int) (Math.random() * valores.length);
      String cartaFinal = valores[indiceValor];
      String paloFinal = palos[indicePalo];
      System.out.println("La carta seleccionada es: " + cartaFinal + " de " + paloFinal);
    }
}