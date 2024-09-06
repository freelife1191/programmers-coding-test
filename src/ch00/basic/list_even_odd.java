package ch00.basic;

import java.util.Arrays;
import java.util.stream.Collectors;

public class list_even_odd {
    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5};
        // int[] answer = {0, 0};
        int[] answer = Arrays.stream(num_list)
                .boxed()
                .collect(Collectors.partitioningBy(number -> number % 2 == 1, Collectors.counting()))
                .values().stream()
                .mapToInt(Long::intValue)
                .toArray();
        System.out.println(Arrays.toString(answer));

        int[] array = Arrays.stream(num_list)
                .boxed()
                .collect(Collectors.partitioningBy(number -> number % 2 == 1, Collectors.counting()))
                .values().stream()
                .mapToInt(Long::intValue)
                .toArray();
        System.out.println(Arrays.toString(array));
    }
}
