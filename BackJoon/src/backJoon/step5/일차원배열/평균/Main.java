package backJoon.step5.일차원배열.평균;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        double max = Integer.MIN_VALUE;
        double sum = 0;
        int[] score = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {

            score[i] = Integer.parseInt(st.nextToken());

            max = score[i] > max ? score[i] : max;

        }
        br.close();
        for (int a : score) {
            sum += ((a / max) * 100);
        }
        System.out.println(sum / N);

    }

}
