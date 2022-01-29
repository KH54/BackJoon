package backJoon.step5.일차원배열.나머지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] reminder = new int[10];

        for (int i = 0; i < 10; i++) {
            int A = Integer.parseInt(br.readLine());
            reminder[i] = A % 42;
        }
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i : reminder) {
            hashSet.add(i);
        }
        br.close();
        System.out.println(hashSet.size());
    }
}
