class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        lowest_speed = 1
        highest_speed = max(piles)
        ans = highest_speed

        while lowest_speed <= highest_speed:
            k = (lowest_speed + highest_speed) // 2
            hours = 0
            for pile in piles:
                hours += ceil(pile / k)
            
            if hours <= h:
                ans = k
                highest_speed = k - 1
            else:
                lowest_speed = k + 1
        
        return ans

        