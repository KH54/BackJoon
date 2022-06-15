package backJoon.step9.기본수학2.어린왕자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            Point[] road = new Point[2];

            StringTokenizer st = new StringTokenizer(br.readLine());

            // 시작점, 도착점
            for (int i = 0; i < 2; i++) {
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                road[i] = new Point(x, y);
            }

            // 원 개수
            int N = Integer.parseInt(br.readLine());

            // 지나는 원 개수
            int cnt = 0;

            for (int n = 0; n < N; n++) {
                st = new StringTokenizer(br.readLine());

                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());

                int minX = x - r;
                int maxX = x + r;
                int minY = y - r;
                int maxY = y + r;

                boolean a = false;
                boolean b = false;
                
                // 시작점 위치 확인
                if (checkPosition(road, maxX, minX, maxY, minY, 0, 1)) {
                    a = true;
                }
                // 도착점 위치 확인
                if (checkPosition(road, maxX, minX, maxY, minY, 1, 0)) {
                    b = true;
                }

                if ((a && !b) || (!a && b)) {
                    cnt++;
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }

    public static boolean checkPosition(Point[] road, int maxX, int minX, int maxY, int minY, int start, int end) {
        // 시작점 또는 도착점이 원 내부에 있는지
        if (road[start].x > minX && road[start].x < maxX && road[start].y > minY && road[start].y < maxY) {
            // 시작점 또는 도착점이 원 외부에 있는지
            if (road[end].x > maxX) {
                return true;
            } else if (road[end].x < minX) {
                return true;
            } else if (road[end].y > maxY) {
                return true;
            } else if (road[end].y < minY) {
                return true;
            }
        }
        return false;
    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }
}
