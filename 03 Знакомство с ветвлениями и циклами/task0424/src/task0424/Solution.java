package task0424;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой. Вывести на экран порядковый номер числа, отличного от остальных.

Пример для чисел 4 6 6:
1

Пример для чисел 6 6 3:
3


Requirements:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна использовать команды System.out.println() или System.out.print().
3. Программа должна выводить на экран порядковый номер числа, отличного от остальных.
4. Если все числа разные, ничего не выводить.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введи первое число");
        int num1 = Integer.parseInt(input.readLine());
        System.out.println("Введи второе число");
        int num2 = Integer.parseInt(input.readLine());
        System.out.println("Введи третье число");
        int num3 = Integer.parseInt(input.readLine());


        if (num1 == num2) {
            System.out.println("3");
        } else if (num1 == num3) {
            System.out.println("2");
        }else {
            System.out.println("1");
        }


    }
}
