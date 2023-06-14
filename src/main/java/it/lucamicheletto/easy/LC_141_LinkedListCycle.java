package it.lucamicheletto.easy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LC_141_LinkedListCycle {
    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        // Floyd’s Cycle Detection Algorithm
        // this shit is cool, didn't know about it
        // https://medium.com/swlh/floyds-cycle-detection-algorithm-32881d8eaee1

        Set<ListNode> visited = new HashSet<>();

        ListNode currentNode = head;
        while (currentNode != null) {
            if (visited.contains(currentNode)) {
                return true;
            } else {
                visited.add(currentNode);
            }

            currentNode = currentNode.next;
        }

        return false;
    }
}
