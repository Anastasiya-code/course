import java.util.Scanner;

public class Задание_10 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите размер матрицы");
        int size1 = scanner.nextInt();
        scanner.nextLine();
        int size2 = scanner.nextInt();
        scanner.nextLine();
        int[][] arr = new int [size1][size2];
        System.out.println("Введите данные для матрицы");
        for (int i = 0; i < size1; i++){
            for (int j = 0; j < size2; j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < size1; i++) {
            System.out.print((arr [0] [i] * 3) + " ");
        }
    }
}
