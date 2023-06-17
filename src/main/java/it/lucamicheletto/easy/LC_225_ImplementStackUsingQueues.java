package it.lucamicheletto.easy;

import java.util.ArrayDeque;
import java.util.Queue;

public class LC_225_ImplementStackUsingQueues {
    class MyStack {
        private final Queue<Integer> stacklike;
        private final Queue<Integer> supportQueue;

        public MyStack() {
            this.stacklike = new ArrayDeque<>();
            this.supportQueue = new ArrayDeque<>();
        }

        public void push(int x) {
            while (!stacklike.isEmpty()) {
                supportQueue.add(stacklike.remove());
            }

            stacklike.add(x);

            while (!supportQueue.isEmpty()) {
                stacklike.add(supportQueue.remove());
            }
        }

        public int pop() {
            return stacklike.remove();
        }

        public int top() {
            return stacklike.peek();
        }

        public boolean empty() {
            return stacklike.isEmpty();
        }
    }
}