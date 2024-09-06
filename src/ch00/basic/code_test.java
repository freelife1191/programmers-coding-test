package ch00.basic;


import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class code_test {
    private static int[] addElement(int[] array, int element) {
        int[] num_list = Arrays.copyOf(array, array.length + 1);
        num_list[array.length] = element;
        return num_list;
    }
    private static int gcd(int num1, int num2) {
        if (num1 % num2==0) return num2;
        return gcd(num2, num1%num2);
    }
    private static int lcm(int num1, int num2) {
        int gcd = gcd(num1, num2);
        int lcm = (num1 * num2) / gcd;
        return lcm;
    }

    public static void main(String[] args) {
        List<List<Integer>> arr = List.of(List.of(1,2,3,4), List.of(5,6,7,8), List.of(9,10,11,12), List.of(13,14,15,16));
        int a = 0;
        int b = 0;
        for (int i = 0; i < arr.size(); i++) {
            a += arr.get(i).get(i);
            b += arr.get(i).get(arr.size()-1-i);
        }
        // 1, 6, 11, 16
        // 4, 7, 10, 13
        System.out.println(String.format("a=%d, b=%d",a,b));
        System.out.println(Math.abs(a - b));
    }



}
