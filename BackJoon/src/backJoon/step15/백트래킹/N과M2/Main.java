package backJoon.step15.백트래킹.N과M2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    // N개의 수
    static int N;
    // N개의 수 중 뽑아올 수 M
    static int M;
    // M개 만큼 뽑은 수를 저장할 배열
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        // M만큼 뽑으니 M만큼의 배열 길이
        arr = new int[M];

        // 호출
        dfs(1, 0);
        
        System.out.println(sb);
    }

    static private void dfs(int start, int depth) {
        // M만큼 뽑은 경우 (마지막 일 경우)
        if (depth == M) {
            for (int val : arr) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        // 가장 깊은 곳이 아닌 경우 start부터 시작해서 재귀
        for (int i = start; i <= N; i++) {
            arr[depth] = i;
            dfs(i + 1, depth + 1);
        }
    }
}
