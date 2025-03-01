package day1;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seenNumbers = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int currentNumber = nums[i];
            int neededNumber = target - currentNumber;
            if (seenNumbers.containsKey(neededNumber)) {
                return new int[]{seenNumbers.get(neededNumber), i};
            }
            seenNumbers.put(currentNumber, i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("Indices found: ["
                + result[0] + ", " + result[1] + "]");
    }
}
