package ch00.basic;

import java.time.LocalDate;

public class sec02_age {

    public static int solution(int age) {
        if (0 < age && age <= 120) {

        }
        return LocalDate.now().getYear() -1  - age;
    }

    public static void main(String[] args) {
        System.out.println(solution(23));
    }
}
