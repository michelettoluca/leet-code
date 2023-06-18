package it.lucamicheletto.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LC_257_BinaryTreePaths {
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

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();

        recursive(root, "", result);

        return result;
    }

    private void recursive(TreeNode node, String path, List<String> result) {
        if (node == null) {
            return;
        }


        if (node.left == null && node.right == null) {
            result.add(path + node.val);
        }

        recursive(node.left, path + node.val + "->", result);
        recursive(node.right, path + node.val + "->", result);
    }
}