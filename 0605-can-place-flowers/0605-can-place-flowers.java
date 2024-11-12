class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int remainder = n;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                boolean emptyLeft = (i == 0) || (flowerbed[i - 1] == 0);
                boolean emptyRight = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);
                
                if (emptyLeft && emptyRight) {
                    flowerbed[i] = 1;
                    remainder -= 1;
                    if (remainder <= 0) {
                        return true;
                    }
                }
            }

        }

        return remainder <= 0;
    }
}