package backJoon.step1.입출력과_사칙연산.AdivideB;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = 0;
        double B = 0;

        A = sc.nextInt();
        B = sc.nextInt();
        
        System.out.println(A / B);
        
        sc.close();
    }

}
