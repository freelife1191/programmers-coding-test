package ch00.basic;

import java.util.stream.IntStream;

public class array_odd_even_index_sum {
    public static void main(String[] args) {
        int[] arr = {49, 12, 100, 276, 33};
        int n = 27;
        // IntStream.range(0, arr.length).map(i -> arr.length % 2 == 0 ? i % 2 == 1 ? arr[i] += n : arr[i] : i % 2 == 0 ? arr[i] += n : arr[i]).toArray();
        // length 가 짝수면 훌수 인덱스 합 홀수면 짝수 인덱스 합
        // (i % 2 == (arr.length % 2 == 0 ? 1 : 0) 짝수면 1이니까 홀수 인덱스가 타겟 홀수면 0이니까 짝수 인덱스가 타겟 기가막히네 ~
        IntStream.range(0, arr.length).map(i -> arr[i] + (i % 2 == (arr.length % 2 == 0 ? 1 : 0) ? n : 0)).toArray();
    }
}
