"""
Question from Leetcode
"""
class Solution(object):
    def shuffle(self, nums, n):
        """
        :type nums: List[int]
        :type n: int
        :rtype: List[int]
        """
        
        """
        notes:

        use two pointers -- one pointer at nums[0] and one pointer at nums[n]
        traverse the array iterating by i++ and n-1 + 1 
        add nums[i] and nums[n + i] to temp array alternating 
        to prevent nums[i] from overwriting nums[n + i] during the next iteration, 
        use 2*i to store in every other index 
        EX: temp = [nums[i], nums[n+i], nums[i], nums[n+i]] is equal to 
        [nums[0], nums[3+0], nums[1], nums[3+1]]

        """
        temp = []
        for i in range(n):
            temp.append(nums[i])
            temp.append(nums[n+i])
        return temp 

        """
        *note to self: use append with an empty array in python 
        """
