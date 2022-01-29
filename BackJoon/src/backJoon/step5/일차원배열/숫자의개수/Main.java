package backJoon.step5.일차원배열.숫자의개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        br.close();
        int multipli = A * B * C;

        String[] count = Integer.toString(multipli).split("");

        int[] result = new int[10];

        for (int i = 0; i < count.length; i++) {
            switch (Integer.parseInt(count[i])) {
            case 0:
                result[0]++;
                break;
            case 1:
                result[1]++;
                break;
            case 2:
                result[2]++;
                break;
            case 3:
                result[3]++;
                break;
            case 4:
                result[4]++;
                break;
            case 5:
                result[5]++;
                break;
            case 6:
                result[6]++;
                break;
            case 7:
                result[7]++;
                break;
            case 8:
                result[8]++;
                break;
            case 9:
                result[9]++;
                break;
            }
        }
        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
