class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int l = 0;
        int r = height.length - 1;
        int h = 0;
        int w = 0;
        int area = 0;
        while (l < r){
            w = r - l;
            if (height[l] < height[r]){
                h = height[l];
                l++;
            }
            else{
                h = height[r];
                r--;
            }

            
            area = h * w;
            if (area > maxArea){
                maxArea = area;
            }
        }
        return maxArea;
    }
}