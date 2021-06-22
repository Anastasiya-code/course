import java.util.Scanner;

public class Задание_7 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int x = 1;
        int y = 7;
        int z = 94;
        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        scanner.nextLine();
        int[] arr = new int[size];
        System.out.println("Введите данные для массива");
        for (int i = 0; i < size; i++)
            arr[i] = scanner.nextInt();
        for (int i : arr) {
            if (i == x) {
                System.out.println("Данное значение имеется в константах");
                break;
            } else if (i == y) {
                System.out.println("Данное значение имеется в константах");
                break;
            } else if (i == z) {
                System.out.println("Данное значение имеется в константах");
                break;
            }
        }
    }
}
