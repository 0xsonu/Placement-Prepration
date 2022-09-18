import java.util.Arrays;

public class Solution200 {
  public static void main(String[] args) {
    char[][] grid = {
        { '1', '1', '1' },
        { '0', '1', '0' },
        { '1', '1', '1' }
    };
    // char[][] grid = {
    // { '1', '1', '1', '1', '0' },
    // { '1', '1', '0', '1', '0' },
    // { '1', '1', '0', '0', '0' },
    // { '0', '0', '0', '0', '0' },
    // };
    System.out.println(numIslands(grid));
  }

  public static int numIslands(char[][] grid) {
    int count = 0;
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        if (grid[i][j] == '1') {
          dfs(grid, i, j);
          count++;
        }
      }
    }
    return count;
  }

  public static void dfs(char[][] grid, int i, int j) {

    int x = i, y = j;
    if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[x][y] == '2' || grid[x][y] == '0')
      return;
    if (grid[x][y] == '1') {
      grid[x][y] = '2';
      dfs(grid, i, j + 1);
      dfs(grid, i + 1, j);
      dfs(grid, i, j - 1);
      dfs(grid, i - 1, j);
      System.out.println(Arrays.deepToString(grid));
    }
  }
}
