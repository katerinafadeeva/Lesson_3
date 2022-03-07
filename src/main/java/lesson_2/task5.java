package lesson_2;

import java.util.Arrays;

public class task5 {
    public static void main(String[] args) {
        int[] massive = {1, 1, 0, 0, 1,
                0, 1, 1, 0, 0};
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] == 0) {
                massive[i] = 1;
                } else {
                    massive[i] = 0;
                }
            }
        System.out.println(Arrays.toString(massive));
        }
    }

