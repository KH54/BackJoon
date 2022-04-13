package backJoon.step8.기본수학1.설탕배달;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int score = 0;

        while (true) {
            if (N % 5 == 0) {
                score += N / 5;
                System.out.println(score);
                break;
            } else {
                N -= 3;
                score++;
            }

            if (N < 0) {
                System.out.println(-1);
                break;
            }

        }
    }
}