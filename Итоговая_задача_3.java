import java.util.Scanner;

public class Итоговая_задача_3 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        System.out.println("Введите количество строк: ");

        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
        } else {
            System.out.print("Введены некорректные данные!");
            return;
        }

        String[] strings = new String[n];
        

        for (int i=0; i<n; i++) {
            System.out.print("Введите строку номер " + (i + 1) + ": ");
            strings[i] = scanner.next();
        }
        String str = null;
        int max = 0;
        for (String string : strings) {
            String lowerCase = string.toLowerCase();
            char characters[] = lowerCase.toCharArray();
            int countOfUniqueChars = string.length();

            for (int i = 0; i < characters.length; i++) {
                if (i != lowerCase.indexOf(characters[i])) {
                    countOfUniqueChars--;
                }
            }
            if (countOfUniqueChars > max) {
                max = countOfUniqueChars;
                str = string;
            }
        }
        System.out.println(str);
    }
}
