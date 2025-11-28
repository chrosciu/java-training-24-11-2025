package eu.chrost.day5.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("Initial list: " + list);

        System.out.println("Element at index 1: " + list.get(1));

        //wyjatek IndexOutOfBoundsException
        //System.out.println("Element at index 4: " + list.get(4));

        System.out.println("List size: " + list.size());

        for (String fruit : list) {
            System.out.println("Fruit: " + fruit);
        }

        list.remove("Banana");
        System.out.println("List after removal: " + list);

        list.remove(1);
        System.out.println("List after removing index 1: " + list);

        //nie mozna tworzyc list typow prymitywnych
        //List<int> intList = new ArrayList<>();

        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        System.out.println("Integer list: " + intList);

        intList.remove(Integer.valueOf(10));
        System.out.println("Integer list after removal: " + intList);

        //nie usunie elementu o wartosci 10 tylko element o indeksie 10
        //intList.remove(10);
    }
}
