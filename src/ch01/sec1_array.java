package ch01;

public class sec1_array {

    public static void main(String[] args) {
        int[][] arr2 = {
                {4, 9, 7},
                {2, 6, 1},
                {3, 4, 8},
                {8, 5, 9}
        };
        // y 좌표인 3에 먼저 접근한 후 x 좌표인 2에 접근
        int element = arr2[3][2];
    }
}
