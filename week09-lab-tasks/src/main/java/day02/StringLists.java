package day02;

import java.util.ArrayList;
import java.util.List;

public class StringLists {
    public List<String> shortestWords(List<String> words) {
        int minLength = findShortestWordLength(words);
        return selectWordsWithLength(words, minLength);
    }

    private List<String> selectWordsWithLength(List<String> words, int length) {
        List<String> result = new ArrayList<>();
        for (String word: words) {
            if (word.length() == length) {
                result.add(word);
            }
        }
        return result;
    }

    private int findShortestWordLength(List<String> words) {
        Integer minLength = null;
        for (String word: words) {
            if (minLength == null || word.length() < minLength) {
                minLength = word.length();
            }
        }
        return minLength;
    }
}
