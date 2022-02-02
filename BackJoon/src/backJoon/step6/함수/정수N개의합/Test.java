package backJoon.step6.함수.정수N개의합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
       
        
        int[] a = new int[n];
        
        for(int i =0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        
        br.close();
        
        System.out.println(sum(a));
    }

    static long sum(int[] a) {
        long result = 0;
        for(int i =0; i<a.length; i++) {
            
            result += a[i];
        }
        
        return result;
    }
}
