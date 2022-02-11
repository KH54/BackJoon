package backJoon.step8.기본수학1.분수찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int n = 1;
        int max = 0;

        int front = 1;
        int end = 1;

        while ((max += n) < A) {
            n++;
        }
        if (n % 2 == 0) { // 짝수
            front = n;
            end = 1;
            while (max != A) {
                front--;
                end++;
                max--;
            }
        } else if (n % 2 == 1) { // 홀수
            front = 1;
            end = n;

            while (max != A) {
                front++;
                end--;
                max--;
            }
        }

        System.out.println(front + "/" + end);
    }

}
