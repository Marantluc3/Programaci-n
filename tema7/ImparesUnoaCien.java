public class ImparesUnoaCien {
    public static void main(String[] args) {
        int[] impares = new int[100];
        int i = 1;
        while (i <= 100) {
            if (i % 2 !=0) {
                impares[i]= i;
                System.out.print(impares[i] + " ");
            }
            i++;
        }
    }
}
  