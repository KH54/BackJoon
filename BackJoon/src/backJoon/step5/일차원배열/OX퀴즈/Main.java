package backJoon.step5.일차원배열.OX퀴즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] scores = new int[T];
        int score = 0;

        for (int i = 0; i < T; i++) {
            String problem = br.readLine();

            String[] problems = problem.split("");

            for (int j = 0; j < problem.length(); j++) {
                while (problems[j].equals("O")) {
                    score += 1;
                    scores[i] += score;
                    j++;

                    if (j == problem.length()) {
                        break;
                    }
                }
                score = 0;
            }

        }
        for(int i = 0; i < T; i++) {
            System.out.println(scores[i]);
        }
    }
}