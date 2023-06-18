package it.lucamicheletto.easy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class LC_232_ImplementQueueUsingStacks {
    class MyQueue {
        private final Deque<Integer> stack;
        private final Deque<Integer> supportStack;


        public MyQueue() {
            stack = new ArrayDeque<>();
            supportStack = new ArrayDeque<>();
        }

        public void push(int x) {
            while (!stack.isEmpty()) {
                supportStack.push(stack.pop());
            }

            stack.push(x);

            while (!supportStack.isEmpty()) {
                stack.push(supportStack.pop());
            }

        }

        public int pop() {
            return stack.pop();
        }

        public int peek() {
            return stack.peek();
        }

        public boolean empty() {
            return stack.isEmpty();
        }
    }
}