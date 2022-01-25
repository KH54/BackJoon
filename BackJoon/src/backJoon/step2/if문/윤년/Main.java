package backJoon.step2.if문.윤년;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());

        br.close();

        if (((A % 4) == 0 && ((A % 400 == 0) || !(A % 100 == 0)))) {
            bw.write("1");

        } else {
            bw.write("0");
        }
        bw.flush();
        bw.close();
    }

}
