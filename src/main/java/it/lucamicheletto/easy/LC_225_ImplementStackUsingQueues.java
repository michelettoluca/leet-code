package it.lucamicheletto.easy;

import java.util.ArrayDeque;
import java.util.Queue;

public class LC_225_ImplementStackUsingQueues {
    class MyStack {
        private Queue<Integer> _queueA;
        private Queue<Integer> _queueB;

        public MyStack() {
            this._queueA = new ArrayDeque<>();
            this._queueB = new ArrayDeque<>();
        }

        public void push(int x) {
            Queue<Integer> queue = _queueA;

            if (_queueA.isEmpty()) {
                queue = _queueB;
            }

            queue.add(x);
        }

        public int pop() {
            Queue<Integer> queueA = _queueA;
            Queue<Integer> queueB = _queueB;

            if (_queueA.isEmpty()) {
                queueA = _queueB;
                queueB = _queueA;
            }

            while (queueA.size() != 1) {
                queueB.add(queueA.remove());
            }

            return queueA.remove();
        }

        public int top() {
            Queue<Integer> queueA = _queueA;
            Queue<Integer> queueB = _queueB;

            if (_queueA.isEmpty()) {
                queueA = _queueB;
                queueB = _queueA;
            }

            while (queueA.size() != 1) {
                queueB.add(queueA.remove());
            }

            Integer value = queueA.remove();
            queueB.add(value);

            return value;
        }

        public boolean empty() {
            return _queueA.isEmpty() && _queueB.isEmpty();
        }
    }
}