package es.jeiroa.exercises.binarytree.traversal;

import es.jeiroa.exercises.binarytree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class PreOrder {
    public List<Integer> preOrderTraversal(TreeNode root) {
        List<Integer> vals = new ArrayList<>();

        if (root != null) {
            vals.add(root.getVal());
            vals.addAll(preOrderTraversal(root.getLeft()));
            vals.addAll(preOrderTraversal(root.getRight()));
        }

        return vals;
    }

    public List<Integer> preOrderTraversalIter(TreeNode root) {
        final Deque<TreeNode> stack = new ArrayDeque<>();
        List<Integer> vals = new ArrayList<>();

        if (root != null) {
            stack.push(root);
        }

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            vals.add(node.getVal());

            // push right first
            if (node.getRight()!= null) {
                stack.push(node.getRight());
            }
            // because left will be popped first from the stack in the next iteration
            if (node.getLeft() != null) {
                stack.push(node.getLeft());
            }
        }

        return vals;
    }
}
