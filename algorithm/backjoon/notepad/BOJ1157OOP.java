package algorithm.backjoon.notepad;

import java.util.*;

class FrequencyTable {
    final private int[] alphabetCountTable = new int[26];


    public void add(char c) {
        int arrPosition = c - 'A';

        if ('A' <= c && c <= 'Z') {
            alphabetCountTable[arrPosition]++;
        }
    }

    public int getMaxValue() {
        int max = 0;
        for (int i = 0; i < 26; i++) {
            if (alphabetCountTable[i] > max) {
                max = alphabetCountTable[i];
            }
        }
        return max;
    }

    public List<Character> getCharacterWithMaxCount() {
        int currentMaxCount = getMaxValue();

        List<Character> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            if (alphabetCountTable[i] == currentMaxCount) {
                result.add((char) ('A' + i));
            }
        }
        return result;
    }
}

class WordAnalyzer {
    private final FrequencyTable frequencyTable = new FrequencyTable();

    public WordAnalyzer(String word) {
        analyze(word);
    }

    private void analyze(String word) {
        for (char ch : word.toUpperCase().toCharArray()) {
            frequencyTable.add(ch);
        }
    }

    public char getMostFrequencyChar() {
        List<Character> maxChars = frequencyTable.getCharacterWithMaxCount();
        return maxChars.size() == 1 ? maxChars.get(0) : '?';
    }


}


public class BOJ1157OOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        WordAnalyzer wordAnalyzer = new WordAnalyzer(sc.nextLine());
        System.out.println(wordAnalyzer.getMostFrequencyChar());

    }
}
