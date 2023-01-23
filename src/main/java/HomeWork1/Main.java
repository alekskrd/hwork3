package HomeWork1;

import java.util.Random;
import java.util.Scanner;

/* 1. Задать одномерный массив и найти в нем минимальный и максимальный элементы */
public class Main {
    public static void main(String[] args) {
        // hw1();
        // hw2();
         hw3();
    }

    public static void hw1() {
        int[] arr = {5, 5, 4, 8, 5};
        int min = arr[0];

        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        System.out.println(min);
    }

/* 2. Написать метод, который определяет, является ли введенный пользователем год високосным, и возвращает
в консоль boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным,
 кроме каждого 100-го, при этом каждый 400-й – високосный.*/

    public static void hw2() {
        Scanner scan = new Scanner(System.in);
        var number = Integer.parseInt(scan.nextLine());

        if (number % 100 != 0 & number % 4 == 0 || number % 400 == 0) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }



/*3. Дан массив nums = [3,2,2,3] и число val = 3.
Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
 а остальные - равны ему.*/

    public static void Arr(int[] arr, int val) {
        int right, left;
        left = 0;
        for (right = 0; right < arr.length; right++)
            if (arr[right] != val) arr[left++] = arr[right];
        for (right = left; right < arr.length; right++) arr[right] = val;
    }


    public static void hw3() {
        int[] arr = new int[10];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(4);
        }

        for (int x : arr) System.out.print(x + " ");
        System.out.println();
        Arr(arr, 3);
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }
}

