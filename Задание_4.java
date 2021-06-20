import java.util.Scanner;
public class Задание_4 {
    public static void main(String[] args) {
        System.out.println("Введите три числа");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int sr = (x + y + z)/3;
        System.out.println(sr);
        double sr2 = sr/2.0;
        double result = Math.floor(sr2);
        if (result >3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}

