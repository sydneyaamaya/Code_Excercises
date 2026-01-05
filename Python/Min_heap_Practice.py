class Solution(object):
    def totalCost(self, costs, k, candidates):
        """
        :type costs: List[int]
        :type k: int
        :type candidates: int
        :rtype: int
        """
        
        #populate the first list from index 0 to (int) candidates not including the index 
        #value of candidates
        #EX: candidates = 3, populate with indexes 0, 1, 2
        left_side = costs[:candidates]

        #populate the second list from index costs-1 to the index that is the value of candidates 
        #before the last index 
        #EX: candidates = 4, populate from 4 indexes inclusive before the last index 
        right_side = costs[max(candidates, len(costs) - candidates):]

        #heapify the lists 
        heapify(left_side)
        heapify(right_side)

        #create two pointers for the heaps to refill heaps 
        #the left side pointer will start at the index that is the value of candidates
        #the right side pointer will start at the index that is the value of candidates from 
        #the last index 

        hired = 0
        next_left, next_right = candidates, len(costs) - 1 - candidates

        for _ in range(k):
            #if either heap is empty and the min of the left side is <= the min of the right
            #pop the min of the left side into hired else pop min from the right
            if left_side and (not right_side or left_side[0] <= right_side[0]):
                hired += heappop(left_side)

                if next_left < len(costs) and next_left <= next_right:
                    heappush(left_side, costs[next_left])
                    next_left += 1

            else:
                hired += heappop(right_side)

                if next_right >= 0 and next_left <= next_right:
                    heappush(right_side, costs[next_right])
                    next_right -= 1
   
        return hired 


        """
        notes:
        --costs need to be traversed k times removing a candidate each time
        --use two min heaps: one for the left side of costs and one for the right
        --compare the top element from both heaps and remove the lowest one 
        --to keep each heap size k take an element from the heap that did not have 
        an element removed and add it to the other heap 
        
        *heapify turns a list into a valid min heap
        *in Java, use a Prioritity Queue and then populate it using two for loops, java 
        will require more code compared to python 

        """

