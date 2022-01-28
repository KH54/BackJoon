package backJoon.step4.While문.더하기사이클;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int result = N;

        int sum = 0;
        int count = 0;
        do {
            sum = (N / 10) + (N % 10);
            N = (N % 10) * 10 + (sum % 10);
            count++;
        } while (result != N);
        System.out.println(count);
    }

}
