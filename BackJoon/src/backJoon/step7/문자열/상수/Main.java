package backJoon.step7.문자열.상수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //A와 B 입력
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        // A가 큰 경우 A 출력, B가 큰 경우 B 출력
        System.out.println(check(A) > check(B) ? check(A) : check(B));
    }

    public static int check(int num) {

        // 결과
        int result = 0;
        
        // 첫번째 자리수부터 구함
        while (num != 0) {
            result = result * 10 + num % 10;
            num /= 10;
        }
        return result;
    }
}
