package backJoon.step9.기본수학2.소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static boolean[] prime;

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = Integer.MAX_VALUE;

        make_prime(N);

        for (int i = M; i < prime.length; i++) {
            if (prime[i] == false) {
                sum += i;
                min = min > i ? i : min;

            }
        }
        if (sum == 0) {
            sb.append("-1");
        } else {
            sb.append(sum);
            sb.append("\n");
            sb.append(min);
        }
        System.out.println(sb);
    }

    // N 이하 소수 생성 메소드
    public static void make_prime(int N) {

        prime = new boolean[N + 1]; // 0 ~ N

        prime[0] = prime[1] = true;
        if (N < 2) {
            return;
        }

        for (int i = 2; i <= Math.sqrt(N); i++) {

            if (prime[i] == true) {
                continue;
            }

            for (int j = i * i; j < prime.length; j = j + i) {
                prime[j] = true;
            }
        }

    }
}
