import java.util.Scanner;

public class Задание_12 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите фразу");
        String str = scanner.nextLine();
        boolean result1 = str.contains("Java");
        boolean result2 = str.startsWith("I like");
        boolean result3 = str.endsWith("!!!");
        if (result1 == result2 == result3 == true);
        {
            String result4 = str.toUpperCase();
            System.out.println(result4);
        }
        String result5 = str.replace('a',  'o');
        String result6 = result5.substring(7, 11);
        System.out.println(result6);
    }
}
