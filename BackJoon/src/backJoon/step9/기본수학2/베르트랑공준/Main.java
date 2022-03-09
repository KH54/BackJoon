package backJoon.step9.기본수학2.베르트랑공준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static boolean arr[];

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int cnt = 0;
        int N = Integer.MAX_VALUE;
        if (N >= 2) {
            while (true) {
                cnt = 0;
                N = Integer.parseInt(br.readLine());

                if (N == 0) {
                    break;
                }

                prime(N);

                for (int i = N+1; i < arr.length; i++) {
                    if (arr[i] == false) {
                        cnt++;
                    }
                }
                sb.append(cnt);
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }

    public static void prime(int N) {
        N = N * 2;
        arr = new boolean[N + 1];

        if (N < 2) {
            return;
        }
        arr[0] = arr[1] = true;

        for (int i = 2; i * i <= N; i++) {
            if (arr[i] == true) {
                continue;
            }
            for (int j = i * i; j < arr.length; j = j + i) {
                arr[j] = true;
            }
        }
    }
}
