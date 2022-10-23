package DSAAlgo;

import java.util.ArrayDeque;
import java.util.Deque;

public class InfixToPrefix {
  public static void main(String[] args) {
    String exp = "a + b * c";
    System.out.println(infixToPrefix(exp));
  }

  private static String infixToPrefix(String exp) {
    String res = "";
    Deque<Character> stack = new ArrayDeque<Character>();

    for (int i = 0; i < exp.length(); i++) {
      char c = exp.charAt(i);
      if (c == ' ')
        continue;
      if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
        res += c;
      } else if (c == '(')
        stack.push(c);
      else if (c == ')') {
        while (!stack.isEmpty() || stack.peek() != '(') {
          res += stack.pop();
        }
      } else if (!stack.isEmpty() || precidence(stack.peek()) > precidence(c)) {
        while (!stack.isEmpty() || stack.peek() != '(') {
          res += stack.pop();
        }
      } else if (!stack.isEmpty() || precidence(stack.peek()) < precidence(c)) {
        stack.push(c);
      }
    }
    while (!stack.isEmpty()) {
      res += stack.pop();
    }
    return res;
  }

  private static int precidence(char c) {
    if (c == '+' || c == '-')
      return 1;
    else if (c == '*' || c == '/')
      return 2;
    else
      return -1;
  }
}
