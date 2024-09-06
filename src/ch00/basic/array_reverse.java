package ch00.basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class array_reverse {
    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5};
        List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        Collections.reverse(list);
        int[] array = list.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(array));
    }
}
