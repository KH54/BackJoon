package backJoon.step16.정수론및조합론.이항계수1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        long result = factorial(N) / (factorial(K) * factorial(N - K));

        System.out.println(result % 10007);
    }

    public static int factorial(int num) {
        int result = 1;

        while (num != 0) {
            result *= num;
            num--;
        }
        return result;
    }
}
