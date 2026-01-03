//Leet code problem 
//Given an integer array nums of length n, you want to create an array ans 
//of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

class Solution {
    public int[] getConcatenation(int[] nums) {
        //use a for loop to traverse nums storing each element i in a temp array in the ith position
        //in the same for loop add to the ith + the length of nums position nums[i]
        //time complexity O(n)
        int[] temp = new int[nums.length * 2];
        for(int i = 0; i <= nums.length - 1; i++){
            temp[i] = nums[i];
            temp[i + nums.length] = nums[i];
        }
        return temp;
  }
