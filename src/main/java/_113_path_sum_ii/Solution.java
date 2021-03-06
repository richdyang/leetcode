
package _113_path_sum_ii;

import _000_util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * https://leetcode.com/problems/path-sum-ii
 */
public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;

        Stack<Pair> stack = new Stack<>();

        List<Integer> path = new ArrayList<>();
        path.add(root.val);
        Pair pair = new Pair(root, root.val, path);
        stack.push(pair);

        while (!stack.empty()) {
            Pair current = stack.pop();
            if(current.node.left == null && current.node.right == null && current.sum == sum) {
                result.add(current.path); continue;
            }
            if(current.node.right != null) {
                path = new ArrayList<>(current.path);
                path.add(current.node.right.val);
                pair = new Pair(current.node.right, current.sum + current.node.right.val, path);
                stack.push(pair);
            }
            if(current.node.left != null) {
                path = new ArrayList<>(current.path);
                path.add(current.node.left.val);
                pair = new Pair(current.node.left, current.sum + current.node.left.val, path);
                stack.push(pair);
            }
        }

        return result;
    }

    private static class Pair {
        TreeNode node;
        int sum;
        List<Integer> path = new ArrayList<>();

        public Pair(TreeNode node, int sum, List<Integer> path) {
            this.node = node;
            this.sum = sum;
            this.path = path;
        }
    }
}




