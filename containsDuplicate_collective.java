import java.util.Arrays;

public class containsDuplicate_collective {

    public static boolean containsDuplicate(int[] nums) {
        // Sort the array
        Arrays.sort(nums);

        // Check for consecutive duplicate elements
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                System.out.println("true");
                return true;
            }
        }
        System.out.println("false");
        return false;
    }

    public static void main(String[] args) {
        containsDuplicate(new int[]{170,-368,148,672,397,-629,-788,192,170,309,-615,-237});
    }
    //this is a collective solution
}

