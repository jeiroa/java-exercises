package es.jeiroa.exercises.binarytree.traversal;

import es.jeiroa.exercises.binarytree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class PostOrder {
    public List<Integer> postOrderTraversal(TreeNode root) {
        List<Integer> vals = new ArrayList<>();

        if (root != null) {
            vals.addAll(postOrderTraversal(root.getLeft()));
            vals.addAll(postOrderTraversal(root.getRight()));
            vals.add(root.getVal());
        }

        return vals;
    }

    public List<Integer> postOrderTraversalIter(TreeNode root) {
        List<Integer> vals = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();

        TreeNode node = root;
        TreeNode previousProcessed = null;

        while (node != null || !stack.isEmpty()) {
            if (node != null) {
                stack.push(node);
                node = node.getLeft();
            } else {
                node = stack.peek();

                if (node.getRight() == null || node.getRight() == previousProcessed) {
                    vals.add(node.getVal());
                    stack.pop();
                    previousProcessed = node;
                    node = null;
                } else {
                    node = node.getRight();
                }
            }
        }

        return vals;
    }
}
