import java.util.Scanner;

public class Итоговое_задание_1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите текущий курс доллара");
        double course = scanner.nextDouble();
        System.out.println("Введите количество рублей");
        double ruble = scanner.nextDouble();
        double r = ruble/course;
        System.out.printf("%.2f",(double)(Math.round(r*100))/100);
    }
}
