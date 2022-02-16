package backJoon.step2.if문.오븐시계;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(br.readLine());

        br.close();

        B += C;
        A += B / 60;

        B %= 60;
        A %= 24;

        sb.append(A);
        sb.append("\n");
        sb.append(B);

        System.out.println(sb);
    }

}
