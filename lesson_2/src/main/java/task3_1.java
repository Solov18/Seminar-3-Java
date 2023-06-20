
/*Задание

        Пусть дан произвольный список целых чисел.
        1) Найти минимальное значение
        2) Найти максимальное значение
        3) Найти среднее значение*/


import java.util.ArrayList;
import java.util.Random;

public class task3_1 {

    public static void main (String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(new Random().nextInt(1, 44));
        }
        System.out.println(list);
        int min = list.get(0);
        int max = list.get(0);
        float sum = 0;
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            sum += num;
        }
        Float f = sum / list.size();
        System.out.println("Минимальное значение: " + min);
        System.out.println("Минимальное значение: " + max);
        System.out.println("Среднее арифметическое значение: " + f);
    }
}