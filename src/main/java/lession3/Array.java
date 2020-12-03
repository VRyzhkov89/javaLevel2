package lession3;

import java.util.HashMap;

//1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список
// уникальных слов, из которых состоит массив (дубликаты не считаем).
// Посчитать сколько раз встречается каждое слово.

final class Array {

    public static void main(String[] args) {

        String[] items = {
                "Шоколад",
                "Вино",
                "Кофе",
                "Шоколад",
                "Лимон",
                "Коньяк",
                "Мёд",
                "Арбуз",
                "Дыня",
                "Апельсин",
                "Кофе",
                "Мороженое",
                "Мука",
                "Хлеб",
                "Молоко",
                "Хлеб",
                "Торт",
                "Кофе",
                "Бананы",
                "Груша",
                "Вино"};

        HashMap<String, Integer> hashItems = new HashMap<>();
        for (String x : items) {
            hashItems.put(x, hashItems.getOrDefault(x, 0) + 1);
        }
        System.out.println(hashItems);
    }
}