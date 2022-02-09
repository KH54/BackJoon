package backJoon.step7.문자열.크로아티아알파벳;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int before = 0;
        int cnt = 0;
        int prev = 0;

        int next = br.read();

        while(next != 13) {
            prev = next;
            next = br.read();
            
            if(prev =='c' && next == '=') {}
            else if(prev == 'c' && next =='-') {}
            else if(prev == 'd' && next =='-') {}
            else if(prev == 'l' && next =='j') {}
            else if(prev == 'n' && next =='j') {}
            else if(prev == 's' && next =='=') {}
            else if(prev == 'z' && next =='=') {}
            else if(prev == 'z' && next =='=' && before == 'd') {cnt--;}
            else if(prev =='z' && next =='=') {}
            else {cnt++;}
            
            before = prev;
        }
        System.out.println(cnt);
    }
}
