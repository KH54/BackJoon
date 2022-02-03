package backJoon.step6.함수.한수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int limit = Integer.parseInt(br.readLine());
        int result = 0;
        
        for(int i = 1; i <= limit; i++) {
            result += han(i);
        }
        
        System.out.println(result);
    }

    public static int han(int n) {

        int[] arr = new int[3];
        int order = 0;
  
        if(n < 100) {
            return 1;
        } else if(n == 1000) {
            return 0;
        }
        
        while (n != 0) {
            arr[order] = n % 10;
            n /= 10;
            order++;
        }
        
        return arr[0] - arr[1] == arr[1] -arr[2] ? 1 : 0;
    }
}
