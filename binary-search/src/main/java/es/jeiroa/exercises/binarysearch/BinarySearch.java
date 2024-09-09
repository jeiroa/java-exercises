package es.jeiroa.exercises.binarysearch;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int head = 0;
        int tail = nums.length - 1;

        while (tail >= head) {
            int pivot = (head + tail) / 2;

            if (nums[pivot] == target) {
                return pivot;
            } else if (nums[pivot] > target) {
                tail = pivot - 1;
            } else {
                head = pivot + 1;
            }
        }

        return -1;
    }
}
