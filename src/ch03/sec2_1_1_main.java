package ch03;

public class sec2_1_1_main {

    public static void main(String[] args) {
        // [[2, -1, 4], [-2, -1, 4], [0, -1, 1], [5, -8, -12], [5, 8, 12]]
        // [[0, 1, -1], [1, 0, -1], [1, 0, 1]]
        // [[1, -1, 0], [2, -1, 0]]
        // [[1, -1, 0], [2, -1, 0], [4, -1, 0]]
        int[][] line = {{2, -1, 4}, {-2, -1, 4}, {0, -1, 1}, {5, -8, -12}, {5, 8, 12}};
        // int[][] line = {{0, 1, -1}, {1, 0, -1}, {1, 0, 1}};
        // System.out.println("length = " + solution(line).length);
        sec2_1_1_solution sec2Solution = new sec2_1_1_solution();
        for (String out : sec2Solution.solution(line)) {
            System.out.println(out);
        }
    }
}
