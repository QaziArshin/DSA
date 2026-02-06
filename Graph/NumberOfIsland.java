class Solution {
    public int numIslands(char[][] grid) {
        Stack<int[]> st = new Stack<>();

        int count =0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == '1'){
                    count++;
                    // int[] temp ={i,j};
                    st.push(new int[]{i,j});
                    grid[i][j] ='0';
            
            
        
        // if(i<=0 || i> grid.length || j<=0 || j>grid[0].length){
        //     return 0;
        // }

        while(!st.isEmpty()){
            int[] rem = st.pop();
            int r =rem[0];
            int c =rem[1];
        if(r+1<grid.length && grid[r+1][c] =='1'){
                // int[] temp = {r+1,c};
                st.push(new int[]{r+1,c});
                grid[r+1][c] ='0';
        }
        if(c+1<grid[0].length && grid[r][c+1] =='1'){
                // int[] temp = {r,c+1};
              st.push(new int[]{r,c+1});
                grid[r][c+1] ='0';

        }
        if(r-1>=0 && grid[r-1][c] =='1'){
                // int[] temp = {r-1,c};
                st.push(new int[]{r-1,c});
                grid[r-1][c] ='0';
        }
        if(c-1>=0 && grid[r][c-1] =='1'){
                // int[] temp = {r,c-1};
                st.push(new int[]{r,c-1});
                grid[r][c-1] ='0';
        }
        }
                }
            }
        }
        return count;
    }
}
