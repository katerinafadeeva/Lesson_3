package lesson_2;

import java.util.Arrays;

public class task7 {
    public static void main(String[] args) {
        int multiplication[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < multiplication.length; i++) {
            if (multiplication[i] < 6) {
                System.out.println(multiplication[i] * 2);
            } else {
                System.out.println(multiplication[i]);
            }
        }
    }
}



