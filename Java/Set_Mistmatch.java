class Solution {
    public int[] findErrorNums(int[] nums) {
        int [] answer = new int[2];
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != i + 1){
                answer[0] = nums[i];
                answer[1] = i + 1;
            }
        }
        return answer;
    }
}

/**
notes:
traverse nums and see if nums[i] = i + 1
if it's not then store nums[i] and i + 1 in variables and return 
 */
