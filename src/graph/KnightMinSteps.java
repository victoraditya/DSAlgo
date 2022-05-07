package graph;

import java.util.LinkedList;
import java.util.Queue;

public class KnightMinSteps {

    public static void main(String[] args) {

        int N = 30;
        int startRow = 0;
        int startCol = 0;
        int endRow = 29;
        int endCol = 29;
        System.out.println(minStepToReachTarget(startRow, startCol, endRow, endCol, N));

    }

    static class cell {
        int x, y;
        int dis;


        public cell(int x, int y, int dis) {
            this.x = x;
            this.y = y;
            this.dis = dis;
        }
    }

    private static int minStepToReachTarget(int startRow, int startCol, int endRow, int endCol, int n) {

        int dx[] = {-2, -1, 1, 2, -2, -1, 1, 2};
        int dy[] = {-1, -2, -2, -1, 1, 2, 2, 1};

        Queue<cell> queue = new LinkedList<>();
        queue.add(new cell(startRow, startCol, 0));

        cell t;
        int x, y;
        boolean visit[][] = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                visit[i][j] = false;
            }
        }

        visit[startRow][startCol] = true;

        while (!queue.isEmpty()) {
            t = queue.poll();

            if (t.x == endRow && t.y == endCol)
                return t.dis;

            for (int i = 0; i < 8; i++) {
                x = t.x + dx[i];
                y = t.y + dy[i];

                if (isInside(x, y, n) && !visit[x][y]) {
                    visit[x][y] = true;
                    queue.add(new cell(x, y, t.dis + 1));
                }
            }
        }
        return -1;


    }

    private static boolean isInside(int x, int y, int n) {
        if (x >= 0 && x < n && y >= 0 && y < n)
            return true;
        return false;
    }


}
