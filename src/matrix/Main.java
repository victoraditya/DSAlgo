package matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    /**
     * Iterate through each line of input.
     */

    private final static Comparator<String> CMP = new Comparator<String>() {
        @Override
        public int compare(String arg0, String arg1) {
            return arg1.length() - arg0.length();
        }
    };

    private static void insertSorted(List<String> list, String string) {
        int max = list.size();
        int min = 0;
        int pivot = min + (max - min) / 2;

        while (min < max) {
            int c = CMP.compare(string, list.get(pivot));
            if (c <= 0) {
                max = pivot;
            } else {
                min = pivot + 1;
            }
            pivot = min + (max - min) / 2;
        }
        list.add(min, string);
    }

    public static void main(String[] args) throws IOException {

        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        List<String> longestLines = new ArrayList<>();
        String line;
        while ((line = in.readLine()) != null) {
            {
                int numLongestLines = Integer.parseInt(line);
                while (numLongestLines > 0 && (line = in.readLine()) != null) {
                    numLongestLines--;
                    line = line.trim();
                    insertSorted(longestLines, line);
                }
            }

            int shortestLongLength = findShortestLongLine(longestLines);
            while ((line = in.readLine()) != null) {
                line = line.trim();
                if (line.length() > shortestLongLength) {
                    insertSorted(longestLines, line);
                    longestLines.remove(longestLines.size() - 1);
                    shortestLongLength = findShortestLongLine(longestLines);
                }
            }

            for (String longLine : longestLines) {
                System.out.println(longLine);
            }

        }


    }

    public static int findShortestLongLine(List<String> longestLines) {
        return longestLines.get(longestLines.size() - 1).length();
    }
}