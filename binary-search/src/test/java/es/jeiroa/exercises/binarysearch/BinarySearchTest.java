package es.jeiroa.exercises.binarysearch;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    private BinarySearch unit = new BinarySearch();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void searchTargetExistsEven() {
        final int[] nums = { -1, 0, 3, 5, 9, 12 };
        int target = 9;

        int result = unit.search(nums, target);

        assertEquals(4, result);
    }

    @Test
    void searchTargetExistsOdd() {
        final int[] nums = { -1, 0, 3, 5, 9 };
        int target = 3;

        int result = unit.search(nums, target);

        assertEquals(2, result);
    }

    @Test
    void searchTargetExistsOneElement() {
        final int[] nums = { 0 };
        int target = 0;

        int result = unit.search(nums, target);

        assertEquals(0, result);
    }

    @Test
    void searchTargetNotExists() {
        final int[] nums = { -1, 0, 3, 5, 9, 12 };
        int target = 2;

        int result = unit.search(nums, target);

        assertEquals(-1, result);
    }
}