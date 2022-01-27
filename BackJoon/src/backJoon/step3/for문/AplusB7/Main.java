package backJoon.step3.for문.AplusB7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;

        int A = 0;
        int B = 0;
        for (int i = 1; i <= T; i++) {
            st = new StringTokenizer(br.readLine());

            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            
            sb.append("Case #");
            sb.append(i);
            sb.append(": ");
            sb.append(A+B);
            sb.append("\n");
        }
        br.close();
        System.out.println(sb);
    }
}