package backJoon.step7.문자열.숫자의합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int result = 0;
        int N = Integer.parseInt(br.readLine());
        String[] nums = br.readLine().split("");
        br.close();
        
        
        for(int i = 0 ; i < N; i++) {
            result +=  Integer.parseInt(nums[i]);
        }
        System.out.println(result);
    }

}
