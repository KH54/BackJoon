package backJoon.step16.정수론및조합론.조합0의개수;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        long res = 0;
        if (m >= 0 && m <= n) {
            res = factor(n) / (factor(m) * factor(n - m));
        }
        System.out.println(zeroCount(res));
    }

    private static int factor(int n) {
        int sum = 1;

        while (n > 1) {
            sum *= n;

            n--;
        }

        return sum;
    }

    private static int zeroCount(long n) {
        int cnt = 0;
        while (n >= 10) {
            if (n % 10 == 0) {
                cnt++;
                
            }
            n /= 10;
        }

        return cnt;
    }
}
