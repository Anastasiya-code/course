import java.util.Scanner;

public class Задание_11 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите первое число");
        int x = scanner.nextInt();
        String str;
        str = Integer.toString(x);
        scanner.nextLine();
        System.out.println("Введите второе число");
        int y = scanner.nextInt();
        if (x > y) {
            System.out.println("Большее число: " + x);
            double d1 = (double) y;
            System.out.println("Меньшее число: " + d1);
        }
        else if (y > x) {
            System.out.println("Большее число: " + y);
            Double d2 = new Double(str);
            System.out.println("Меньшее число: " + d2);
        }
    }
}
