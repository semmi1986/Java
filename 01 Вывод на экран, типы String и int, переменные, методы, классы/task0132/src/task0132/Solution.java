package task0132;

/* 
Сумма цифр трехзначного числа
Напиши код метода sumDigitsInNumber(int number). Метод на вход принимает целое трехзначное число. Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

Пример:
Метод sumDigitsInNumber вызывается с параметром 546.

Пример вывода:
15


Requirements:
1. Программа не должна считывать данные с клавиатуры.
2. Метод sumDigitsInNumber(int) должен быть публичным и статическим.
3. Метод sumDigitsInNumber должен возвращать значение типа int.
4. Метод sumDigitsInNumber не должен ничего выводить на экран.
5. Метод sumDigitsInNumber должен правильно возвращать сумму всех цифр в числе number.
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int result = 0;
        String strNumber = String.valueOf(number);
        for (int i = 0; i < strNumber.length(); i++) {
            result += Integer.parseInt(String.valueOf(strNumber.charAt(i)));
        }
        
        return result;
    }

}