class Solution {
    public int maxArea(int[] height) {
        int max1Idx = 0;
        int max2Idx = height.length - 1;
        int maxVol = Math.min(height[max1Idx], height[max2Idx]) * (max2Idx - max1Idx);
        while (max1Idx < max2Idx) {
            maxVol = Math.max(Math.min(height[max1Idx], height[max2Idx]) * (max2Idx - max1Idx), maxVol);
            if (height[max1Idx] < height[max2Idx]) {
                max1Idx++;
            } else {
                max2Idx--;
            }
        }

        return maxVol;
    }
}