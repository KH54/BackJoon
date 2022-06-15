package backJoon.step9.기본수학2.참외밭;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    final static int E = 1;
    final static int W = 2;
    final static int S = 3;
    final static int N = 4;

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int K = Integer.parseInt(br.readLine());

        int sum = 0;
        int prev = 0;
        for (int i = 0; i < 6; i++) {
            st = new StringTokenizer(br.readLine());
            st.nextToken();

            int length = Integer.parseInt(st.nextToken());

            sum += length * prev;
            
        }
    }

}
