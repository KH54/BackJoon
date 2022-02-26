package backJoon.step10.재귀함수.피보나치수5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int answer = factorial(Integer.parseInt(br.readLine()));
        System.out.println(answer);
    }

    public static int factorial(int N) {
        return N <= 1 ? N : factorial(N - 1) + factorial(N - 2);
    }
}
