package it.lucamicheletto.easy;

import java.util.List;

public class LC_203_RemoveLinkedListElements {
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

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        ListNode node;

        if (head.val == val) {
            node = removeElements(head.next, val);
        } else {
            node = head;
            node.next = removeElements(head.next, val);
        }

        return node;
    }
}