package es.jeiroa.exercises.binarytree.traversal;

import es.jeiroa.exercises.binarytree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class InOrder {
    public List<Integer> inOrderTraversal(TreeNode node) {
        List<Integer> vals = new ArrayList<>();

        if (node != null) {
            vals.addAll(inOrderTraversal(node.getLeft()));
            vals.add(node.getVal());
            vals.addAll(inOrderTraversal(node.getRight()));
        }

        return vals;
    }

    public List<Integer> inOrderTraversalIter(TreeNode node) {
        final Deque<TreeNode> stack = new ArrayDeque<>();
        List<Integer> vals = new ArrayList<>();

        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                stack.push(node);
                node = node.getLeft();
            }

            node = stack.pop();
            vals.add(node.getVal());
            node = node.getRight();
        }

        return vals;
    }
}
