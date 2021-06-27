import java.util.Scanner;

public class Converter {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int num1 = scanner.nextInt();
        if (num1 == 1) {
            System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - грамм, 3 - центнер");
            int num2 = scanner.nextInt();
            System.out.println("Введите число");
            double num4 = scanner.nextDouble();
            switch (num2) {
                case 1:
                    System.out.println("Результат: ");
                    System.out.println("килограмм " + num4);
                    System.out.println("грамм " + (num4 * 1000));
                    System.out.println("центнер " + (num4 * 100));
                    break;
                case 2:
                    System.out.println("Результат: ");
                    System.out.println("килограмм " + (num4 / 1000));
                    System.out.println("грамм " + num4);
                    System.out.println("центнер " + (num4 * 100000));
                    break;
                case 3:
                    System.out.println("Результат: ");
                    System.out.println("килограмм " + (num4 / 100));
                    System.out.println("грамм " + (num4 * 100000));
                    System.out.println("центнер " + num4);
                    break;
                default:
                    System.out.println("Операция не распознана. Повторите ввод.");
            }
        } else if (num1 == 2) {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            int num3 = scanner.nextInt();
            System.out.println("Введите число");
            double num5 = scanner.nextDouble();
            switch (num3) {
                case 1:
                    System.out.println("Результат: ");
                    System.out.println("метр " + num5);
                    System.out.println("миля " + (num5 / 1609.0));
                    System.out.println("ярд " + (num5 * 1.094));
                    System.out.println("фут " + (num5 * 3.281));
                    break;
                case 2:
                    System.out.println("Результат: ");
                    System.out.println("метр " + (num5 * 1609.0));
                    System.out.println("миля " + num5);
                    System.out.println("ярд " + (num5 * 1760));
                    System.out.println("фут " + (num5 * 5280));
                    break;
                case 3:
                    System.out.println("Результат: ");
                    System.out.println("метр " + (num5 / 1.094));
                    System.out.println("миля " + (num5 / 1760));
                    System.out.println("ярд " + num5);
                    System.out.println("фут " + (num5 * 3));
                    break;
                case 4:
                    System.out.println("Результат: ");
                    System.out.println("метр " + (num5 / 3.281));
                    System.out.println("миля " + (num5 / 5280));
                    System.out.println("ярд " + (num5 / 3));
                    System.out.println("фут " + num5);
                    break;
                default:
                    System.out.println("Операция не распознана. Повторите ввод.");
            }
        }
    }
}