import java.util.Stack;

/**
 * Sonu Kumar (https://github.com/SonuKumar81800)
 */

public class Solution232 {
  public static void main(String[] args) {
    MyQueue obj = new MyQueue();
    obj.push(4);
    obj.push(5);
    int param_2 = obj.pop();
    int param_3 = obj.peek();
    boolean param_4 = obj.empty();
    System.out.println(param_2 + " " + param_3 + " " + param_4);
  }
}

class MyQueue {
  Stack<Integer> stack;

  public MyQueue() {
    this.stack = new Stack<>();
  }

  public void push(int x) {
    Stack<Integer> tempStack = new Stack<>();
    while (!this.stack.isEmpty()) {
      tempStack.push(this.stack.pop());

    }
    tempStack.push(x);
    stack.clear();
    while (!tempStack.isEmpty()) {
      this.stack.push(tempStack.pop());
    }
  }

  public int pop() {
    return this.stack.pop();
  }

  public int peek() {
    return this.stack.peek();
  }

  public boolean empty() {
    return this.stack.isEmpty();
  }
}