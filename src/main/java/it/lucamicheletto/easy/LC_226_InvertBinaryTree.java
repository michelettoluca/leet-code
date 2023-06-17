package it.lucamicheletto.easy;

import java.util.ArrayDeque;
import java.util.Queue;

public class LC_226_InvertBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode invertTree(TreeNode root) {
        recursive(root);
        return root;
    }

    private void recursive(TreeNode node) {
        if (node == null) {
            return;
        }

        recursive(node.left);
        recursive(node.right);

        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
    }
}