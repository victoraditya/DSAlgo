package Prac101;

public class BoundedProblem {

    public static void main(String[] args) {
        int[] marks = {3, 5, 7, 6, 3};
        int k = 2;
        boundedSolution(marks, 2);
    }

    private static void boundedSolution(int[] marks, int k) {
        int ans = 0;

        for (int i = 0; i < marks.length; i++) {
            for (int j = i; j < marks.length; j++) {
                if (Math.abs(marks[j] - marks[i]) <= k && marks[j] - marks[i] >= 0) {
                    ans++;
                    // j++;
                } else {
                    break;
                }
            }
        }
        System.out.println(ans);
    }


}
