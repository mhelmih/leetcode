class Solution:
    def climbStairs(self, n: int) -> int:
        cache = {1:1, 2:2}

        def fib(n):
            if n in cache:
                return cache[n]
            if n < 2:
                return n
            
            if n-1 not in cache or n-2 not in cache:
                fib(n-1)
            cache[n] = cache[n-1] + cache[n-2]
            return cache[n]

        return fib(n)