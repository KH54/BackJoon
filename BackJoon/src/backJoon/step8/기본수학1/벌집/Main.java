package backJoon.step8.기본수학1.벌집;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long N = Integer.parseInt(br.readLine());


        int sum = 0;
        int cnt = 0;

        for (int i = 0; (N > 6 * sum + 1); i++) {
            cnt++;
            sum += i;
        }
        System.out.println(N == 1 ? 1 : cnt);
        
    }

}
