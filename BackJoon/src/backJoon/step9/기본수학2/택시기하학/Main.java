package backJoon.step9.기본수학2.택시기하학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double R = Integer.parseInt(br.readLine());

        System.out.println(String.format("%.6f",(R * 3.141592653589793238) * R));
        System.out.println(String.format("%.6f",(R * 2 * R)));
    }

}
