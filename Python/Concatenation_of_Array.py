class Solution(object):
    def getConcatenation(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        list1 = []
        list2 = []
        for i in range(len(nums)):
            list1.append(nums[i])
            list2.append(nums[i])
        return list1 + list2

"""
notes: 
lists can be added in python so traverse nums, add the elements to 
two lists, and then add the two lists 
"""
        
