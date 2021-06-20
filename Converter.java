import java.util.Scanner;

public class Converter {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int num1 = scanner.nextInt();
        if (num1 == 1){
            System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - грамм, 3 центнер");
            int num2 = scanner.nextInt();
            System.out.println("Введите число");
            double num4 = scanner.nextInt();
            double result1 = weight(num2, num4);
            System.out.println(result1);
        }
        else if (num1 == 2) {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            int num3 = scanner.nextInt();
            System.out.println("Введите число");
            double num5 = scanner.nextInt();
            double result2 = distanse(num3, num5);
            System.out.println(result2);
        }
    }

    public static double weight (int num2, double num4){
        double result1;
        switch (num2){
            case 1:
                result1 = num4;
                break;
            case 2:
                result1 = num4*1000;
                break;
            case 3:
                result1 = num4*100;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result1 = weight(num2, num4);
            }
        return result1;
    }
    public static double distanse (int num3, double num5){
        double result2;
        switch (num3){
            case 1:
                result2 = num5;
                break;
            case 2:
                result2 = num5/1609.0;
                break;
            case 3:
                result2 = num5*1.094;
                break;
            case 4:
                result2 = num5*3.281;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result2 = distanse(num3, num5);
        }
        return result2;
    }
}
