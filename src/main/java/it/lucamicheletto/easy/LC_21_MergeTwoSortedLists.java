package it.lucamicheletto.easy;

import java.util.ArrayDeque;
import java.util.Deque;

public class LC_21_MergeTwoSortedLists {

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


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        int val;
        ListNode next;

        if (list1 == null && list2 == null) {
            return null;

        } else if (list1 == null) {
            val = list2.val;
            next = mergeTwoLists(null, list2.next);

        } else if (list2 == null) {
            val = list1.val;
            next = mergeTwoLists(list1.next, null);

        } else if (list1.val < list2.val) {
            val = list1.val;
            next = mergeTwoLists(list1.next, list2);

        } else {
            val = list2.val;
            next = mergeTwoLists(list1, list2.next);

        }

        return new ListNode(val, next);
    }
}
