package backJoon.step7.문자열.크로아티아알파벳;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

        String alphabet = br.readLine();
        br.close();
        for (int i = 0; i < str.length; i++) {
            if (alphabet.contains(str[i])) {
                alphabet = alphabet.replace(str[i], "1");
            }
        }
        System.out.println(alphabet.length());
    }
}
