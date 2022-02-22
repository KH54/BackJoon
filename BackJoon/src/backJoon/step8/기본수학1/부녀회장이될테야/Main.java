package backJoon.step8.기본수학1.부녀회장이될테야;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int K = Integer.parseInt(br.readLine());
            int N = Integer.parseInt(br.readLine());

            int cnt = 1;


            int[][] arr = new int[K+1][N + 1];

            for (int j = 0; j < N + 1; j++) {
                arr[0][j] = cnt++;
            }

            for (int k = 1; k <= K; k++) {
                for (int m = 0; m < N + 1; m++) {
                    if (m == 0) {
                        arr[k][m] = 1;
                    } else {
                        arr[k][m] = arr[k - 1][m] + arr[k][m - 1];
                    }
                }
            }
            sb.append(arr[K][N-1]);
            sb.append("\n");
        }
        br.close();
        System.out.println(sb);
    } 
}
