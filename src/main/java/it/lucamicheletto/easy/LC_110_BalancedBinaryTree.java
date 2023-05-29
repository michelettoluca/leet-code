package it.lucamicheletto.easy;


public class LC_110_BalancedBinaryTree {
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

    public boolean isBalanced(TreeNode root) {
        return recursive(root) != -1;
    }

    public int recursive(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftDepth = recursive(node.left);

        if (leftDepth == -1) {
            return -1;
        }

        int rightDepth = recursive(node.right);

        if (rightDepth == -1) {
            return -1;
        }

        int diff = leftDepth - rightDepth;

        if (Math.abs(diff) > 1) {
            return -1;
        }

        return Math.max(leftDepth, rightDepth) + 1;
    }
}

