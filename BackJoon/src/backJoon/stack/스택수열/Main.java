package backJoon.stack.스택수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
     
        Stack<Integer> stack = new Stack<>()
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        
        stack.push(5);
        stack.push(6);
        
        System.out.println(stack.pop());
        
        stack.push(7);
        stack.push(8);
        
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        
    }

}
