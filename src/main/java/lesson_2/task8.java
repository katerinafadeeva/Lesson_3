package lesson_2;

public class task8 {
    public static void main(String[] args) {
        int doubleArray[][] = new int[5][5];
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++){
                doubleArray[0][0] = 1;
                doubleArray[1][1] = 1;
                doubleArray[2][2] = 1;
                doubleArray[3][3] = 1;
                doubleArray[4][4] = 1;
                doubleArray[0][4] = 1;
                doubleArray[1][3] = 1;
                doubleArray[3][1] = 1;
                doubleArray[4][0] = 1;
                System.out.print(doubleArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
