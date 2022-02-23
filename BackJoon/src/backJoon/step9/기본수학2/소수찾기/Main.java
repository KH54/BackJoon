package backJoon.step9.기본수학2.소수찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int cnt = 0;

        int[] arr = new int[N];
        int n = 0;
        while (st.hasMoreTokens()) {
            arr[n] = Integer.parseInt(st.nextToken());
            n++;

        }

        for (int i = 0; i < N; i++) {
            cnt += prime(arr[i]);
        }
        System.out.println(cnt);
    }

    public static int prime(int num) {
        if (num <= 1) {
            return 0;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return 0;
        }

        return 1;
    }

}
