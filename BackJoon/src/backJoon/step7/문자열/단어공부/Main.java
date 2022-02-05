package backJoon.step7.문자열.단어공부;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        br.close();

        S = S.toUpperCase();
        String[] arr = S.split("");

        Map<String, Integer> map = new HashMap<>();
        for (String str : arr) {
            if (map.containsKey(str)) {
                map.replace(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }

        Collection<Integer> checkValues = map.values();

        int max = Integer.MIN_VALUE;
        Boolean twin = false;

        for (int value : checkValues) {
            if (value > max) {
                max = value;
                twin = false;
            } else if(value == max) {
                twin = true;
            }
        }
        
        if(twin) {
            System.out.println("?");
        } else {
            for(String key : map.keySet()) {
                if(map.get(key).equals(max)) {
                    System.out.println(key);
                }
            }
        }

    }
}
