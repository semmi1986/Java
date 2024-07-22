package task0413;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье",
если введен номер больше 7 или меньше 1 - вывести "такого дня недели не существует".

Пример для номера 5:
пятница

Пример для номера 10:
такого дня недели не существует


Requirements:
1. Программа должна считывать число c клавиатуры.
2. Программа должна выводить текст на экран.
3. Если введено число от 1 до 7, необходимо вывести день недели.
4. Если введено число не входящее в интервал от 1 до 7, то вывести уведомление что такого дня недели не существует.*/

public class Solution {
    public static void main(String[] args) throws Exception {

        //напишите тут ваш код
        System.out.println("enter the number of the day of the week ");
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();


            switch (day){
                case (1) -> System.out.println("Monday");
                case (2) -> System.out.println("Tuesday");
                case (3) -> System.out.println("Wednesday");
                case (4) -> System.out.println("Thursday");
                case (5) -> System.out.println("Friday");
                case (6) -> System.out.println("Saturday");
                case (7) -> System.out.println("Sunday");
                default -> System.out.println("there is no such day of the week");
            }
        }


}