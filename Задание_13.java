import java.util.Scanner;

public class Задание_13 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите строку из слов");
        String str = scanner.nextLine();
        int count = 0;
        String [] words = str.split (" ");
        for (String word : words) {
            boolean isValidWord = word.matches("[a-zA-Z]+");
            if (isValidWord == true) {
                System.out.println(word);
                count++;
                }
            }
        System.out.println("Количество слов, состоящих только из латинских букв: " + count);
    }
}



