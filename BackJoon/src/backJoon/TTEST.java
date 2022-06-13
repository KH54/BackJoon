package backJoon;

import java.util.Arrays;

public class TTEST {

    public static void main(String[] args) {

        int[] periods = { 24, 59, 59, 60 };
        int[][] payments = { //
                { 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000 }, //
                { 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000 }, //
                { 350000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000 }, //
                { 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000 }, //
        };

        int[] estimates = { 350000, 50000, 40000, 50000 };
        int[] answer = new int[2];

        for (int customer = 0; customer < periods.length; customer++) {

            boolean[] vipCheck = new boolean[2];

            for (int compare = 0; compare < 2; compare++) {

                if (periods[customer] > 23 && periods[customer] < 60) {
                    if (moneyCheck(payments, customer) >= 900000) {
                        vipCheck[compare] = true;
                    }
                } else if (periods[customer] >= 60) {
                    if (moneyCheck(payments, customer) >= 600000) {
                        vipCheck[compare] = true;
                    }
                }

                payments[customer][0] = estimates[customer];
                periods[customer]++;
            }

            if ((vipCheck[0] != true && vipCheck[1] == true)) {
                answer[0]++;
            } else if ((vipCheck[0] == true && vipCheck[1] != true)) {
                answer[1]++;
            }
        }

        System.out.println(Arrays.toString(answer));
    }

    public static int moneyCheck(int[][] payments, int num) {

        int sum = 0;
        for (int month = 0; month < 12; month++) {
            sum += payments[num][month];
        }

        return sum;
    }
}
