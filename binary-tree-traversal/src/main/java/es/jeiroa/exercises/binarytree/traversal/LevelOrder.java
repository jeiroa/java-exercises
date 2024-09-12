package es.jeiroa.exercises.binarytree.traversal;

import es.jeiroa.exercises.binarytree.TreeNode;

import java.util.*;

public class LevelOrder {
    public List<Integer> levelOrderTraversal(TreeNode tree) {
        List<Integer> vals = new ArrayList<>();
        Queue<TreeNode> levelQueue = new LinkedList<>();

        if (tree != null) {
            levelQueue.add(tree);
        }

        while (!levelQueue.isEmpty()) {
            TreeNode node = levelQueue.poll();
            vals.add(node.getVal());

            if (node.getLeft() != null) {
                levelQueue.add(node.getLeft());
            }

            if (node.getRight() != null) {
                levelQueue.add(node.getRight());
            }
        }

        return vals;
    }
}
