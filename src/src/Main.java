//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package src;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число класса: 1 - удалить не повторяющиеся слова, 2 - посчитать количество слов и количество уникальных слов, 3 - удалить повторяющиеся слова");
        int choice = Integer.parseInt(input.nextLine());
        System.out.println("Введите строку: ");
        String text = input.nextLine();
        if (choice == 1) {
            ClassOne mainClass = new ClassOne();
            String result = mainClass.deleteWords(text);
            System.out.println(result);
        } else if (choice == 2) {
            InheritedClassOne inheritedClassOne = new InheritedClassOne();
            HashMap<String, Integer> result = inheritedClassOne.countUniqeWordsAndAllWord(text);
            System.out.println(result);
        } else if (choice == 3) {
            InheritedClassTwo classOne = new InheritedClassTwo();
            String result = classOne.deleteWords(text);
            System.out.println(result);
        } else {
            System.out.println("Такого варианта нет");
        }

    }
}
