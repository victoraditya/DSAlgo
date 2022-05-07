package AmazonOnline;

import java.util.*;

public class MostCommonWord {

    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String paragraph1 = "a, a, a, a, b,b,b,c, c";
        String[] banned = {"hit"};
        String[] banned1 = {"a"};

        //  System.out.println(mostCommonNonBannedWord(paragraph,banned));
        System.out.println(mostCommonNonBannedWord(paragraph1, banned1));

    }

    private static String mostCommonNonBannedWord(String paragraph, String[] banned) {

        Map<String, Integer> wordToCount = new HashMap<>();
        Set<String> bannedSet = new HashSet<>();
        String normalizedString = paragraph.replaceAll("[^a-zA-Z0-9 ]", " ");
        String normalizedString1 = normalizedString.toLowerCase();

        String[] words = normalizedString.split("\\s+");

        for (String word : banned) {
            bannedSet.add(word);
        }

        for (String word : words) {
            if (!bannedSet.contains(word)) {
                wordToCount.put(word, wordToCount.getOrDefault(word, 0) + 1);
            }

        }

        return Collections.max(wordToCount.entrySet(), Map.Entry.comparingByValue()).getKey();

    }

}
