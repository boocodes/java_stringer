//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class InheritedClassOne extends ClassOne {
    public static ArrayList<String> fillWordsArray(String text) { // заполнить
        ArrayList<String> wordsList = new ArrayList();
        int startPosition = 0;
        for(int i = 0; i < text.length(); ++i) {
            if (text.charAt(i) == ' ' || i == text.length() - 1) {
                String slicedWord = ClassOne.sliceText(text, startPosition, i + 1);
                startPosition = i + 1;
                wordsList.add(slicedWord.trim());
            }
        }
        return wordsList;
    }
    public static int countUniqueWords(ArrayList<String> words) {
        int uniqeWordsCount = 0;
        for(int i = 0; i < words.size(); ++i) {
            boolean uniqeFlag = true;
            for(int j = 0; j < words.size(); ++j) {
                if (Objects.equals(words.get(i), words.get(j)) && i != j) {
                    uniqeFlag = false;
                    break;
                }
            }
            if (uniqeFlag) {
                ++uniqeWordsCount;
            }
        }
        return uniqeWordsCount;
    }

    public static int WordsCount(String text) {
        int count = 1;
        for(int i = 0; i < text.length(); ++i) {
            if (text.charAt(i) == ' ') {
                ++count;
            }
        }
        return count;
    }

    public HashMap<String, Integer> countUniqeWordsAndAllWord(String text) {
        int wordsCount = WordsCount(text);
        int uniqeWordsCount = countUniqueWords(fillWordsArray(text));
        HashMap<String, Integer> result = new HashMap<>();
        result.put("Количество слов всего: ", wordsCount);
        result.put("Количество уникальных слов: ", uniqeWordsCount);
        return result;
    }
}
