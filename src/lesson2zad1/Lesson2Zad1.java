/*
 Создайте массив из 20 случайных четных целых
чисел. Вычислите среднее арифметическое
элементов массива без учета минимального и
максимального элементов массива.
 */
package lesson2zad1;

import java.util.Arrays;
import java.util.Random;

public class Lesson2Zad1 {

    public static void main(String[] args) {
        int[] mas = new int[20];
        Random random = new Random();
        float sum = 0;
        for (int i = 0; i < mas.length; i++){
            mas[i] = (random.nextInt(5) + 1) * 2;
        }
        System.out.println("Array:   " + Arrays.toString(mas));
        Arrays.sort(mas);
        System.out.println("Sorting: " + Arrays.toString(mas));
        for (int i = 1; i < mas.length - 1; i++){
            sum += mas[i];
        }
        System.out.print("Cреднее арифметическое элементов массива = ");
        System.out.printf("%f%n", (float) sum/(mas.length - 2));
        System.out.print("Cреднее арифметическое элементов массива = ");
        System.out.printf("%f%n", (double) sum/(mas.length - 2));
        sum = (float) sum/(mas.length - 2);
        System.out.println("Cреднее арифметическое элементов массива = " + sum);
    }
    
}
