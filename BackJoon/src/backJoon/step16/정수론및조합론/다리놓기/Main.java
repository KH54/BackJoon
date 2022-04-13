package backJoon.step16.정수론및조합론.다리놓기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] arr = new int[30][30];

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            sb.append(factorial(M, N)).append("\n");

        }
        System.out.println(sb);
    }

    public static int factorial(int n, int k) {

        if (arr[n][k] > 0) {
            return arr[n][k];
        }

        if (k == 0 || n == k) {
            return arr[n][k] = 1;
        }

        return factorial(n - 1, k - 1) + factorial(n - 1, k);
    }

}
