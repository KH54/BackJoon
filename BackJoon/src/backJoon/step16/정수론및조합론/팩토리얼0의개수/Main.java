package backJoon.step16.정수론및조합론.팩토리얼0의개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        
        
        int cnt = 0;
        while (N >= 5) {
            cnt += N/5;
            N /= 5;
        }


        System.out.println(cnt);
    }

}
