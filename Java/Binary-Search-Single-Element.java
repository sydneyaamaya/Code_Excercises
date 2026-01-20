/**
You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

Return the single element that appears only once.
*/
class Solution {
    public int singleNonDuplicate(int[] nums) {
        //left side of array 
        int left = 0;
        //right side of array 
        int right = nums.length - 1;
        //use a while loop to traverse array 
        while (left < right){
            //middle of the array 
            int mid = (left + right) / 2;
            //check if the element at index mid is the same as the elment at 
            //mid + 1 OR if mid is odd check if the elment at index mid is the same
            //as the element at mid -1
            if ((mid % 2 == 0 && nums[mid] == nums[mid + 1]) || (mid % 2 == 1 && nums[mid] == nums[mid-1])){
                //if the if statement is true then the element is a duplicate so continue searching
                left = mid +1;
            }
            else {
                right = mid;
            }
        }
        return nums[left];
    }
}

/**
notes:

use iterative binary search to achieve 0(log n) and space 0(1)
check if the element after each element is the same if not then return 
the single element 
 */
