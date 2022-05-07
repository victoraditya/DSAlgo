package AmazonOnline;

public class BetaTestingApp {

    public static void main(String[] args) {
        int[] tests = {30, 10, 40, 20, 50};
        int days = 2;
        BetaTesting betaTesting = new BetaTesting();
        System.out.println(betaTesting.minDifficulty(tests, days));
    }

}
