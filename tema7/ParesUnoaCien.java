public class ParesUnoaCien {
    public static void main(String[] args) {
        int[] pares = new int[50];
        for (int i = 0; i < pares.length; i++) {
            pares[i] = (i + 1) * 2;
        }
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + " ");
        }
        System.out.println();
    }
}