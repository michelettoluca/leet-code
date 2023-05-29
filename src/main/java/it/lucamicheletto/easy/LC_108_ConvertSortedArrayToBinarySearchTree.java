package it.lucamicheletto.easy;


public class LC_108_ConvertSortedArrayToBinarySearchTree {
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

    public TreeNode recursive(int[] nums, int leftIndex, int rightIndex) {
        if (leftIndex > rightIndex) {
            return null;
        }

        TreeNode treeNode = new TreeNode();

        int middleIndex = (leftIndex + rightIndex) / 2;
        treeNode.val = nums[middleIndex];
        treeNode.left = recursive(nums, leftIndex, middleIndex - 1);
        treeNode.right = recursive(nums, middleIndex + 1, rightIndex);

        return treeNode;
    }
}

