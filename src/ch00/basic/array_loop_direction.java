package ch00.basic;

import java.util.Arrays;

public class array_loop_direction {
    public static void main(String[] args) {
        int n = 4;
        int[][] answer = new int[n][n];

        int num = 1; // 배열에 채워질 정수 값
        int rowStart = 0; // 행의 시작 인덱스
        int rowEnd = n - 1; // 행의 끝 인덱스
        int colStart = 0; // 열의 시작 인덱스
        int colEnd = n - 1; // 열의 끝 인덱스

        while (num <= n * n) {
            // 왼쪽 -> 오른쪽
            for (int i = colStart; i <= colEnd; i++) {
                answer[rowStart][i] = num++;
            }
            rowStart++; // 행의 시작 인덱스 증가

            // 위쪽 -> 아래쪽
            for (int i = rowStart; i <= rowEnd; i++) {
                answer[i][colEnd] = num++;
            }
            colEnd--; // 열의 끝 인덱스 감소

            // 오른쪽 -> 왼쪽
            for (int i = colEnd; i >= colStart; i--) {
                answer[rowEnd][i] = num++;
            }
            rowEnd--; // 행의 끝 인덱스 감소

            // 아래쪽 -> 위쪽
            for (int i = rowEnd; i >= rowStart; i--) {
                answer[i][colStart] = num++;
            }
            colStart++; // 열의 시작 인덱스 증가
        }
        /*
        int num = 1;
        int x = 0, y = 0;
        int dx[] = {0, 1, 0, -1};
        int dy[] = {1, 0, -1, 0};
        int direction = 0;

        while (num <= n * n) {
            answer[x][y] = num++;

            int nx = x + dx[direction];
            int ny = y + dy[direction];

            if (nx < 0 || nx >= n || ny < 0 || ny >= n || answer[nx][ny] != 0) {
                direction = (direction + 1) % 4; //범위 밖에 나갔을 때 방향전환
                nx = x + dx[direction];
                ny = y + dy[direction];
            }
            x = nx;
            y = ny;
        }
        */
        /*
        int num=1;
        int start=0;
        int end=n;

        while(num <= n*n){

            //->
            for(int j=start;j<end;j++)
                answer[start][j]=num++;
            //v
            for(int i=start+1;i<end;i++)
                answer[i][end-1]=num++;
            //<
            for(int j=end-2;j>=start;j--)
                answer[end-1][j]=num++;
            //^
            for(int i=end-2;i>start;i--)
                answer[i][start]=num++;
            start++;
            end--;

        }
         */
        for (int[] ints : answer) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
