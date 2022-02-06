package backJoon.step7.문자열.다이얼;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

    public static void main(String[] args) throws IOException {

        // 1번은 2초 2번은 3초 3번은 4초 ~~~ 0번은 11초
        // UNUCIC

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new HashMap<>();

        // 문자 입력
        String number = br.readLine();
        
        // 총 걸린 시간
        int result = 0;
        
        // 각각의 문자에 걸리는 시간
        map.put("1", 2);
        map.put("ABC", 3);
        map.put("DEF", 4);
        map.put("GHI", 5);
        map.put("JKL", 6);
        map.put("MNO", 7);
        map.put("PQRS", 8);
        map.put("TUV", 9);
        map.put("WXYZ", 10);
        map.put("0", 11);

        // 하나씩 검색
        for (Entry<String, Integer> entry : map.entrySet()) {
            
            // 문자를 하나씩 분열
            for (int i = 0; i < number.length(); i++) {
                char num = number.charAt(i);
                
                // 존재하면 result에 입력
                if (-1 < entry.getKey().indexOf(num)) {
                    result += entry.getValue();
                }
            }
        }
        System.out.println(result);
    }
}
