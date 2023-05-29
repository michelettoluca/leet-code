package it.lucamicheletto.easy;

import java.util.ArrayList;
import java.util.List;


public class LC_94_BinaryTreeInorderTraversal {
    private static class TreeNode {
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

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        this.traverse(result, root);

        return result;
    }

    public void traverse(List<Integer> result, TreeNode node) {
        if (node == null) {
            return;
        }

        if (this.isLeaf(node)) {
            result.add(node.val);
            return;
        }

        this.traverse(result, node.left);

        result.add(node.val);

        this.traverse(result, node.right);
    }

    public boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }
}

