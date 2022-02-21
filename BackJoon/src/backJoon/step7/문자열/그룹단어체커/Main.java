package backJoon.step7.문자열.그룹단어체커;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int answer = 0;

        for (int i = 0; i < N; i++) {
            String word = br.readLine();

            char[] arr = new char[26];
            for (int j = 0; j < word.length(); j++) {
                char present = word.charAt(j);

                if (j + 1 < word.length()) {
                    char next = word.charAt(j+1);
                    if (present == next) {
                        continue;
                    } else if (j == word.length()) {
                        arr[present - 97]++;
                    } else if (present != next) {
                        arr[present - 97]++;
                    }
                } else {
                    arr[present - 97]++;
                }
            }
            answer += count(arr);
        }
        System.out.println(answer);
    }

    public static int count(char[] arr) {
        int cnt = 1;
        for (int k : arr) {
            if (k > 1) {
                return 0;
            }
        }

        return cnt;
    }
}
