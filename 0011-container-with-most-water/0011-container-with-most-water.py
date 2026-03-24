class Solution:
    def maxArea(self, height: List[int]) -> int:    
        res = 0
        l, r = 0, len(height) - 1

        while l < r:
            w = r - l
            if height[l] <= height[r]:
                h = height[l]
                l += 1
            else:
                h = height[r]
                r -= 1
            
            area = h * w
            res = max(res, area)

        return res