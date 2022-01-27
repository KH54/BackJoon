package backJoon.step3.for문.X보다작은수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        String A = br.readLine();
        String[] AA = A.split(" ");

        for (int i = 0; i < N; i++) {
            if (Integer.parseInt(AA[i]) < X) {
                sb.append(Integer.parseInt(AA[i]));
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }

}
