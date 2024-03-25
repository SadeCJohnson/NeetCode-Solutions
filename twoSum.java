class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        //if the value at the currentIndex + value @ the nextIndex == target, return those indices
        // otherwise increment the inner index and repeat the process

        for (int currentIndex=0; currentIndex < nums.length; currentIndex++){
            for(int nextIndex=currentIndex+1; nextIndex<nums.length; nextIndex++){
                if (nums[currentIndex]+ nums[nextIndex]==target){
                    indices[0] = currentIndex;
                    indices[1] = nextIndex; 
                    
                } 
            }
        }
        return indices;
    }
    //Accepted on leetcode with the following feedback: Runtime 49ms Beats 15.13% of users with Java
    //TODO: Add a main class and the accepted solutions.
}
