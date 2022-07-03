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

        int[][] arr = new int[6][2];

        int maxWidth = 0;
        int maxHeight = 0;
        int minWidth = 0;
        int minHeight = 0;

        int idxWidth = 0;
        int idxHeight = 0;

        for (int i = 0; i < 6; i++) {
            st = new StringTokenizer(br.readLine());

            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < 6; i++) {
            if (arr[i][0] == 1 || arr[i][0] == 2) {
                if (arr[i][1] > maxWidth) {
                    maxWidth = arr[i][1];
                    idxWidth = i;
                }
            } else {
                if (arr[i][1] > maxHeight) {
                    maxHeight = arr[i][1];
                    idxHeight = i;
                }
            }
        }

        int right;
        int left;

        right = idxWidth + 1 == 6 ? 0 : idxWidth + 1;
        left = idxWidth - 1 == -1 ? 5 : idxWidth - 1;

        minHeight = Math.abs(arr[right][1] - arr[left][1]);

        right = idxHeight + 1 == 6 ? 0 : idxHeight + 1;
        left = idxHeight - 1 == -1 ? 5 : idxHeight - 1;

        minWidth = Math.abs(arr[right][1] - arr[left][1]);

        System.out.println(((maxWidth * maxHeight) - (minWidth * minHeight)) * K);
    }

}
