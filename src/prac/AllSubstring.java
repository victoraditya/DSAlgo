package prac;

public class AllSubstring {

    public static void main(String[] args) {
        String s = "Aditya";
        printAllSubstring(s);
    }

    private static void printAllSubstring(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                count++;
                System.out.println(s.substring(i, j));
            }
        }
        System.out.println(count);
    }
}
