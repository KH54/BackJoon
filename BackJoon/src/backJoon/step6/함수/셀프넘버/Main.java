package backJoon.step6.함수.셀프넘버;

public class Main {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        final int limit = 10001;

        int n = 0;
        boolean[] arr = new boolean[limit];

        while (n < limit) {
            int result = dn(n);
            
            if (result < limit) {
                arr[result] = true;
            }
            n++;
        }

        for (int i = 0; i < limit; i++) {
            if (!arr[i]) {
                sb.append(i);
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }

    static int dn(int n) {

        int result = n;

        while (n != 0) {
            
            result += (n % 10);
            n /= 10;
        }
        return result;
    }
}
