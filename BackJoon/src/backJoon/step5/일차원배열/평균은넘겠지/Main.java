package backJoon.step5.일차원배열.평균은넘겠지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int score = 0;
        double count = 0;
        double rev = 0.0;
        int C = Integer.parseInt(br.readLine());

        for (int i = 0; i < C; i++) {
            st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());

            int[] scores = new int[N];
            for (int j = 0; j < N; j++) {
                score = Integer.parseInt(st.nextToken());
                scores[j] = score;
                rev += score;
            }

            rev = rev / N;

            for (int j = 0; j < N; j++) {
                if (rev < scores[j]) {
                    count++;
                }
            }
            sb.append(String.format("%.3f",(count / ((double) N) *100)));
            sb.append("%");
            sb.append("\n");

            count = 0;
            rev = 0;
        }
        System.out.println(sb);
    }

}
