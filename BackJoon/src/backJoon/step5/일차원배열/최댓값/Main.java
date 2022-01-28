package backJoon.step5.일차원배열.최댓값;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int max = Integer.MIN_VALUE;
        int order = 0;
        for (int i = 1; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());

            if (max < num) {
                max = num;
                order = i;
            }

        }
        br.close();
        sb.append(max);
        sb.append("\n");
        sb.append(order);
        System.out.println(sb);

    }

}
