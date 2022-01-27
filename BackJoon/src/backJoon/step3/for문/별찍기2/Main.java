package backJoon.step3.for문.별찍기2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            sb.append(" ");
        }

        for (int i = 0; i < N; i++) {
            sb.insert(N, "*");
            sb.delete(0, 1);

            sb2.append(sb);
            sb2.append("\n");

        }
        br.close();
        System.out.println(sb2);
    }
}
