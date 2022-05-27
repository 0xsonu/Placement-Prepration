
/**
 * Sonu Kumar (https://github.com/SonuKumar81800)
 */
import java.util.HashSet;

public class Solution36 {
  public static void main(String[] args) {
    char[][] board = {
        { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
        { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
        { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
        { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
        { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
        { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
        { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
        { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
        { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
    };
    System.out.println(isValidSudoku(board));
  }

  public static boolean isValidSudoku(char[][] board) {
    HashSet<String> visited = new HashSet<>();
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        char tile = board[i][j];
        if (tile != '.') {
          int boxIndex = ((i / 3) * 3) + (j / 3);
          if (!visited.add("row" + i + board[i][j]) || !visited.add("col" + j + board[i][j])
              || !visited.add("box" + boxIndex + board[i][j]))
            return false;
        }
      }
    }
    return true;
  }

}
