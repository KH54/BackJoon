package backJoon.step9.기본수학2.네번째점;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        // 숫자를 x,y 입력 해놓고 2개 인지 1개인지 확인
        List<Integer> xList = new ArrayList<>();
        List<Integer> yList = new ArrayList<>();
        // 1개이면 그걸 출력
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            xList.add(x);
            yList.add(y);
        }

        if (xList.get(1).equals(xList.get(2)))
            sb.append(xList.get(0));
        else if (xList.get(0).equals(xList.get(2)))
            sb.append(xList.get(1));
        else
            sb.append(xList.get(2));

        sb.append(" ");

        if (yList.get(1).equals(yList.get(2)))
            sb.append(yList.get(0));
        else if (yList.get(0).equals(yList.get(2)))
            sb.append(yList.get(1));
        else
            sb.append(yList.get(2));

        br.close();
        System.out.println(sb);
    }
}
