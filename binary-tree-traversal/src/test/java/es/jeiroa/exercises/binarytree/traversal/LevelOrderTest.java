package es.jeiroa.exercises.binarytree.traversal;

import es.jeiroa.exercises.binarytree.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LevelOrderTest {
    private final LevelOrder unit = new LevelOrder();

    @Test
    void levelOrderTraversal1() {
        TreeNode tree = new TreeNode(1,
           null,
            new TreeNode(2,
                new TreeNode(3),null
            )
        );

        List<Integer> result = unit.levelOrderTraversal(tree);

        assertIterableEquals(Arrays.asList(1, 2, 3), result);
    }

    @Test
    void levelOrderTraversal2() {
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

        List<Integer> result = unit.levelOrderTraversal(tree);

        assertIterableEquals(List.of(1, 2, 3, 4, 5, 8, 6, 7, 9), result);
    }

    @Test
    void levelOrderTraversal3() {
        TreeNode tree = null;

        List<Integer> result = unit.levelOrderTraversal(tree);

        assertTrue(result.isEmpty());

        result = unit.levelOrderTraversal(tree);

        assertTrue(result.isEmpty());
    }

    @Test
    void levelOrderTraversal4() {
        TreeNode tree = new TreeNode(1);

        List<Integer> result = unit.levelOrderTraversal(tree);

        assertIterableEquals(List.of(1), result);
    }
}