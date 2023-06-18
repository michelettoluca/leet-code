package it.lucamicheletto.easy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class LC_234_PalindromeLinkedList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public boolean isPalindrome(ListNode head) {
        int listLength = getListLength(head);

        Deque<Integer> stack = new ArrayDeque<>();

        int middleElementIndex = listLength / 2;
        int offset = listLength % 2;

        ListNode node = head;
        int index = 0;

        while (node != null) {
            if (index < middleElementIndex) {
                stack.push(node.val);

            } else if (index >= middleElementIndex + offset && stack.peek() == node.val) {
                stack.pop();
            }

            node = node.next;
            index++;
        }

        return stack.isEmpty();
    }

    private int getListLength(ListNode head) {
        int length = 0;

        while (head != null) {
            head = head.next;
            length++;
        }

        return length;
    }
}