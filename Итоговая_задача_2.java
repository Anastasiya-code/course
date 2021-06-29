import java.util.Scanner;

public class Итоговая_задача_2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите простое уравнение");
        String str = scanner.nextLine();
        int res1 = str.length();
        if (res1 == 5) {
            char c = str.charAt(3);
            Character d = c;
            String c1 = d.toString();
            boolean res2 = c1.equals("=");
            if (res2 == true) {
                char n1 = str.charAt(0);
                Character condition = 'x';
                if (n1 == condition) {
                    char n2 = str.charAt(2);
                    int num2 = Character.getNumericValue(n2);
                    char n3 = str.charAt(4);
                    int num3 = Character.getNumericValue(n3);
                    char operation = str.charAt(1);
                    int result1;
                    switch (operation) {
                        case '+':
                            result1 = num3 - num2;
                            System.out.println("Результат операции: " + result1);
                            break;
                        case '-':
                            result1 = num2 + num3;
                            System.out.println("Результат операции: " + result1);
                            break;
                        default:
                            System.out.println("Уравнение некорректное. Повторите ввод.");
                    }
                }
                char n2 = str.charAt(2);
                if (n2 == condition) {
                    int num1 = Character.getNumericValue(n1);
                    char n3 = str.charAt(4);
                    int num3 = Character.getNumericValue(n3);
                    char operation = str.charAt(1);
                    int result2;
                    switch (operation) {
                        case '+':
                            result2 = num3 - num1;
                            System.out.println("Результат операции: " + result2);
                            break;
                        case '-':
                            result2 = num1 - num3;
                            System.out.println("Результат операции: " + result2);
                            break;
                        default:
                            System.out.println("Уравнение некорректное. Повторите ввод.");
                    }
                }
                char n3 = str.charAt(4);
                if (n3 == condition) {
                    int num1 = Character.getNumericValue(n1);
                    int num2 = Character.getNumericValue(n2);
                    char operation = str.charAt(1);
                    int result3;
                    switch (operation) {
                        case '+':
                            result3 = num1 + num2;
                            System.out.println("Результат операции: " + result3);
                            break;
                        case '-':
                            result3 = num1 - num2;
                            System.out.println("Результат операции: " + result3);
                            break;
                        default:
                            System.out.println("Уравнение некорректное. Повторите ввод.");
                    }
                }
            }
            else System.out.println("Уравнение некорректное. Повторите ввод.");
            }
        else System.out.println("Уравнение некорректное. Повторите ввод.");

        }
    }


