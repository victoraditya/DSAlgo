package recursion;

public class TowerOfHanoi {

    public static void main(String[] args) {
        int n = 4;
        towerOfHanoi(n, 'A', 'b', 'C');
    }

    private static void towerOfHanoi(int n, char rodFrom, char aux, char rodTo) {
        if (n == 1) {
            System.out.println("Move " + n + " from : " + rodFrom + " to : " + rodTo);
            return;
        }

        towerOfHanoi(n - 1, rodFrom, rodTo, aux);
        System.out.println("Move " + n + " from : " + rodFrom + " to : " + rodTo);
        towerOfHanoi(n - 1, aux, rodFrom, rodTo);
    }
}
