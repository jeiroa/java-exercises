package es.jeiroa.exercises.binarytree.traversal;

import es.jeiroa.exercises.binarytree.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PreOrderTest {
    private final PreOrder unit = new PreOrder();

    @Test
    void preorderTraversal1() {
        final TreeNode tree = new TreeNode(1,
            null,
            new TreeNode(2,
                new TreeNode(3),null
            )
        );
        final List<Integer> expected = List.of(1, 2, 3);

        List<Integer> result = unit.preOrderTraversal(tree);

        assertIterableEquals(expected, result);

        result = unit.preOrderTraversalIter(tree);

        assertIterableEquals(expected, result);
    }

    @Test
    void preorderTraversal2() {
        final TreeNode tree = new TreeNode(1,
            new TreeNode(2,
                new TreeNode(4),
                new TreeNode(5,
                    new TreeNode(6),
                    new TreeNode(7)
                )
            ),
            new TreeNode(3,
                null,
                new TreeNode(8,
                    new TreeNode(9),
                    null
                )
            )
        );
        final List<Integer> expected = List.of(1, 2, 4, 5, 6, 7, 3, 8, 9);

        List<Integer> result = unit.preOrderTraversal(tree);

        assertIterableEquals(expected, result);

        result = unit.preOrderTraversalIter(tree);

        assertIterableEquals(expected, result);
    }

    @Test
    void preOrderTraversal3() {
        TreeNode tree = null;

        List<Integer> result = unit.preOrderTraversal(tree);

        assertTrue(result.isEmpty());

        result = unit.preOrderTraversalIter(tree);

        assertTrue(result.isEmpty());
    }

    @Test
    void preOrderTraversal4() {
        TreeNode tree = new TreeNode(1);
        final List<Integer> expected = List.of(1);

        List<Integer> result = unit.preOrderTraversal(tree);

        assertIterableEquals(expected, result);

        result = unit.preOrderTraversalIter(tree);

        assertIterableEquals(expected, result);
    }
}