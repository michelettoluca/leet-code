package it.lucamicheletto.easy;


public class LC_101_SymmetricTree {
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

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return areSymmetricTrees(root.left, root.right);
    }

    public boolean areSymmetricTrees(TreeNode p, TreeNode q) {
        if (p == q) {
            return true;
        }

        if (p != null && q != null) {
            return p.val == q.val && areSymmetricTrees(p.right, q.left) && areSymmetricTrees(p.left, q.right);
        }

        return false;
    }
}

