package backJoon.step9.기본수학2.소수구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static boolean[] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        
        prime(N);
        
        for(int i = M; i < arr.length; i++) {
            if(arr[i] == false) {
                sb.append(i);
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }

    public static void prime(int N) {
        arr = new boolean[N + 1];

        arr[0] = arr[1] = true;
        if (N < 2) {
            return;
        }

        for (int i = 2; i * i <= N; i++) {
            if (arr[i] == true)
                continue;

            for (int j = i * i; j < arr.length; j = j + i) {
                arr[j] = true;
            }
        }
    }
}
