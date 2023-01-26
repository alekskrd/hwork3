package HomeWork2;

import java.io.*;
import java.util.Scanner;

/*1. Напишите метод, который принимает на вход строку (String) и
определяет является ли строка палиндромом (возвращает boolean значение).*/
public class Main {
    public static void main(String[] args) {
        hw1();
        write();
    }

    public static void hw1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String string = scan.next();

        string = string.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
        if (string.equalsIgnoreCase((new StringBuilder(string))
                .reverse()
                .toString()))
            System.out.println("Палиндром! " + string);
        else
            System.out.println("Не палиндром! :( " + string);
    }

/*2. Напишите метод, который составит строку, состоящую из 100 повторений слова TEST
и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.*/

    public static StringBuilder test(String str) {
//        var s = "TEST".repeat(100);
//        System.out.println(s);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            //String str = "TEST";
            result.append(str);
        }
        System.out.println(result);
        return result;
//        return s;
    }

        public static void write () {
            {
                File file = new File("file.txt");
                String text = String.valueOf(test("TEST"));

                try (FileWriter fw = new FileWriter(file);
                     BufferedWriter bf = new BufferedWriter(fw);
                     PrintWriter out = new PrintWriter(bf)) {
                    out.print(text);

                    System.out.println("Successfully written data to the file");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }


    }