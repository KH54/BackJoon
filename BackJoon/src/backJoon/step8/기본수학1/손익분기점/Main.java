package backJoon.step8.기본수학1.손익분기점;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // A = 고정 비용
        // B = 가변 비용
        // C = 노트북 가격

        long A = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());
        long C = Integer.parseInt(st.nextToken());

        // (고정 비용 / (제품 가격 - 가변 비용)) +1 == 팔아야하는  개수  
        System.out.println( B < C ? A / (C-B)+1 : -1);
        
    }
}
