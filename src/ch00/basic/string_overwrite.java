package ch00.basic;

public class string_overwrite {
    public static void main(String[] args) {
        String my_string = "He11oWor1d";
        String overwrite_string = "lloWorl";
        int s = 2;
        String answer = my_string.substring(0, s) + overwrite_string;
        if (my_string.length() > answer.length()) {
            answer += my_string.substring(answer.length());
        }
        System.out.println(answer);
    }
}
