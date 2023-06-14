package it.lucamicheletto.easy;


public class LC_112_PathSum {
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

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        return this.recursive(root, targetSum);
    }

    private boolean recursive(TreeNode node, int targetSum) {
        if (node.left == null && node.right == null) {
            return targetSum == node.val;
        }

        boolean leftBranch = node.left != null && recursive(node.left, targetSum - node.val);
        boolean rightBranch = node.right != null && recursive(node.right, targetSum - node.val);

        return leftBranch || rightBranch;
    }
}

