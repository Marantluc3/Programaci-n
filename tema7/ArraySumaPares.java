public class ArraySumaPares {
    public static void main(String[] args) {
        int[] pares = new int[100]; // Hay 50 números pares del 1 al 100 (índices del 0 al 49)
        int i = 1;
        int npar = 0; // Índice del array pares

        while (i <= 100) {
            pares[npar] = i * 2;
            System.out.print(pares[npar] + " ");
            npar++;
            i++;
        }
        int suma = 0;
        for (i = 0; i < 100; i++)
        suma += pares[i];
        System.out.println("\nLa suma de los nº pares es: " + suma);
    
}
}