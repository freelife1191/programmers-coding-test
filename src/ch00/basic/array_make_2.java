package ch00.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

// https://school.programmers.co.kr/learn/courses/30/lessons/181921
public class array_make_2 {
    public static void main(String[] args) {
        int l = 5;
        int r = 555;

        // 이진법 활용
        // l = 5, r = 555
        // 5,   50,   55,   500,   505,   550,   555
        // 1    10    11    100    101    110    111
        // 1     2     3      4      5      6      7

        // 지수는 자릿수
        // 2^0 <= x < 2^3
        int digit = String.valueOf(r).length();
        int exponent = (int)Math.pow(2.0, digit);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < exponent; i++) {
            String binaryString = Integer.toBinaryString(i);
            int target = Integer.parseInt(binaryString) * 5;
            if (target >= l && target <= r)
                list.add(target);
        }

        if (list.isEmpty())
            System.out.println(-1);
        else
            System.out.println(Arrays.toString(list.stream().mapToInt(i -> i).toArray()));

        /*
        List<Integer> list = new ArrayList<>();
        int[] answer = IntStream.rangeClosed(l, r)
                .filter(i -> i % 5 == 0)
                .mapToObj(String::valueOf)
                .filter(i -> i.matches("^[50]+$"))
                .mapToInt(Integer::parseInt)
                .toArray();

        if (answer.length == 0)
            answer = new int[]{-1};
         */
    }
}
