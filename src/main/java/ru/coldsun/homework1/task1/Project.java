package ru.coldsun.homework1.task1;

import java.util.Arrays;
import java.util.List;


public class Project {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(-2, -1, 0, 1, 2, 3, 4, 5, 6); //Задаем лист

        //фильтруем и выводим результат
        System.out.println("Результат: " + numbers.stream()
                .filter(x -> x > 0).filter(n -> n % 2 == 0)
                .mapToDouble(a -> a).average().orElse(0.0));
    }
}
