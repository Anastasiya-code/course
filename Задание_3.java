public class Задание_3 {
    public static void main(String[] args) {
        int array [] = {1, 2, 3, 4, 5};
        int temp = array [0];
        array [0] = array[array.length - 1];
        array[array.length - 1] = temp;
        System.out.println("Сумма первого и среднего элемента в массиве: " + (array[0] + array[array.length/2]));
    }
}
