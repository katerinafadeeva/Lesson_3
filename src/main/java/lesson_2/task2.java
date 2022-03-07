package lesson_2;

public class task2 {
    public static void main(String[] args) {
        whatNumber();
    }
    public static void whatNumber(){
        int a = -10;
        if (a >= 0) {
            System.out.println("Передали положительное число");
        } else if (a < 0) {
            System.out.println("Передали отрицательное число");
        }

    }
}
