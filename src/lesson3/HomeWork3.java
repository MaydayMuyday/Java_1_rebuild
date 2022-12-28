package lesson3;


import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {
        // revArr();
        //incArr();
        // metArr();
        // sqrArr();
        // System.out.println(Arrays.toString(initialValue(7, 99)));
        System.out.println(maxValue(new int[]{1, 3, 5, 6, 7, 9, 3, 1, 123, 4, 1, -5}));
        System.out.println(minValue(new int[]{1, 3, 5, 6, 7, 9, 3, 1, 123, 4, 0, 7}));
    }

    /**
     * Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С
     * помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    public static void revArr() {

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                System.out.printf("%d ", 0);
            } else {
                System.out.printf("%d ", 1);
            }

        }
        System.out.println();
    }


    /**
     * Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
     */
    public static void incArr() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.println(arr[i]);

        }
    }

    /**
     * Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
    public static void metArr() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {


            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
                System.out.print(arr[i] + " ");
            } else {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    /**
     * Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
     * заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить
     * элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
     * то есть [0][0], [1][1], [2][2], …, [n][n];
     */

    public static void sqrArr() {
        int[][] arr = new int[7][7];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                if (i == j || i == x) {
                    arr[i][j] = 1;

                } else {
                    arr[i][j] = 0;
                }
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();

        }
    }

    /**
     * Написать метод, принимающий на вход два аргумента: len и initialValue,
     * и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
     */
    public static int[] initialValue(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;

        }
        return arr;
    }

    /**
     * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
     */
    public static int maxValue(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }


        }
        return max;
    }

    public static int minValue(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }


        }
        return min;
    }

    /**
     * Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
     * если в массиве есть место, в котором сумма левой и правой части массива равны.
     */
    public static boolean checkSum(int[] arr) {
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            summ += arr[i];

        }
        if (summ % 2 != 0) {
            return false;
        }
        int sumLeft = 0;
        int i = 0;
        while (sumLeft < summ / 2) {
            sumLeft += arr[i];
            i++;
        }
        return sumLeft == summ / 2;
    }
}
