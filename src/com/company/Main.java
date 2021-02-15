package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Задание №1
        List<String> words = Arrays.asList(
            "Dwarf", "Gnome", "Elf", "Human", "Orc",
            "Halfling", "Centaur", "Lizard", "Human", "Orc",
            "Gnome", "Elf", "Human", "Centaur", "Centaur",
            "Elf", "Human", "Centaur", "Centaur", "Human"
    );

        Set<String> unique = new HashSet<String>(words);

        System.out.println("Первоначальный массив");
        System.out.println(words.toString());
        System.out.println("Уникальные расы из Манчкина");
        System.out.println(unique.toString());
        System.out.println("Частота встречаемости рас");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }

        //Задание №2
        System.out.println("Создаем справочник");
        Phonebook phonebook = new Phonebook();
        System.out.println("-----------------");

        System.out.println("Наполняем справочник");
        phonebook.add("Лебедев", "79219995599");
        phonebook.add("Лебедев", "+79218885522");
        phonebook.add("Шариков", "+79217774411");
        phonebook.add("Васильев", "+79216663399");
        phonebook.add("Лебедев", "+79215552200");
        System.out.println("-----------------");

        System.out.println("Получаем номера");
        System.out.println("Лебедев");
        System.out.println(phonebook.get("Лебедев"));
        System.out.println("Шариков");
        System.out.println(phonebook.get("Шариков"));
        System.out.println("Васильев");
        System.out.println(phonebook.get("Васильев"));
        System.out.println("-----------------");

        System.out.println("Случай отсутствия записи");
        System.out.println("Вантула");
        System.out.println(phonebook.get("Вантула"));
        System.out.println("-----------------");

        System.out.println("Пробуем записать существующий номер");
        phonebook.add("Лебедев", "79219995599");
        System.out.println("Лебедев");
        System.out.println(phonebook.get("Лебедев"));
    }
}
