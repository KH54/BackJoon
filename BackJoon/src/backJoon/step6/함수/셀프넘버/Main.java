package backJoon.step6.함수.셀프넘버;

public class Main {

    public static void main(String[] args) {
        final int limit = 10001;

        int n = 0;
        boolean[] arr = new boolean[limit];

        while (n < limit) {
            dn(n);
            if (n <= limit) {
                arr[n] = true;
            }
            n++;
        }

        for (int i = 0; i < limit; i++) {
            if (!arr[i]) {
                System.out.println(arr[i]);
                System.out.println("\n");
            }
        }
    }

    static int dn(int n) {

        int result = 0;
        int less = n;

        while (less > 0) {
            result += (less % 10);
            less /= 10;
        }
        return result;
    }
}
