package graph.dfs;

public class NumberOfEnclaves1020 {


        int row=0;
        int col=0;


        public int numEnclaves(int[][] grid) {
             row= grid.length-1;
             col= grid[0].length-1;
            int ans=0;

            for(int r=0;r<=row;r++){
                if(grid[r][0]==1){
                    dfs(grid,r,0);
                }
            }

            for(int r=0;r<=row;r++){
                if(grid[r][col]==1){
                    dfs(grid,r,col);
                }
            }

            for(int c=0;c<=col;c++){
                if(grid[0][c]==1){
                    dfs(grid,0,c);
                }
            }

            for(int c=0;c<=col;c++){
                if(grid[row][c]==1){
                    dfs(grid,row,c);
                }
            }

            for(int r=0;r<=row;r++){
                for(int c=0;c<col;c++){
                    if(grid[r][c]==1)
                        ans++;
                }

            }

            return ans;


        }

        public void dfs(int[][] grid,int r,int c){
            if(r<0 ||r>row ||c<0 || c>col ||grid[r][c]==0){
                return;
            }

            grid[r][c]=0;
            dfs(grid,r+1,c);
            dfs(grid,r-1,c);
            dfs(grid,r,c+1);
            dfs(grid,r,c-1);
        }

    public static void main(String[] args) {
            int[][] input = new int [][]{{0,0,0,0},{1,0,1,0},{0,1,1,0},{0,0,0,0}};
        NumberOfEnclaves1020 numberOfEnclaves1020 = new NumberOfEnclaves1020();
        System.out.println(numberOfEnclaves1020.numEnclaves(input));
    }

}

