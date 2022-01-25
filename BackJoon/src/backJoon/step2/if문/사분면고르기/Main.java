package backJoon.step2.if문.사분면고르기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        int result = 4;

        if (x > 0 && y > 0) {
            result = 1;
        } else if (x < 0 && y < 0) {
            result = 3;
        } else if (x < 0 && y > 0) {
            result = 2;
        }

        System.out.println(result);
    }

}
