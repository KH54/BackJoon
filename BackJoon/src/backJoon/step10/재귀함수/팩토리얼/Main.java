package backJoon.step10.재귀함수.팩토리얼;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int result = 1;

        if (N < 2) {
            result = 1;

        } else {
            for (int i = 1; i <= N; i++) {
                result *= i;
            }
        }
        
        System.out.println(result);
    }
}
