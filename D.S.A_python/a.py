class Solution(object):
    
    def searchInsert(self , nums , target):
        
        low , high = 0 , len(nums) - 1

        for i in range(0,nums.length):
            if nums[i] == target:
                return i
            
        for i in range(len(nums)):
            if nums[i] > target:
                return i
            
        return len(nums)
    
a =  Solution()
a.nums = [1,3,5,6]
a.target = 5