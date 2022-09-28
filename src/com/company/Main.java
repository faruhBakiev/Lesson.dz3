package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> arrayListA = new ArrayList<>();
        ArrayList<String> arrayListB = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите значение для  листа A " + i + " | 5");
            arrayListA.add(scanner.next());

        }
        System.out.println("Полный список A");
        System.out.println(arrayListA);

        for (int i = 0; i < 5; i++) {
            System.out.println("Введите значение для  листа B "  + i + " | 5");
            arrayListB.add(scanner.next());
        }
        System.out.println("Полный список B");
        System.out.println(arrayListB);

        Collections.reverse(arrayListB);

        int length = arrayListA.size();

        ArrayList<String> arrayListC = new ArrayList<>(length);
        for (int i = 0; i < length; i++) {
            arrayListC.add(arrayListA.get(i));
            arrayListC.add(arrayListB.get(i));


        }
        System.out.println("Общий список ");
        System.out.println(arrayListC);


        System.out.println("Список после сортировки");
        arrayListC.sort(Comparator.comparingInt(String::length));
        System.out.println(arrayListC);




    }
}
