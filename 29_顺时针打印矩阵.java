class Solution {
    int[] dx = new int[]{0, 1, 0, -1};
    int[] dy = new int[]{1, 0, -1, 0};
    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }
        int n = matrix.length;
        int m = matrix[0].length;
        boolean[][] vis = new boolean[n][m];
        int[] res = new int[n * m];
        int index = 0;
        
        int x = 0, y = 0, d = 0;
        for (int i = 1; i <= n * m; i++) {
            int nx = x + dx[d];
            int ny = y + dy[d];
            
            if (nx < 0 || nx >= n || ny < 0 || ny >= m || vis[nx][ny]) {
                d = (d + 1) % 4;
                nx = x + dx[d];
                ny = y + dy[d];
            }
            
            res[index++] = matrix[x][y];
            vis[x][y] = true;
            x = nx;
            y = ny;
        }
        return res;
    }
}
