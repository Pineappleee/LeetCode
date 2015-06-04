class Solution:
    # @param {integer[]} nums
    # @return {boolean}
    def containsDuplicate(self, nums):
        if (len(nums) != len(set(nums))):
            return True
        else:
            return False
        