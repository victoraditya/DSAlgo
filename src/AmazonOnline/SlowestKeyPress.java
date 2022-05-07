package AmazonOnline;

public class SlowestKeyPress {

    public static void main(String[] args) {
        int[][] array = {{0, 1}, {1, 2}, {2, 3}, {3, 4}}; //<-- abcd
        int nums = 4;
        SlowestKeyPress s = new SlowestKeyPress();
        char res = s.slowestKey(array, nums);
        System.out.println("Slowest Key :  " + res);
    }

    public char slowestKey(int[][] releaseTimes, int nums) {
        int maxTime = releaseTimes[0][1];
        int res = releaseTimes[0][0];
        int index = 0;

        for (int i = 1; i < nums; i++) {
            int ch = releaseTimes[i][0];
            int diff = releaseTimes[i][1] - releaseTimes[i - 1][1];

            if (diff > maxTime) {
                index = i;
                res = ch;
                maxTime = diff;
            } else if (diff == maxTime && (char) releaseTimes[i][0] > (char) releaseTimes[index][0]) {
                // Return the key of the keypress that had the longest duration.
                // If there are multiple such keypresses, return the lexicographically largest key of the keypresses.
                index = i;
                res = ch;
            }
        }
        return (char) (res + 97);
    }
}

