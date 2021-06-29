import java.util.Random;

public class Задание_14 {

    public static void main(String[] args) {

        int[] array = new int [15];
        int max = array[0];
        int min = array[0];
        for (int i = 0; i< array.length; i++){
            Random random = new Random();
            array [i] = (random.nextInt(41)-20);
            if(array[i] > max){
                max = array[i];
            }
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println("Минимальный элемент массива: " + min);
        System.out.println("Максимальный элемент массива: " + max);
        int result1 = Math.abs(min);
        int result2 = Math.abs(max);
        if (result1>result2) {
            System.out.println("Из них наибольшее по модулю: " + result1);
        }
        else System.out.println("Из них наибольшее по модулю: " + result2);
    }
}


