class Solution(object):
    def intersect(self, nums1, nums2):
        l=[]
        for i in range(len(nums1)):
            if(nums1[i] in nums2):
                l.append(nums1[i])
                nums2.remove(nums1[i])
        return l
        