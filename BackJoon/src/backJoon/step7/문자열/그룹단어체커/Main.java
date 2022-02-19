package backJoon.step7.문자열.그룹단어체커;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int answer = 0;
        boolean[] arr = new boolean[26];

        for (int i = 0; i < N; i++) {
            String word = br.readLine();

            Arrays.fill(arr, false);
            for (int j = 0; j < word.length(); j++) {
                char present = word.charAt(j);

                if (j + 1 < word.length()) {
                    j++;
                    char next = word.charAt(j);

                    if (present == next) {
                        j++;
                    } else if (present != next) {
                        if (arr[present - 97] == true) {
                            
                        }
                    }
                }
            }

            for (boolean a : arr) {
                if (a == true) {
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
