import java.util.Scanner;

public class Задание_9 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double result = 0;
        double average = 0;
        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        scanner.nextLine();
        double [] arr = new double [size];
        System.out.println("Введите данные для массива");
        for (int i = 0; i < size; i++)
            arr[i] = scanner.nextDouble();
        for (double i : arr)
            result += i;
            average = result/ size;
        for (double i : arr) {
            System.out.print((i*average) + " ");
        }
    }
}
