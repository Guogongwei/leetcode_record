package org.tiny;

import java.util.*;

public class No653TwoSumIV {
    public static boolean findTarget(TreeNode root, int k) {
        if (root == null)
            return false;

        LinkedList<TreeNode> stack = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (set.contains(node.val)) {
                return true;
            }
            set.add(k - node.val);

            if (node.left != null) {
                stack.add(node.left);
            }
            if (node.right != null) {
                stack.add(node.right);
            }
        }

        return false;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
