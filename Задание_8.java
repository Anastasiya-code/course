import java.util.Scanner;

public class Задание_8 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        System.out.println("Введите любое целое положительное число");
        int num = scanner.nextInt();
        scanner.nextLine();
        while (i <= num)  {
            sum += i;
            i += 2;
        }
        System.out.println("Сумма всех нечетных чисел от 1 до " + num + " = " + sum);
    }
}
