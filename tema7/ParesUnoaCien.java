public class ParesUnoaCien {
    public static void main(String[] args) {
        int[] pares = new int[50]; // Hay 50 números pares del 1 al 100 (índices del 0 al 49)
        int i = 1;
        int npar = 0; // Índice del array pares

        while (i * 2 <= 100) {
            pares[npar] = i * 2;
            System.out.print(pares[npar] + " ");
            npar++;
            i++;
        }
    }
}
