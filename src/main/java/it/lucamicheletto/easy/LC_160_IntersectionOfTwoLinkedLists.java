package it.lucamicheletto.easy;

import java.util.*;

public class LC_160_IntersectionOfTwoLinkedLists {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }


    // Read a solution and understood the problem better
    // the optimal solution was actually easy
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode nodeA = headA;
        ListNode nodeB = headB;

        int aLength = getLength(nodeA);
        int bLength = getLength(nodeB);

        while (aLength > bLength) {
            if (nodeA == null) return null;

            nodeA = nodeA.next;
            aLength--;
        }

        while (bLength > aLength) {
            if (nodeB == null) return null;

            nodeB = nodeB.next;
            bLength--;
        }

        while (nodeA != null && nodeB != null) {
            if(nodeA == nodeB) return nodeA;

            nodeA = nodeA.next;
            nodeB = nodeB.next;
        }

        return null;
    }

    private int getLength(ListNode node) {
        int length = 0;

        while (node != null) {
            length++;
            node = node.next;
        }

        return length;
    }

//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        HashMap<ListNode, Integer> nodeCount = new LinkedHashMap<>();
//
//        ListNode nodeA = headA;
//        ListNode nodeB = headB;
//
//        while (nodeA != null) {
//            nodeCount.put(nodeA, nodeCount.getOrDefault(nodeA, 0) + 1);
//            nodeA = nodeA.next;
//        }
//
//        while (nodeB != null) {
//            nodeCount.put(nodeB, nodeCount.getOrDefault(nodeB, 0) + 1);
//            nodeB = nodeB.next;
//        }
//
//        return nodeCount.entrySet()
//                .stream()
//                .filter(entry-> entry.getValue() == 2)
//                .findFirst()
//                .map(Map.Entry::getKey)
//                .orElse(null);
//    }
}
