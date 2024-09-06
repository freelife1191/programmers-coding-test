package ch00.basic;

import java.util.Arrays;

public class number_multiples_array {
    public static void main(String[] args) {
        int n = 10;
        int k = 3;

        int[] answer = new int[n / k];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = k * (i + 1);
        }
        System.out.println(Arrays.toString(answer));
    }
}
