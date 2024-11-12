class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0;
        int remainder = n;
        while (i < flowerbed.length && remainder > 0) {
            if (flowerbed.length == 1) {
                if (flowerbed[i] == 0) {
                    flowerbed[i] = 1;
                    remainder -= 1;
                } else {
                    i += 1;
                }
            }

            if (i == 0) {
                if (flowerbed[i] == 0) {
                    if (flowerbed[i + 1] == 0) {
                        flowerbed[i] = 1;
                        remainder -= 1;
                        i += 2;
                    } else {
                        i += 3;
                    }
                } else {
                    i += 2;
                }
            }

            if (i > 0 && i < flowerbed.length - 1) {
                if (flowerbed[i] == 0) {
                    if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                        flowerbed[i] = 1;
                        remainder -= 1;
                        i += 2;
                    } else if (flowerbed[i - 1] == 1) {
                        if (flowerbed[i + 1] == 0) {
                            i += 1;
                        } else {
                            i += 3;
                        }
                    } else if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 1) {
                        i += 3;
                    }
                } else {
                    i += 2;
                }
            }

            if (i == flowerbed.length - 1) {
                if (flowerbed[i] == 0 && flowerbed[i - 1] == 0) {
                    flowerbed[i] = 1;
                    remainder -= 1;
                } else {
                    i++;
                }
            }
        }

        System.out.println("remainder: " + remainder);
        System.out.println(Arrays.toString(flowerbed));
        return remainder <= 0;
    }
}