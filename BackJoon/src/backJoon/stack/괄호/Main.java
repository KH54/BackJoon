package backJoon.stack.괄호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            // 한줄 입력
            String input = br.readLine();

            // 괄호의 짝을 맞추기 위한 변수
            int cnt = 0;
            // 괄호를 한개씩 호출
            for (char part : input.toCharArray()) {
                // 왼쪽 괄호면 +, 오른쪽 괄호면 -
                cnt += part == '(' ? 1 : -1;

                // 오른쪽 괄호의 수가 왼쪽 괄호의 수를 넘을 경우
                if (cnt < 0) {
                    sb.append("NO\n");
                    break;
                }
            }
            // 모든 괄호가 짝이 맞는 경우
            if (cnt == 0) {
                sb.append("YES\n");
            }
            // 괄호의 짝이 맞지 않는 경우
            else if (cnt > 0) {
                sb.append("NO\n");
            }

        }
        System.out.println(sb);
    }
}
