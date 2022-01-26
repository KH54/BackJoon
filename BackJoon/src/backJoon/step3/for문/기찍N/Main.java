package backJoon.step3.for문.기찍N;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for(int i = n; i > 0 ; i--) {
            sb.append(i);
            sb.append("\n");
        }
        System.out.println(sb);
    }

}
