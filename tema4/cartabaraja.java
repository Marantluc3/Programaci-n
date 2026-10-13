import java.util.Random;
public class cartabaraja {
    public static void main(String[] args) {
        // creo el generador de nº aleatorios
     Random aleatorio = new Random();
     // defino los palos de la baraja
     String [] palos = { "Picas", "corazones", "diamantes", "tréboles" };
     //defino los 13 valores posibles
     String [] valores = { "AS", "2", "3", "4", "5", "6", "7", "8", "9",
      "10", "J", "Q", "K" };
      //genero un nº aleatorio entre 0 y 3 para el palo
      int palo = aleatorio.nextInt(4);
      //genero un nº aleatorio del 0 al 12
        int valor = aleatorio.nextInt(13);
        //muestro el resultado
        System.out.println("La carta es: " + valores[valor] + " de " + palos[palo]);
    }
}