package backJoon.step9.기본수학2.참외밭;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int K = Integer.parseInt(br.readLine());

        int maxHeight = 0;
        int minHeight = 501;
        int maxWidth = 0;
        int minWidth = 501;

        for (int i = 0; i < 6; i++) {
            st = new StringTokenizer(br.readLine());

            int position = Integer.parseInt(st.nextToken());
            int length = Integer.parseInt(st.nextToken());

            if (position == 3 || position == 4) {
                if (length > maxHeight) {
                    maxHeight = length;
                }
                if (length < minHeight) {
                    minHeight = length;
                }
            } else {
                if (length > maxWidth) {
                    maxWidth = length;
                }
                if (length < minWidth) {
                    minWidth = length;
                }
            }

        }
        int res = (maxHeight * maxWidth - minWidth * minHeight) * K;

        System.out.println(res);
    }

}
