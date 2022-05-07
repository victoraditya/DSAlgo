package AmazonOnline;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class RoboticsChallenge {

    public static void main(String[] args) {

        int num = 8;
        String[] array = {"5", "-2", "4", "Z", "X", "9", "+", "+"};
        String[] array1 = {"1", "2", "+", "Z"};
        List<String> list = Arrays.asList(array);
        List<String> list1 = Arrays.asList(array1);
        System.out.println(TotalScore(num, list));
        System.out.println(TotalScore(num, list1));
    }


    public static int TotalScore(int num, List<String> blocks) {
        Stack<Integer> s = new Stack<>();
        int totalScore = 0;
        for (String block : blocks) {
            if (block == "X") {
                if (s.isEmpty())
                    break;

                totalScore += s.peek() * 2;
                s.push(s.peek() * 2);
            } else if (block == "+") {
                if (s.size() < 2)
                    break;

                int score1 = s.pop();
                int score2 = s.pop();
                s.push(score2);
                s.push(score1);
                totalScore += score1 + score2;
                s.push(score1 + score2);
            } else if (block == "Z") {
                totalScore -= s.pop();
            } else {
                int val = Integer.parseInt(block);
                totalScore += val;
                s.push(val);
            }

        }
        return totalScore;
    }
}
