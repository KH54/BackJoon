package backJoon.step9.기본수학2.소인수분해;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static boolean[] arr;

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if (prime(N) == 0) {
            primeList(N);
            System.out.println(primeFactory(N));

        } else {
            System.out.println(N);
        }

    }

    // 소수인지 확인
    public static int prime(int N) {

        if (N <= 1) {
            return 0;
        }

        for (int i = 2; i < Math.sqrt(N); i++) {
            if (N % i == 0) {
                return 0;
            }
        }

        return N;
    }

    // 소수들의 배열
    public static void primeList(int N) {
        arr = new boolean[N + 1];

        arr[0] = arr[1] = true;
        if (N < 2) {
            return;
        }

        for (int i = 2; i < Math.sqrt(N); i++) {

            if (arr[i] == true) {
                continue;
            }

            for (int j = i * i; j < arr.length; j = j + i) {
                arr[j] = true;
            }
        }
    }

    public static StringBuilder primeFactory(int N) {
        // N = 72
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (N != 1) {
            if (arr[i] == false) {
                if (N % i == 0) {
                    N = N / i;
                    sb.append(i);
                    sb.append("\n");
                } else {
                    i++;
                }
            } else {
                i++;
            }

        }

        return sb;
    }

}