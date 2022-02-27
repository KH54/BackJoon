package backJoon.step8.기본수학1.설탕배달;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int five = 0;
        int three = 0;

        int result = 0;

        System.out.println(N/5);
        do{
            five = N / 5;
            
        }
        while(result != 5 * five + 3 * three);
    }

}