package backJoon.step2.if문.두수비교하기;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = sc.nextInt();
        int B = sc.nextInt();

        sc.close();

        if (A > B) {
            bw.write(">");
        } else if (A < B) {
            bw.write("<");
        } else {
            bw.write("==");
        }

        bw.flush();
        bw.close();
    }

}
