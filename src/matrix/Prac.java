package matrix;

public class Prac {


    public static void main(String[] args) {

        int[][] grid = new int[2][2];
        grid[0][0] = 1;
        grid[0][1] = 2;
        grid[1][0] = 3;
        grid[1][1] = 4;

        System.out.println(grid.length);

       /* for (int i = 0; i < grid.length; i++) {
            System.out.println();
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j]);
            }

        }*/

        printColumn(grid);


    }

    public static void printColumn(int[][] grid) {

        for (int c = 0; c < grid[c].length; c++) {
            System.out.println(grid[c]);
        }

    }

}
