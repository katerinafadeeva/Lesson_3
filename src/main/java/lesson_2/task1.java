package lesson_2;

public class task1 {
    public static void main(String[] args) {
        twoNumbers();
    }

    public static boolean twoNumbers() {
        int a = 1;
        int b = 3;
        if (a + b >= 10 && a + b <= 20) {
            return true;
        }
        return false;
    }
}


