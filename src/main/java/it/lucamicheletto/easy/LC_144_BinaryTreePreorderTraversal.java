package it.lucamicheletto.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LC_144_BinaryTreePreorderTraversal {

    private class TreeNode {
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


    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null) {
            return List.of();
        }

        List<Integer> traversalResult = new ArrayList<>();

        recursive(traversalResult, root);

        return traversalResult;
    }

    private void recursive(List<Integer> traversalResult, TreeNode node) {
        if (node == null) return;

        traversalResult.add(node.val);
        recursive(traversalResult, node.left);
        recursive(traversalResult, node.right);
    }
}
