import java.util.Stack;

/**
 * Sonu Kumar (https://github.com/SonuKumar81800)
 */
public class Solution20 {
  public static void main(String[] args) {
    String s = "()[]{}";
    System.out.println(isValid(s));
  }

  public static boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    for (char c : s.toCharArray()) {
      if (c == '(' || c == '{' || c == '[')
        stack.add(c);
      else {
        if (stack.isEmpty())
          return false;
        char p = stack.peek();
        if ((c == ']' && p != '[') || (c == ')' && p != '(') || (c == '}' && p != '{'))
          return false;
        stack.pop();
      }
    }
    if (stack.isEmpty())
      return true;
    else
      return false;
  }

}
