//This problem was taken from 
class containsDuplicate {
    public static boolean containsDuplicate(int[] nums) {

    //Approach: 
    
 /*1. Have a counter variable initialized to zero
   2. Have a placeholder variable to hold the current value
   3. Have a placeholder variable to hold the next value
   4. If the current value is equal to the next value, add 1 to the counter; otherwise set the next value to the next index of the array
    Repeat the process
      Break out of the logic and return true
    5. If the next value is equal to null, then set the current value to the next value in the array and repeat process 4 */

    int currentValue = nums[0];
    int nextValue = nums[1];
    int foundDuplicate;

    //nums = [1,2,3,1]
    for (int index=0; index<nums.length; index++){
        currentValue = nums[index];
        if(index!= )
        nextValue = nums[index+1]; //if not null/empty
       // if (nextValue != null){
            if(currentValue == nextValue){
            return true;
        }
       // }
        
    }
    return false;

    }

    public static void main(String[] args){

		//TODO: 
        /*
         * 1. Need to call the function in the main method.
         * 2. Print the result of the function call from step 1.
         */
	
         /*RUNNING THIS FILE:
        1. Compilation step: To compile the java program to ensure there aren't any errors prior to runtime (running the application),
        run the following command: 
        javac containsDuplicates.java

        2. RunTime step: To run the java program, run the following command:
        java containsDuplicates.java

         */

         //FIXME: Ran into the following issue when trying to compile this file via the 'javac containsDuplicates.java' command
	}
}