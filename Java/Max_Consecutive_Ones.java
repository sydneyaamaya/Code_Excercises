class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
     int count = 0;
     int greatest = 0;
     for (int i = 0; i < nums.length; i++){
        //if the element is 1 than count is udated by 1
        if (nums[i] == 1){
            count++;
        }
        //if the element is not 1 then count is set back to zero to start a new window
        else{
            count = 0;
        }
        //if count (the value of the window of ones) is greater than the current greatest value
        //replace greatest with count 
        if (count > greatest){
            greatest = count;
        }
        //System.out.println(count); this was for debugging 
     }
     return greatest;
    }
}

/**
notes:
traverse nums and use an if statement to see if nums[i] is a 1 
if it is a 1, keep track of the number of consecutive ones using a while loop
then compare the values of the windows of ones returning the greatest one 
*/
