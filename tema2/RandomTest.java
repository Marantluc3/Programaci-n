public class RandomTest {
    public static void main(String[] args) {

        int random1 = (int) (Math.random() * 10.0);
        int random2 = (int) (Math.random() * 10.0);

        System.out.println("primer nº aleatorio: " + random1);
        System.out.println("segundo nº aleatorio: " +random2);

        
        //Suma de los dos nº aleatorios
        int suma =random1 + random2;
        System.out.println("La suma de los dos nº aleatorios es: " + suma);
        System.out.println("¿Está bien el resultado? " + (suma == (random1 + random2)));

    }
}