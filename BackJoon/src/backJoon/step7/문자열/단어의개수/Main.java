package backJoon.step7.문자열.단어의개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = 0;
        int ch;
        int previousCh = 32;

        while (true) {
            // 입력받은 문자를 하나씩 ASCII코드로 받음
            ch = br.read();
            // ch가 띄어쓰기 인지 확인, 하지만 이전 문자인 previousCh가 띄어쓰기 경우를 제외
            if (ch == 32 && previousCh != 32)
                cnt++;

            // ch가 개행문자인 경우
            else if (ch == 10) {
                // 카운트한 뒤, 브레이크로 종료
                if (previousCh != 32)
                    cnt++;
                break;
            }
            // 현재 문자를 저장
            previousCh = ch;
        }
        System.out.println(cnt);
    }
}
