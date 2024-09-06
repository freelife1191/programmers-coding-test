package ch00.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class list_query_conditon {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2},{0, 3, 2},{0, 2, 2}};
        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (queries[i][2] < arr[j]) list.add(arr[j]);
            }
            if (list.isEmpty()) {
                answer[i] = -1;
                continue;
            }
            answer[i] = Collections.min(list);
        }
        System.out.println(Arrays.toString(answer));
        IntStream.range(0, queries.length)
                .map(q -> IntStream.rangeClosed(queries[q][0], queries[q][1])
                        .map(i -> arr[i])
                        .filter(i -> i > queries[q][2])
                        .min().orElse(-1)
                ).toArray();
    }
}
