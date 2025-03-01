package day1;

public class RemoveDuplicatesSortedArray {

    public static int removeDuplicates(int[] nums) {
        int p1 = 0;
        for (int p2 = 1; p2 < nums.length; p2++) {
            if (nums[p2] != nums[p1]) {
                p1++;
                nums[p1] = nums[p2];
            }
        }
        return p1 + 1;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int newLength = removeDuplicates(nums);
        System.out.println("New length: " + newLength);
        System.out.print("Array after removing duplicates (first newLength elements): ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
