public class ArrayPrimo {
    public static boolean esPrimo(int n) {
        if ( n <= 1) {
            return false;
        }
        for (int d = 2; d < n;d++) {
            if (n % d == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] primos = new int[100];
        int i= 1;
        while (i <=100) {
            if (esPrimo(i)) {
                primos[i] = i;
                System.out.print(primos[i] + " ");
            }
            i++;
        }
    }
}