package it.lucamicheletto.easy;

import java.util.ArrayList;
import java.util.List;


public class LC_100_SameTree {
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

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == q) {
            return true;
        }

        if (p != null && q != null) {
            return p.val == q.val && isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
        }

        return false;
    }
}

