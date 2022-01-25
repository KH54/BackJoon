package backJoon.step1.입출력과_사칙연산.AplusB;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;

        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println(a - b);
        
        sc.close();
    }
}
