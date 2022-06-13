package backJoon;

import java.io.IOException;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) throws IOException {

        int[] p = { 2, 5, 3, 1, 4 };
        int[] answer = new int[p.length];
        
        int min = 1;
        int cnt = 0;
        for (int i = 0; i < p.length; i++) {
            int exam = min;
            for (int j = i; j < p.length; j++) {
                if (min == p[j] && cnt != j) {
                    int temp = p[cnt];
                    p[cnt] = min;
                    p[j] = temp;
                    
                    answer[cnt]++;
                    answer[j]++;
                    
                    
                    min++;
                    cnt++;
                }
            }
            if(exam == min) {
                min++;
                cnt++;
            }
        }

        System.out.println(Arrays.toString(answer));
    }

}
