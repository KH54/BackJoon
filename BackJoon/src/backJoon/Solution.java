package backJoon;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int n = 5;

        String[] plans = { "100 1 3", "500 4", "2000 5" };
        String[] clients = { "300 3 5", "1500 1", "100 1 3", "50 1 2" };

        int[] answer = new int[clients.length];
        
        ArrayList<Integer[]> list = new ArrayList<>();

        int[][] cost = new int[plans.length][5];
        for (int i = 0; i < plans.length; i++) {

            String[] arr = plans[i].split(" ");
            cost[i][0] = Integer.parseInt(arr[0]);

            for (int j = 1; j < arr.length; j++) {
                int iarr = Integer.parseInt(arr[j]);
            }

            System.out.println(Arrays.deepToString(cost));
        }

        for (int customer = 0; customer < clients.length; customer++) {

        }

    }

}
