/*
    Реализуйте алгоритм сортировки пузырьком числового массива,
    результат после каждой итерации запишите в лог-файл.
    начальный массив заполним случайными числами, размерность
    спросим у пользователя
 */

public class Task_002 {
 package Task_002;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Logger;

public class Task_002 {
    // верхняя граница значений массива
    private static final int MAX_NUMBER = 100;

    public static void main(String[] args) {
        clearScreen();

        int sizeArray = readIntConsole("Размерность массива: ");
        int [] numArray = new int[sizeArray];

        Random random = new Random();

        for (int i = 0; i < sizeArray; i++) {
            numArray[i] = random.nextInt(MAX_NUMBER);
        }

        System.out.println("Исходный массив: ");
        System.out.println(Arrays.toString(numArray));

        numArray = bubbleSort(numArray);

        System.out.println("Отсортированный массив: ");
        System.out.println(Arrays.toString(numArray));
    }

    // сортировка
    public static int[] bubbleSort(int[] array){
        Logger logger = Logger.getAnonymousLogger();

        for (int j = array.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    logger.info(Arrays.toString(array));
                }
            }
        }
        return array;
    }

    // очистка терминала
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // получение строкового значения с консоли
    public static int readIntConsole(String message){
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }

}
}