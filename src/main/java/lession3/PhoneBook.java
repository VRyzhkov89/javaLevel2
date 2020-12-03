package lession3;

import java.util.*;

//2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
// В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер
// телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
// тогда при запросе такой фамилии должны выводиться все телефоны.

        final class PhoneBook {

        Map<String, String> phoneBook = new HashMap<>();

        public void add(String number, String surname) {
            phoneBook.put(number, surname);
        }
        public void get(String surname){
            if(phoneBook.containsValue(surname)) {
                Set<Map.Entry<String, String>> set = phoneBook.entrySet();
                for (Map.Entry<String, String> temp : set) {
                    if(temp.getValue().equals(surname)) {
                        System.out.println("Фамилия : " + temp.getValue() + ", номер телефона - " + temp.getKey());
                    }
                }
            } else {
                System.out.println("Фамилии " + ">" + surname + "<" + " нет в списке.");
            }
        }
    }