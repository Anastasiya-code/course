import java.util.Scanner;

public class Итоговая_задача_4 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Отгадайте загадку: Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        System.out.println("Введите ответ:");
        for (int i = 1; i <= 3; i++) {
            String str1 = scanner.nextLine();

            switch (str1) {
                case "Заархивированный вирус":
                    System.out.println("Правильно!");
                    return;
                case "Подсказка":
                    if (i == 1) {
                        System.out.println("Блокирует работу твоего устройства");
                        String str2 = scanner.nextLine();
                        switch (str2) {
                            case "Заархивированный вирус":
                                System.out.println("Правильно!");
                                return;
                            default:
                                System.out.println("Обидно, приходи в другой раз");
                                return;
                        }
                    }
                    if (i > 1) {
                        System.out.println("Подсказка уже недоступна");
                        i--;
                        continue;
                    }
                default:
                    if (i<=2)
                        System.out.println("Подумай еще!");
                    else
                        System.out.println("Обидно, приходи в другой раз");

            }
        }
    }
}




