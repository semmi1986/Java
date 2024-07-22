package task0421;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Objects;

/* 
Настя или Настя?
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение "Имена идентичны".
Если имена разные, но их длины равны - вывести сообщение - "Длины имен равны".
Если имена и длины имен разные - ничего не выводить.


Requirements:
1. Программа должна считывать две строки c клавиатуры.
2. Программа должна содержать System.out.println() или System.out.print()
3. Если имена одинаковые вывести сообщение "Имена идентичны"
4. Если имена разные, но их длины равны , вывести сообщение "Длины имен равны"
5. Если имена и длины имен разные - ничего не выводить.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введи первое имя");
        String name1 = input.readLine();
        System.out.println("Введи второе имя");
        String name2 = input.readLine();

        if(Objects.equals(name1, name2)){
            System.out.println("Имена идентичны");
        }

        if (name1.length() == name2.length()){
            System.out.println("Длины имен равны");
        }




    }
}
