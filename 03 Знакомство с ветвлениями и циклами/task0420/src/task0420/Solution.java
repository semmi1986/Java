package task0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/* 
Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
Выведенные числа должны быть разделены пробелом.


Requirements:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить числа на экран.
3. Программа должна выводить три числа разделенных пробелами.
4. Программа должна выводить числа в порядке убывания.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        System.out.println("Введи 3 числа");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(input.readLine());
        int num2 = Integer.parseInt(input.readLine());
        int num3 = Integer.parseInt(input.readLine());

        Integer[] sortArr = {num1, num2, num3};

        Arrays.sort(sortArr, Collections.reverseOrder());

        for (int value: sortArr){
            System.out.print(value + " ");
        }





    }
}
