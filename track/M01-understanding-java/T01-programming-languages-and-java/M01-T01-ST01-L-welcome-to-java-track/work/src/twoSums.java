import java.util.Arrays;

public class twoSums {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("No solution");
    }

    public static void main(String[] args) {
        twoSums solver = new twoSums();
        
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        System.out.println("Input Array: " + Arrays.toString(nums));
        System.out.println("Target: " + target);
        
        int[] result = solver.twoSum(nums, target);
        System.out.println("Result Indices: " + Arrays.toString(result));
        System.out.println("Values: nums[" + result[0] + "] + nums[" + result[1] + "] = " 
                           + nums[result[0]] + " + " + nums[result[1]] + " = " + target);
    }
}
