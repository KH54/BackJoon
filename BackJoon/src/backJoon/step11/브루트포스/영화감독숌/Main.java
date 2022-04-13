package backJoon.step11.브루트포스.영화감독숌;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if (N > 1) {
            result(N);
        } else {
            System.out.println(666);
        }

    }

    static void result(int N) {
        int count = 1;
        int first_digit = 0;
        int num = 0;
        
        while(true) {
            if(((first_digit % 10000) / 10) == 666 && first_digit % 10 != 6){
                
            }
        }
    }
}
