package es.jeiroa.exercises.binarytree.traversal;

import es.jeiroa.exercises.binarytree.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PostOrderTest {
    private PostOrder unit = new PostOrder();

    @Test
    void postOrderTraversal1() {
        final TreeNode tree = new TreeNode(1,
                null,
                new TreeNode(2,
                        new TreeNode(3),null
                )
        );
        final List<Integer> expected = List.of(3, 2, 1);

        List<Integer> result = unit.postOrderTraversal(tree);

        assertIterableEquals(expected, result);

        result = unit.postOrderTraversalIter(tree);

        assertIterableEquals(expected, result);
    }

    @Test
    void postOrderTraversal2() {
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
        final List<Integer> expected = List.of(4, 6, 7, 5, 2, 9, 8, 3, 1);

        List<Integer> result = unit.postOrderTraversal(tree);

        assertIterableEquals(expected, result);

        result = unit.postOrderTraversalIter(tree);

        assertIterableEquals(expected, result);
    }

    @Test
    void postOrderTraversal3() {
        TreeNode tree = null;

        List<Integer> result = unit.postOrderTraversal(tree);

        assertTrue(result.isEmpty());

        result = unit.postOrderTraversalIter(tree);

        assertTrue(result.isEmpty());
    }

    @Test
    void postOrderTraversal4() {
        TreeNode tree = new TreeNode(1);
        final List<Integer> expected = List.of(1);

        List<Integer> result = unit.postOrderTraversal(tree);

        assertIterableEquals(expected, result);

        result = unit.postOrderTraversalIter(tree);

        assertIterableEquals(expected, result);
    }
}