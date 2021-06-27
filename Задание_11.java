import java.util.Scanner;

public class Задание_11 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите первое число");
        double x = scanner.nextDouble();
        String str;
        str = Double.toString(x);
        scanner.nextLine();
        System.out.println("Введите второе число");
        double y = scanner.nextDouble();
        int d1 = (int) y;
        if (x > y) {
            System.out.println("Большее число: " + x);
            double d2 = (double) y;
            System.out.println("Меньшее число: " + d2);
        }
        else if (y > x) {
            System.out.println("Большее число: " + y);
            Double d3 = new Double(str);
            System.out.println("Меньшее число: " + d3);
        }
    }
}
