package backJoon.입출력과_사칙연산.사칙연산;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);

        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();

        sc.close();


        bw.write((a + b) + "\n");
        bw.write((a - b) + "\n");
        bw.write((a * b) + "\n");  
        bw.write((a / b) + "\n");
        bw.write((a % b) + "\n");

        bw.flush();
        bw.close();
    }

}
