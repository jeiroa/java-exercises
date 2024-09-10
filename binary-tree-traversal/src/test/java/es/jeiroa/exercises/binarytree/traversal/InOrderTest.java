package es.jeiroa.exercises.binarytree.traversal;

import es.jeiroa.exercises.binarytree.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InOrderTest {
    private final InOrder unit = new InOrder();

    @Test
    void inOrderTraversal1() {
        TreeNode tree = new TreeNode(1,
            null,
            new TreeNode(2,
                new TreeNode(3),null
            )
        );

        List<Integer> result = unit.inOrderTraversal(tree);

        assertIterableEquals(List.of(1, 3, 2), result);

        result = unit.inOrderTraversalIter(tree);

        assertIterableEquals(List.of(1, 3, 2), result);
    }

    @Test
    void inOrderTraversal2() {
        TreeNode tree = new TreeNode(1,
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

        List<Integer> result = unit.inOrderTraversal(tree);

        assertIterableEquals(List.of(4, 2, 6, 5, 7, 1, 3, 9, 8), result);

        result = unit.inOrderTraversalIter(tree);

        assertIterableEquals(List.of(4, 2, 6, 5, 7, 1, 3, 9, 8), result);
    }

    @Test
    void levelOrderTraversal3() {
        TreeNode tree = null;

        List<Integer> result = unit.inOrderTraversal(tree);

        assertTrue(result.isEmpty());

        result = unit.inOrderTraversalIter(tree);

        assertTrue(result.isEmpty());
    }

    @Test
    void inOrderTraversal4() {
        TreeNode tree = new TreeNode(1);

        List<Integer> result = unit.inOrderTraversal(tree);

        assertIterableEquals(List.of(1), result);

        result = unit.inOrderTraversalIter(tree);

        assertIterableEquals(List.of(1), result);
    }
}