class Solution:
    def fib(self, n: int) -> int:
        cache = {0:0, 1:1}

        def find_fib(n):
            if n < 2:
                return n
            if n - 2 not in cache or n - 1 not in cache:
                find_fib(n-1)

            cache[n] = cache[n-1] + cache[n-2]
            return cache[n]
        
        return find_fib(n)