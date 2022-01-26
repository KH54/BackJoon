package backJoon.step3.for문.구구단;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < 10; i++) {
            sb.append(a);
            sb.append(" * ");
            sb.append(i);
            sb.append(" = ");
            sb.append(a * i);
            sb.append("\n");

        }
        System.out.println(sb);
    }

}
