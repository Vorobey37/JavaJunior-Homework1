package org.example;

/*Напишите программу, которая использует Stream API для обработки списка чисел.
Программа должна вывести на экран среднее значение всех четных чисел в списке.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        List<Integer> list = createRandomList(10);
        System.out.println(list);
        System.out.println(list.stream()
                .filter(element -> element %2 == 0)
                .mapToInt(e -> e)
                .average()
                .getAsDouble());
    }

    public static List<Integer> createRandomList(int size){
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add(RANDOM.nextInt(-20, 21));
        }
        return list;
    }
}